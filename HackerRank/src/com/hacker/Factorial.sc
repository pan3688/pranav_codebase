package com.hacker

object Factorial {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def power(x:Float,powerTo:Int,acc:Float):Float={
            
            if(powerTo==0)
                return acc
            else
                return power(x,powerTo-1,acc*x)
                
            acc
        }                                         //> power: (x: Float, powerTo: Int, acc: Float)Float
        
        def factorial(i:Int,acc:Int):Int={
            if(i==0)
                return acc
            else
                return factorial(i-1,acc*i)
                
            acc
        }                                         //> factorial: (i: Int, acc: Int)Int
        
        power(5,2,1)                              //> res0: Float = 25.0
        factorial(5,1)                            //> res1: Int = 120
}