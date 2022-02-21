// this controller handles the display text and the time updating/ switching
app.controller('myCtrl3', function($scope, $timeout, $interval) {
	
	// set what the header is initially
	$scope.myHeader = "You look great!";
	  
	  //update the display text every 9 seconds
	  $interval(function () {
	    	
		  	// if the header is this then
	    	if($scope.myHeader == "How are you today?"){
	    		
	    		// set what the new display text is
	    		$scope.myHeader = "You look great!";
	        }
	    	// otherwise if the header is this then
	        else if( $scope.myHeader == "You look great!"){
	        	
	        	// set what the new display text is
	        	$scope.myHeader = "How are you today?";
	        }
	  // set the time interval as the second perameter
	  }, 9000);
	  
	  // set the inital time variable to what the current time is
	  $scope.theTime = new Date().toLocaleTimeString();
	  
	  // update the time every second
	  $interval(function () {
		  
		  //set the time variable inside the interval
	      $scope.theTime = new Date().toLocaleTimeString();
	  
	  // set the time interval as the second perameter
	  }, 1000);
	});