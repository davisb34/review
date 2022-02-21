package com.revature.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.revature.exceptions.IncorrectPasswordException;
import com.revature.exceptions.NoUsernameFoundException;
import com.revature.pojo.web.*;
import com.revature.pojos.*;
import com.revature.repositories.*;


@Controller
public class RASController {

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	AssociateRepository associateDao;
	@Autowired
	InterviewRepository interviewDao;
	@Autowired
	JobRepository jobDao;
	@Autowired
	AccountRepository accountDao;
	@Autowired
	ClientRepository clientDao;
	@Autowired
	StatusRepository statusDao;
	@Autowired
	SelectedCompletedRepository selectedCompletedDao;
	@Autowired
	QB_QuestionRepository questionDao;

	@Autowired
	AssociateJobRepository associateJobDao;
	@Autowired
	QB_TopicRepository topicDao;
	@Autowired
	AssociateFeedbackRepositories feedbackDao;

	
	@RequestMapping(value = "/login.do" , method = RequestMethod.GET)
	
	public String login(@RequestParam(value = "logout" , required = false)String logout,
			@RequestParam(value = "error" , required = false) String error)
	{
		System.out.println("fndjkfdkbfdkbdfgdgbdhf");
		
		return "index";
	}
	

	@RequestMapping(value = "/login.do" , method = RequestMethod.POST)
	
	public String loginP(@RequestParam(value = "logout" , required = false)String logout,
			@RequestParam(value = "error" , required = false) String error)
	{
		System.out.println("POST");
		
		return null;
	}
	
/*
	@RequestMapping(value = "/login.do" , method = RequestMethod.POST)
	public String loginA(ModelMap model, HttpServletRequest request)
	{
		System.out.println("dddddddddddddddddddddddddddddddddddddddddddddddddd");
		
		return "index";
	}*/
	
	/*@RequestMapping(path = "/login.do", method = RequestMethod.POST)
    public String getlogin(ModelMap model, HttpServletRequest request) {
		// get values from form
		final String username = request.getParameter("lg_username");
		final String password = request.getParameter("lg_password");
		// check if user is in database or not and if so, what kind of
		// user role.
		Associate temp = null;
		String loadPage = "index";
		try {
			temp = associateDao.findByUsername(username);
			System.out.println(temp);
			if (temp == null) {
				throw new NoUsernameFoundException();
			} else if (temp.getPassword().equals(password)) {
				loadPage = "corepage";
				request.getSession().setAttribute("user", temp);
			} else {
				throw new IncorrectPasswordException();
			}
		} catch (IncorrectPasswordException e) {
			System.out.println("Incorrect Password");
			model.addAttribute("mainMessage", "Incorrect Password");
		} catch (SQLSyntaxErrorException e) {
			System.out.println("SQLSyntaxErrorException");
			model.addAttribute("mainMessage", "Unable to connect to server");
		} catch (NoUsernameFoundException e) {
			System.out.println("No Username found");
			model.addAttribute("mainMessage", "Incorrect Username");
		}
  
		return null;
	}


		return loadPage;
	}*/

	@RequestMapping(path = "/submitFeedback.do", method = RequestMethod.POST)
	public String submitFeedback(ModelMap model, HttpServletRequest request) {
		// get values from form
		final String clientName = request.getParameter("clientName");
		final String jaq = request.getParameter("jaq");
		final Integer interviewId = Integer.parseInt(request.getParameter("interviewId"));
		final Float interviewLength = Float.parseFloat(request.getParameter("fb_length"));
		final Integer interviewDifficulty = Integer.parseInt(request.getParameter("fb_difficulty"));

		Gson gson = new Gson();
		ArrayList<SubjectQuestion> sq = gson.fromJson(jaq, new TypeToken<ArrayList<SubjectQuestion>>() {
		}.getType());

		Associate user = (Associate) request.getSession().getAttribute("user");

		List<QB_Question> questions = questionDao.findAll();

		QB_Question tempQ = null;
		AssociateFeedback tempF = new AssociateFeedback(null, interviewDifficulty, interviewLength,
				user.getAssociateId(), interviewId);
		feedbackDao.save(tempF);

		long millis = System.currentTimeMillis();

		for (SubjectQuestion question : sq) {
			boolean save = true;
			for (QB_Question dbq : questions) {
				if (question.getQuestion().equals(dbq.getqString())) {
					save = false;
					dbq.setTimesAsked((dbq.getTimesAsked() + 1));
					questionDao.save(dbq);
				}
			}
			if (save) {
				tempQ = new QB_Question(null, question.getQuestion().trim(), new java.sql.Date(millis), 1,
						topicDao.findByTString(question.getSubject().trim()).getTopicId(),
						clientDao.findByClientName(clientName.trim()).getClientId());
				questionDao.save(tempQ);
			}
		}

		String loadPage = "corepage";

		System.out.println("submitting feedback");

		return loadPage;
	}


	@ResponseBody
	@RequestMapping(path = "getquestion.do", method = RequestMethod.POST)
	public String getquestions(ModelMap model, HttpServletRequest request) {

		
		List<QB_Question> qb = new ArrayList<QB_Question>();
		qb = questionDao.findAll();

		List<Client> cli = new ArrayList<Client>();
		cli = clientDao.findAll();

		List<QB_Topic> top = new ArrayList<QB_Topic>();
		top = topicDao.findAll();

		List<InterviewQuestion> quest = new ArrayList<InterviewQuestion>();

		String tempTopic = "";

		String tempclientName = "";

		for (QB_Question q : qb) {
			for (QB_Topic t : top) {
				if (q.getTopicId().equals(t.getTopicId())) {
					tempTopic = t.gettString();
					break;
				}

			}

			for (Client c : cli) {
				if (q.getClientId().equals(c.getClientId())) {
					tempclientName = c.getClientName();
					break;
				}

			}

			quest.add(new InterviewQuestion(q.getqString(), tempTopic, q.getTimesAsked(), q.getLastUpdated(),
					q.getClientId(), tempclientName, q.getTopicId()));
		}

		Gson gson = new Gson();

		return gson.toJson(quest);

	}

	@RequestMapping(path = "submitques.do", method = RequestMethod.POST)
	public String insertQuestion(ModelMap model, HttpServletRequest request) {
		final String questionstr = request.getParameter("questionstr");
		final String topic = request.getParameter("topic");
		// TO DO: REPLACE WITH THE REAL PAGE NAME
		String loadPage = "questionbank";
		try {
			// Optional<QB_Question> newQuestion =
			// questionDao.findByQString(questionstr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loadPage;
	}
//Spring Security Related methods -- redirecting to home and core page via url
@RequestMapping (path = "/core.do" , method = RequestMethod.GET)
public String redirectCore(ModelMap model, HttpServletRequest request)
{
	return "corepage";
	
}


@RequestMapping(value = "/login.do?logout" , method = RequestMethod.GET)
public String logout(ModelMap model, HttpServletRequest request)
{
	System.out.println("Logging out.......");
	model.put("Logout", "Logging out.......");
	return "index";
}



	@ResponseBody
	@RequestMapping(path = "interviews.do", method = RequestMethod.POST)
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public String getInterviews(ModelMap map, HttpServletRequest request) {
		Gson gson = new Gson();

		Associate user = (Associate) request.getSession().getAttribute("user");


		System.out.println("getting interview data for associate id: " + user.getAssociateId());

		List<com.revature.pojo.web.Interview> interviews = new ArrayList();

		Session session = entityManager.unwrap(Session.class);

		session.doWork(new Work() {

			@Override
			public void execute(Connection conn) throws SQLException {

				try {
					String sql = "{call GetInterviewData(?,?)}";
					CallableStatement cs = conn.prepareCall(sql);
					cs.setInt(1, user.getAssociateId());
					cs.registerOutParameter(2, -10);
					cs.execute();

					ResultSet rs = (ResultSet) cs.getObject(2);

					while (rs.next()) {
						interviews.add( new com.revature.pojo.web.Interview(
						rs.getInt(1),
						rs.getDate(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getInt(8))
								);						
					}

					rs.close();
					cs.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("SQL Exception when grabbing interviews");
				}
				
			}

		});

		return gson.toJson(interviews);
	}

	@ResponseBody
	@RequestMapping(path = "applications.do", method = RequestMethod.POST)
	public String getApplications(ModelMap map, HttpServletRequest request) {
		Gson gson = new Gson();

		Associate user = (Associate) request.getSession().getAttribute("user");
		List<AssociateJob> queryApplications = associateJobDao.findByAssociateId(user.getAssociateId());
		List<Application> applications = new ArrayList();

		for (AssociateJob application : queryApplications) {
			Job job = jobDao.findOne(application.getJobId());
			Account account = accountDao.findOne(job.getAccountId());
			Client client = clientDao.findOne(account.getClientId());
			applications.add(new Application(job.getTitle(), client.getClientName()));
		}

		return gson.toJson(applications);
	}

	@ResponseBody
	@RequestMapping(path = "placements.do", method = RequestMethod.POST)
	public String getPlacements(ModelMap map, HttpServletRequest request) {
		Gson gson = new Gson();
		Associate user = (Associate) request.getSession().getAttribute("user");
		List<SelectedCompleted> queryPlacements = selectedCompletedDao.findByAssociateId(user.getAssociateId());
		List<Placement> placements = new ArrayList();
		for (SelectedCompleted placement : queryPlacements) {
			Job job = jobDao.findOne(placement.getJobId());
			Account account = accountDao.findOne(job.getAccountId());
			Client client = clientDao.findOne(account.getClientId());
			placements.add(new Placement(client.getClientName(), placement.getAddress(),
					placement.getSelectedTimeToStartDate().toString()));
		}

		return gson.toJson(placements);
	}

	@ResponseBody
	@RequestMapping(path = "getTopic.do", method = RequestMethod.POST)
	public String gettopics(ModelMap model, HttpServletRequest request) {
		List<QB_Topic> top = new ArrayList<QB_Topic>();
		top = topicDao.findAll();

		Gson gson = new Gson();

		return gson.toJson(top);
	}



	@ResponseBody
	@RequestMapping(path = "getClients.do", method = RequestMethod.POST)
	public String getClients(ModelMap model, HttpServletRequest request) {
		List<Client> cli = new ArrayList<Client>();
		cli = clientDao.findAll();

		Gson gson = new Gson();

		return gson.toJson(cli);
	}

}
