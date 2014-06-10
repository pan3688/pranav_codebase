package com.hacker

object Sherry {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(484); 
  
  def test(number:Int)={
 //  var i = Console.readLine.toInt
        var j = 0
        
 //       for(j <- 1 to i){
 //           var number = Console.readLine.toInt
                
            var numberOfFive = numberOfFiveMethod(number)
            var numberOfThree = number - numberOfFive
            if(numberOfFive == -1 || (number%3 !=0 && numberOfFive == number))
              println("-1")
            else
              printFinal(number,numberOfFive)
 //      	}
  };System.out.println("""test: (number: Int)Unit""");$skip(285); 
  def printFinal(number:Int,numberOfFive:Int)={
	  	var i = 1
	  	var fiveCounter = 1
	  	for(i <- 1 to number){
	  		
	  		if(fiveCounter <= numberOfFive){
	  		  print("5")
	  		  fiveCounter = fiveCounter + 1
	  		}else{
	  		  print("3")
	  		}
	  	  
	  	}
	  	println()
	  	
  };System.out.println("""printFinal: (number: Int, numberOfFive: Int)Unit""");$skip(464); 
  def numberOfFiveMethod(number:Int):Int = {
    
	  var l = 5
	  var returnValue = number
	  
	  if(l > number && number % 3 !=0)
	    return -1
	    
	  while(l <= number){
	    
	    // number = 5x + 3y  where x is number of threes and y is number of fives
	    
	    if(returnValue % 3 ==0){
	      l = number
	    }else if((number - l) % 3 ==0){
	      returnValue = returnValue - l
	      l = number
	    }else{
	    }
	    l = l + 5
	  }
	  returnValue
  };System.out.println("""numberOfFiveMethod: (number: Int)Int""");$skip(17); 
  
  test(96635)}
}
