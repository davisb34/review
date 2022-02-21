<section class="well">
	<div class="panel-group" id="accordion">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title">
					<a id="collapse1Dropdown" data-toggle="collapse"
						data-parent="#accordion" href="#collapse1">Submitted
						Applications</a>
				</h2>
			</div>
			<div id="collapse1" class="panel-collapse collapse">
				<div class="panel-body">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Job Title</th>
								<th>Client Name</th>
							</tr>
						</thead>
						<tbody ng-controller="getApplications">
							<tr ng-repeat="application in applications">
								<td>{{application.jobTitle}}</td>
								<td>{{application.clientName}}</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title">
					<a id="collapse2Dropdown" data-toggle="collapse"
						data-parent="#accordion" href="#collapse2">Scheduled
						Interviews</a>
				</h2>
			</div>
			<div id="collapse2" class="panel-collapse collapse">
				<div class="panel-body">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Client Name</th>
								<th>Job Title</th>
								<th>Interview Date</th>
								<th>Interview Time</th>
								<th>Type Of Interview</th>
								<th>Status</th>
								<th>Submit Feedback</th>
							</tr>
						</thead>
						<tbody ng-controller="getInterviews">
							<tr ng-repeat="interview in interviews">
								<td>{{interview.clientName}}</td>
								<td>{{interview.jobTitle}}</td>
								<td>{{interview.date}}</td>
								<td>{{interview.time}}</td>
								<td>{{interview.type}}</td>
								<td>{{interview.status}}</td>
								<td>
									<form action="submitFeedback.do" method="post">
										<!-- include the modal for feedback -->
										<jsp:include
											page="interviewFeedbackModal.jsp"></jsp:include>
										<input type="hidden" name="clientName"
											value="{{interview.clientName}}" /> <input type="hidden"
											name="interviewId" value="{{interview.id}}" />
										<!-- button to pop up modal -->
										<button type="button" class="btn btn-info btn-lg"
											data-toggle="modal" data-target="#feedback-modal"
											id="modal-button" ng-show="interview.showButton">Feedback</button>
									</form>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title">
					<a id="collapse3Dropdown" data-toggle="collapse"
						data-parent="#accordion" href="#collapse3">Placements</a>
				</h2>
			</div>
			<div id="collapse3" class="panel-collapse collapse">
				<div class="panel-body">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Client Name</th>
								<th>Working Address</th>
								<th>Start Date</th>
							</tr>
						</thead>
						<tbody ng-controller="getPlacements">
							<tr ng-repeat="placement in placements">
								<td>{{placement.name}}</td>
								<td>{{placement.workAddress}}</td>
								<td>{{placement.startDate}}</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</section>