var myApp = angular
		.module('myApp', [ 'angularUtils.directives.dirPagination' ]);

function MyQuestionBank($scope, $http) {
	$scope.currentPage = 1;
	$scope.pageSize = 10;
	$scope.questions = [];

	$http.post("getQuestion.do").then(

	function(data) {
		$scope.result = angular.fromJson(data);

		angular.forEach(data.data, function(value, key) {

			$scope.questions.push(value);

		});
		console.log(data.data);
	});

	

	$scope.pageChangeHandler = function(num) {
		console.log('Question page changed to ' + num);
	};
}

function OtherController($scope) {
	$scope.pageChangeHandler = function(num) {
		console.log('going to page ' + num);
	};
}
myApp.controller('MyQuestionBank', MyQuestionBank);
myApp.controller('OtherController', OtherController);