package com.hacker

object Factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(232); 
  
  
  def power(x:Float,powerTo:Int,acc:Float):Float={
            
            if(powerTo==0)
                return acc
            else
                return power(x,powerTo-1,acc*x)
                
            acc
        };System.out.println("""power: (x: Float, powerTo: Int, acc: Float)Float""");$skip(204); 
        
        def factorial(i:Int,acc:Int):Int={
            if(i==0)
                return acc
            else
                return factorial(i-1,acc*i)
                
            acc
        };System.out.println("""factorial: (i: Int, acc: Int)Int""");$skip(30); val res$0 = 
        
        power(5,2,1);System.out.println("""res0: Float = """ + $show(res$0));$skip(23); val res$1 = 
        factorial(5,1);System.out.println("""res1: Int = """ + $show(res$1))}
}
