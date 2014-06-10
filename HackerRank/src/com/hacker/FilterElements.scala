package com.hacker
import scala.collection.mutable.ArrayBuffer

object FilterElements {
	
	def main(args:Array[String])={
       
        for(i<-0 to readInt()-1){ 
          
            var input:Array[Int] = readLine().split(" ").map(x => x.toInt)
            /*println(input(0) + ":" + input(1))*/
            var inputList:Array[Long] = readLine.split(" ").map(x => x.toLong)
            var outList:ArrayBuffer[Long] = new ArrayBuffer[Long]
            
            for(i<- 0 to input(0)-1){
              var counter = 0
              
              for(j<-i to input(0) - 1){
            	  
            	  if(inputList(i) == inputList(j))
            	    counter += 1
                
              }
              
              if(counter >= input(1) && !outList.contains(inputList(i)))
                outList.append(inputList(i))
              
            }
            
            if(outList.size == 0)
              print("-1")
            else{
              
              for(i<-0 to outList.size-1)
                print(outList(i) + " ")
              
            }
            println()
        }
        
    }
  
}