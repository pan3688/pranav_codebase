package com.hacker

object Solution extends App {

    
    def utopian()= {
    
        var i = Console.readLine.toInt
        
        var j = 0;
        for(j <-1 to i){
        	var height = 1;
            var k = Console.readLine.toInt
            //k = k.toInt
            var l = 0;
            for(l <-1 to k if k >0){
            
                if(l>0 && l % 2 ==0)
                    height = height + 1;
                else
                    height = 2 * height;
            }
            println(height);
        }
    }
    
    utopian()
}