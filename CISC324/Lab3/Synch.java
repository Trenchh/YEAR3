// This file defines class "Synch".  This class contains all the semaphores
// and variables needed to coordinate the instances of the Reader and Writer
// classes.  

import java.util.concurrent.*;

public class Synch {

  public static Semaphore read;
  public static Semaphore wrt;
  public static int readcount = 0;
  public static int writecount = 0; //for queue of writers
  public static Semaphore x,y,z; //priority/mutual exclusion semaphores (detailed in MainMethod.java)
  
}  // end of class "Synch"

