package com.hacker

object AngryChildren {
    
    def main(args:Array[String])={
        var N = Console.readLine.toInt
        var K = Console.readLine.toInt
        var i = 0
        var packets = new Array[Long](N)
        
        for(i<-0 to N-1){
            packets(i) = Console.readLine.toLong
        }
        
        var newpackets = divideAndConquer(packets)
        
        /*for(i<-0 to N-1)
          println(newpackets(i))*/
        println(iterateFairness(newpackets,K))

        
    }
    
    def divideAndConquer(packet:Array[Long]):Array[Long]={
    	
    	var length = packet.length
    	
    	if(length == 1)
    	  return packet;
    	  
    	  var packet1 = new Array[Long](length/2)
    	  var lengthPacket2 = 0
    	  
    	  if(length%2 != 0)
    	    lengthPacket2 = length / 2 + 1
    	    else
    	      lengthPacket2 = length / 2 
    	    
    	  var packet2 = new Array[Long](lengthPacket2)
    	  
    	  Array.copy(packet, 0, packet1, 0, length/2)
    	  
    	  Array.copy(packet,length/2,packet2,0,lengthPacket2)
    	    
    	  var packet3 = divideAndConquer(packet1)
    	  var packet4 = divideAndConquer(packet2)
    	  
    	  var packet5 = merge(packet3,packet4)
      packet5
    }
    
    def merge(packet3:Array[Long],packet4:Array[Long]):Array[Long]={
    	
    	var length = packet3.length + packet4.length
    	  var i = 0
    	  var j = 0
    	  var k = 0
    	  var packet5 = new Array[Long](length)
    	  
    	  while(i < length){
    	    
    	   if(j < packet3.length && ((k < packet4.length && packet3(j) <= packet4(k)) || k >=  packet4.length)){
    		   packet5(i) = packet3(j);
    	   		j = j + 1;
    	   }else if(k < packet4.length && ((j< packet3.length && packet4(k)<=packet3(j)) || j>= packet3.length)){
    	    	packet5(i)= packet4(k);
    	    	k=k+1
    	   }
    	     i = i + 1
    	  }
    	packet5
    }
    
    def iterateFairness(packet:Array[Long],k:Int):Long = {
      
      var min:Long = packet(packet.length-1) - packet(0)
      var i = 0
      while(i < packet.length && (i+k-1) < packet.length){
        var diff = packet(i+k-1)- packet(i)
        if(diff < min)
          min = diff;
        
        i +=1
      }
      min
    }
}