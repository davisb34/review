// the function that opens the nav bar
function openNav() {
	
	//get the nav bar and set its width to 250px 
    document.getElementById("mySidenav").style.width = "250px";
    
    // get the main div and move it over by 250px
    document.getElementById("main").style.marginLeft = "250px";
}

// the function that closes the nav bar
function closeNav() {
    
	//get the nav bar and set its width to 0px
	document.getElementById("mySidenav").style.width = "0";
    
	// get the main div and move it back over to the 0px position
	document.getElementById("main").style.marginLeft= "0";
}

// this function just toggles the navbar
function toggleNav(){
	
	// get the value of the navbar state open or close
	var navbarState = document.getElementById("mySidenav").style.width;
		
	//if the value is open
	if(navbarState == 0 || navbarState == "0px"){
			
		// open the navbar and change button value to close
		openNav();
		
		// if we opened the navbar change the text to close
	    //document.getElementById("opennav").innerHTML = "&#9776; close";
	}
	//else if the value is closed
	else if (navbarState == "250px"){
		
		// close the navbar and change button value to open
		closeNav();
		
		// if we closed the navbar change the text to open
	    //document.getElementById("opennav").innerHTML = "&#9776; open";
	}
}