package com.hacker
import scala.io.Source

object Candies2 {

    def main(args:Array[String])={
        
    	var N = 100000
    
        var a = 38726
        var b = 0
        var increment = 0
            
        var candies = N
        var lineCounter = 0
        var spike = 0
        var j =0
            
        for(line<- Source.fromFile("C:\\Users\\Pranav\\Desktop\\inputCandies.txt").getLines()){
            
            b = line.toInt
            lineCounter +=1
           
            if(a<b && increment<=0){
              candies +=1
              increment = 1
              spike  = 0
        	}else if(a<b && increment >0){
              
        	  increment+=1
        	  candies +=increment
              spike = 0
            }
            
            if(a==b)
                increment = 0
            
                
            if(a>b && increment > 0){
            	spike = increment
            	increment = 0
            	j=0
            //	candies +=1
            }else if(a>b && increment <=0){
            	
            	increment -=1
            	if((-increment) >= spike && spike!=0){
         //   	 println("Spike @" + b + ":" +spike)
            
            	  if(j==0)
            	    candies = candies + spike
            	  else{
            	    candies +=1
            	//    spike = 0
            	  }
            	 	j +=1
            	}
            	
            	candies = candies - increment
            }
            
            a=b
       
        }
        println(candies)
        println(lineCounter)
    }
}