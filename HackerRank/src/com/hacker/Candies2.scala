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
            
            if(a<b && increment<0)
              increment = 1
            else if(a<b)
              increment+=1
            else if(a==b)
                increment = 0
            else if(a>b && increment > 0)
            	increment = -1
            else if(a>b)
            	increment -=1
            
            if(increment < 0)
              increment = -increment
            
            candies +=increment
            a=b
       
        }
        println(candies)
        println(lineCounter)
    }
}