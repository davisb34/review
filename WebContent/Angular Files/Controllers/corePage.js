/**
 * 
 */
function getInterviews($scope, $http) {
	$http.post("interviews.do").success(function(data) {
		$scope.interviews = data;
	});
}

function getApplications($scope, $http){
	$http.post("applications.do").success(function(data){
		$scope.applications = data;
	});
}

function getPlacements($scope, $http){
	$http.post("placements.do").success(function(data){
		$scope.placements = data;
	})
}

app.controller("getInterviews", getInterviews);
app.controller("getApplications", getApplications);
app.controller("getPlacements", getPlacements);