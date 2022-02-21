
var myApp = angular.module('myApp', ['angularUtils.directives.dirPagination']);



function MyQuestionBank($scope,$http)
{
  $scope.currentPage = 1;
  $scope.pageSize = 10;
  $scope.questions=[];
  $scope.topics=[];
  $scope.clients=[];
  $scope.orderByTopic = "qString";
  $scope.tempTopicId ="";
  $scope.resettopic={"tString" : "All Topics","topicId" : "" };
  $scope.resetclient={"clientId" : "","clientName" : "All Clients" , "ClientAvgStartDate" : "" };
 
  $http.post("getTopic.do").then
  (
		 function(topicdata){
			 
			 angular.forEach(topicdata.data, function(value,key)
                     { 
             		/*	console.log(value);
             			console.log(value.tString);*/
                     $scope.topics.push(value);
                     
                     }); 
			 $scope.topics.push($scope.resettopic);
		
		 });
  console.log($scope.topics);
  
  
  $http.post("getClients.do").then
  (
		 function(clientdata){
			 
			 angular.forEach(clientdata.data, function(value,key)
                     { 
             		/*	console.log(value);
             			console.log(value.tString);*/
                     $scope.clients.push(value);
                     
                     }); 
			 $scope.clients.push($scope.resetclient);
		
		 });
  console.log($scope.clients);
  
  
  
    $http.post("getquestion.do").then(
        
             function(data){
            $scope.result = angular.fromJson(data);
           
                angular.forEach(data.data, function(value,key)
                        { 
                			
                	
                        $scope.questions.push(value);
                        
                        }); 

                
                        }); 
    console.log($scope.questions);
    $scope.pageChangeHandler = function(num) {
      console.log('Question page changed to ' + num);
    };
    
 /*   
    angular.forEach($scope.topics,function(value,key)
    		{
    	  
    	
    		if(value.tString===$scope.filtertopic.tString)
    			{console.log(value.tString);
    			console.log($scope.filtertopic.tString);
    			
    			$scope.tempTopicId=value.topicId;
    			console.log($scope.tempTopicId);
    			}
    		});
    		}*/

    
    
    $scope.setOrderBy=function(sortName)
    		{
    			if($scope.orderByTopic === sortName )
    			{
    				$scope.orderByTopic = '-' + sortName;
    			}
    			else if ($scope.orderByTopic === '-' + sortName)
    			{
    				$scope.orderByTopic = sortName;
    			}
    			else 
    			{
    				$scope.orderByTopic = sortName;
    			}
    		};
    
    
    
}

function OtherController($scope) {
  $scope.pageChangeHandler = function(num) {
    console.log('going to page ' + num);
  };
}
myApp.controller('MyQuestionBank',MyQuestionBank);
myApp.controller('OtherController', OtherController);