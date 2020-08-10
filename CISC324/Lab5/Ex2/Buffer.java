class Buffer 
{
   private char [] buffer;
   private int count = 0, in = 0, out = 0;

   Buffer(int size)
   {
      buffer = new char[size];
   }
 
   public synchronized void Put(char c) 
  {
     while(count == buffer.length) //producers wait if buffer full
		try {
			wait();
		} catch (InterruptedException e) {
		}
     System.out.println("Producing " + c + " ...\n");
     buffer[in] = c; 
     in = (in + 1) % buffer.length; 
     count++;
     notify(); //notifies consumers that something can be consumed
     
   }
    
   public synchronized char Get() 
   {
     //System.out.println("Am inside Get");
     while(count == 0) //consumers wait if buffer empty
		try {
			wait();
		} catch (InterruptedException e) {
		}
     char c = buffer[out]; 
     out = (out + 1) % buffer.length;
     count--;
     System.out.println("Consuming " + c + " ...\n");
     notify(); //notifies producers that something can be produced since buffer no longer full
     return c;
   }
}

