/**
 *  This file is used for sorting project
 */

function genrateRandomNumbers() {
	var numbersToGenerate = document.getElementById("randomNumberCount").value;
	if(numbersToGenerate <1 || numbersToGenerate >500){
		alert("Currently System supports 1 to 500 Numbers");
		return;
	}
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	  var randomNumbers = this.responseText;
    	  console.log(randomNumbers);
    	  if (typeof(Storage) !== "undefined") {
    		  localStorage.setItem("randomNumbers", randomNumbers);
    		} else {
    			console.error("No support for local storage upgrade to new browser");
    		}

      document.getElementById("random-numbers").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", "/api/v1/generateRandomNumbers/"+numbersToGenerate, true);
  xhttp.send();
}

function sortNow(){
	  var randomNumbers ;  
	if (typeof(Storage) !== "undefined") {
		randomNumbers = localStorage.getItem("randomNumbers");
		  console.log(randomNumbers);
		} else {
			console.error("No support for local storage upgrade to new browser");
		}
	
	  var data = "{\"data\":"+randomNumbers+"}";
	  console.log(data);

	var xhttp = new XMLHttpRequest();
	
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	   var result = JSON.parse(this.responseText);
	    	   
	    	   console.log(result);
	    	   var tracker = JSON.stringify(result.swapTracker);
	    	   resultHTML = "<strong>Time Required for Sorting is : </strong> "+ result.timeTakenInMilliSeconds + "<br>"
	    	   resultHTML =resultHTML+ "<strong>Sorted Array Is : => </strong>" + result.data + "<br>";
	    	   resultHTML = resultHTML+ "<strong>Numbers Swapped are </strong><br> " + tracker;
	      document.getElementById("sorted-numbers").innerHTML = resultHTML;
	      
	    }
	  };
	  xhttp.open("POST", "/api/v1/sortNumbers", true);
	  xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
	  xhttp.send(data);
	  
}


function showHistory(){
	var xhttp = new XMLHttpRequest();
	
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	   var result = JSON.parse(this.responseText),
	    	   resultList = result.sortedList;
	    	   var htmlText="";
	    	   for (var i=0; i<resultList.length; i++) { 
	    		   var result = resultList[i];
	    		   htmlText= htmlText +"Input: " + JSON.stringify(result.orignalInput) +"<br>";
	    		   htmlText = htmlText + "timeTakenToSort: " + JSON.stringify(result.timeTakenToSort) + "<br>";
	    		   htmlText = htmlText + "sortedArray: " + JSON.stringify(result.sortedArray) +"<br>";
	    		   htmlText = htmlText + "swapTracking: " + JSON.stringify(result.swapTracking) + "<br>";
	    		   htmlText = htmlText + "<hr>"
	    		    
	    	    }
	    	   
	      document.getElementById("sorted-numbers").innerHTML = htmlText;
	      
	    }
	  };
	  xhttp.open("GET", "/api/v1/history", true);
	  xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
	  xhttp.send();

}
