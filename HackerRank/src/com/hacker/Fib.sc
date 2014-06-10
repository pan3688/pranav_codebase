package com.hacker
import scala.collection.mutable.ArrayBuffer

object Fib {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def test(x:Long):Boolean={
     
  //      var N:Int = Console.readLine.toInt
        var arrayOfFib:ArrayBuffer[Long] = new ArrayBuffer[Long]
        
        var a:Long = 0
        var b:Long = 1
        var acc:Long = 0
        var isFib:Boolean = false
        
        arrayOfFib.append(a)
        arrayOfFib.append(b)
        
            
        var i = 1
            
   //     for(i<-1 to N){
            
      //      var x = Console.readLine.toLong
            
            var length = arrayOfFib.length
        
		        if(arrayOfFib.contains(x))
		        	isFib = true
		        else if(!arrayOfFib.contains(x) && arrayOfFib(length-1)>x)
		        	isFib = false
		        else if(arrayOfFib(length-1) < x){
		        	
		        	a = arrayOfFib(length-2)
		        	b= arrayOfFib(length-1)
		        	
			        while(acc<x || acc==x){
			            
			            acc = a + b
			            
									a = b
									b = acc
			            
			            arrayOfFib.append(acc)
			            
			            if(acc==x)
			                isFib = true
			            
			        }
		       }
         isFib
            
 //       }
    }                                             //> test: (x: Long)Boolean

test(701408733L)                                  //> res0: Boolean = true
/*  def isFibo(x:Long):Boolean={
        
        var a:Long = 0
        var b:Long = 1
        var acc:Long = 0
        
        
        arrayOfFib.append(a)
        arrayOfFib.append(b)
        
        var length = arrayOfFib.length
        
        if(arrayOfFib.contains(x))
        	return true
        else if(!arrayOfFib.contains(x) && arrayOfFib(length-1)>x)
        	return false
        else if(arrayOfFib(length-1) < x){
        	
        	a = arrayOfFib(length-2)
        	b= arrayOfFib(length-1)
        	
	        while(acc<x || acc==x){
	            
	            acc = a + b
	            
							a = b
							b = acc
	            
	            arrayOfFib.append(acc)
	            
	            if(acc==x)
	                return true
	            
	        }
        }
        false
    }
 */
}