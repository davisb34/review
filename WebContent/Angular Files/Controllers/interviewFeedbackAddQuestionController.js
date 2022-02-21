// this controller handles the display of current questions and the addition of new questions to the interview feedback page 
app.controller('myCtrl', function($scope, $http) {

	
	
	$http.post("getTopic.do").success(function(data){
		$scope.subjects = data;

	});
	
	
	
	// this function handles adding the new user submitted question to the list of user submitted questions
	$scope.myFunction = function() {

		
		// add the question object to the array of new question objects
		$scope.JustAddedQuestions.push({
			subject : $scope.selectedSubject.tString,
			question : $scope.newQuestion
		});
	}

	// instantiate the array of new questions
	$scope.JustAddedQuestions = [];

	//this function removes a element from the new questions you added
	$scope.removeQuestion = function(y) {

		// remove the element at index of y 
		$scope.JustAddedQuestions.splice( $scope.JustAddedQuestions.indexOf(y), 1 );
	}

});
