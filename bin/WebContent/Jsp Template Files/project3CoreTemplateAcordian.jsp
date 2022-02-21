<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div class="panel-group" id="accordion">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title">
					<a id = "collapse1Dropdown" data-toggle="collapse" data-parent="#accordion"
						href="#collapse1">Submitted Applications</a>
				</h2>
			</div>
			<div id="collapse1" class="panel-collapse collapse">
				<div class="panel-body">

					<h2>Submitted Applications</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Application ID</th>
								<th>Job Title</th>
								<th>Client Name</th>
								<th>Action(Edit/Delete)</th>
							</tr>
						</thead>
						<tbody>
							<!-- 8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 -->
							<c:forEach items="${sessionScope.allpendingRequests}"
								var="request">
								<tr>
									<td><c:out value="${request.getId()}"></c:out></td>
									<td><c:out value="${request.getAmount()}"></c:out></td>
									<td><c:out value="${request.getDescription()}"></c:out></td>
									<td class="warning"><select name="statuschoice"
										class="disabledInput" disabled>
											<c:forEach items="${sessionScope.allReimbursementStatus}"
												var="ReimbursementStatus">
												<option value="${ReimbursementStatus.getId()}">${ReimbursementStatus.getStatus()}</option>
											</c:forEach>
									</select></td>
								</tr>
							</c:forEach>
							<!-- 88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 -->
						</tbody>
					</table>

				</div>
			</div>
		</div>
		<!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title">
					<a id = "collapse2Dropdown" data-toggle="collapse" data-parent="#accordion"
						href="#collapse2">Scheduled Interviews</a>
				</h2>
			</div>
			<div id="collapse2" class="panel-collapse collapse">
				<div class="panel-body">

					<h2>Scheduled Interviews</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Interview Id</th>
								<th>Client Name</th>
								<th>Job Number</th>
								<th>Job Title</th>
								<th>Interview Time</th>
								<th>Type Of Interview</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							<!-- 8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 -->
							<c:forEach items="${sessionScope.allresolvedrequests}"
								var="resolved">
								<tr>
									<td><c:out value="${resolved.getId()}"></c:out></td>
									<td><c:out value="${resolved.getAmount()}"></c:out></td>
									<td><c:out value="${resolved.getDescription()}"></c:out></td>
									<td><c:out value="${resolved.getDatesubmitted()}"></c:out></td>
									<td><c:out value="${resolved.getDateresolved()}"></c:out></td>
									<td><c:out value="${resolved.getAuthorid()}"></c:out></td>
									<td><c:out value="${resolved.getResolverid()}"></c:out></td>
								</tr>
							</c:forEach>
							<!-- 88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 -->
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->
		<!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx -->
		<!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->
		

			<div class="panel panel-default">
				<div class="panel-heading">
					<h2 class="panel-title">
						<a id = "collapse3Dropdown" data-toggle="collapse" data-parent="#accordion"
							href="#collapse3">Placements</a>
					</h2>
				</div>
				<div id="collapse3" class="panel-collapse collapse">
					<div class="panel-body">

						<h2>Placements</h2>
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Placement ID</th>
									<th>Client Name</th>
									<th>Working Address</th>
									<th>Start Date</th>
								</tr>
							</thead>
							<tbody>
								<!-- 8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 -->
								<c:forEach items="${sessionScope.singleemployeerequests}"
									var="singleemployee">
									<tr>
										<td><c:out value="${singleemployee.getId()}"></c:out></td>
										<td><c:out value="${singleemployee.getAmount()}"></c:out></td>
										<td><c:out value="${singleemployee.getDescription()}"></c:out></td>
										<td><c:out value="${singleemployee.getDatesubmitted()}"></c:out></td>
									</tr>
								</c:forEach>
								<!-- 88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888 -->
							</tbody>
						</table>
					</div>
				</div>
			</div>
		
		<!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->
		<!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx -->
	</div>

</body>
</html>