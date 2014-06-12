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
            
        for(line<- Source.fromFile("C:\\Users\\Pranav\\Desktop\\inputCandies.txt").getLines()){
            
            b = line.toInt
            lineCounter +=1
           
            
            /*if(a<b && increment<=0){
              candies +=1
              increment = 1
        	}else if(a<b && increment >0){
              
        	  increment+=1
        	  candies +=increment
              
            }
            
            if(a==b)
                increment = 0
            
                
            if(a>b && increment > 0){
            	spike = increment
            	increment = 0
            	candies +=1
            }else if(a>b && increment <=0){
              
            	increment -=1
            	
            	if((-increment) == spike && spike!=0){
            	//  println(spike)
            	  candies -= spike
            	  spike = 0
            	}
            	
            	candies = candies - increment
            }*/
            
            if(a<b && increment<=0){
              candies +=1
              increment = 1
        	}else if(a<b && increment >0){
              
        	  increment+=1
        	  candies +=increment
              
            }
            
            if(a==b)
                increment = 0
            
                
            if(a>b && increment > 0){
            	spike = increment
            	increment = 0
            //	candies +=1
            }else if(a>b && increment <=0){
            	
            	increment -=1
            	if((-increment) >= spike && spike!=0){
//            	 println(b + ":" +spike)
            
            	  candies +=1
            	//  spike = 0
            	}
            	
            	candies = candies - increment
            }
            
            a=b
       
        }
        println(candies)
        println(lineCounter)
    }
}