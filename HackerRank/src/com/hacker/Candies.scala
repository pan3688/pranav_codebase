package com.hacker
import scala.io.Source

object Candies {

    def main(args:Array[String])={
        
    	var N = readInt()
    
        var a = readInt()
        var b = 0
        var increment = 0
            
        var candies = N
        var offset  = 0
        var spike = 0
        
        for(i<-0 to N-2){
            
            b = readInt()
            
            if(a<b && increment <0){
            	increment = 0
            	spike = 0
            }else if(a<b && increment >=0){
                increment += 1
                candies += increment
            }
            
            if(a>b && increment > 0){
            	spike = increment
            	increment = -1
            }else if(a>b && increment <=0){
              
              increment -=1
              
              if((-increment) >= spike){
                candies = candies+ 1
              }
              
              candies = candies - increment
            }
            
            
            if(a==b){
              increment=0
              spike = 0
            }
            a=b
        //    println(b + ":" + increment)
            
        }
        println(candies)
    }
}