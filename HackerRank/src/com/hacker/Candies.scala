package com.hacker
import scala.io.Source

object Candies {

    def main(args:Array[String])={
        
    	var N = readInt()
    
        var a = readInt()
        var b = 0
        var increment = 0
            
        var candies = N
        var j  = 0
        var spike = 0
        
        for(i<-0 to N-2){
            
            b = readInt()
            
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
            	if((-increment) > spike && spike!=0){
            	 println("Spike @" + b + ":" +spike)
            
            	  if(j==0)
            	    candies = candies + spike
            	  else{
            	    candies +=1
            	    spike = 0
            	  }
            	 	j +=1
            	}
            	
            	candies = candies - increment
            }
           
           a=b
           println(b + ":" + increment)
 //          println(b + ":" + candies)
 //           
        }
        println(candies)
    }
}