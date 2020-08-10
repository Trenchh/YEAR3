
import java.util.concurrent.TimeUnit;

//The content of this file defines a Java main class named 'ThreadAttacker' 
//This class contains the main method from where the whole program (project) 
//starts its execution
public class ThreadAttacker {

    //This is the challenge value, you can modify the value if you want
    public static String challenge = "challenge_sequence";
    //This is the password. It is here to help us compute the correct response that corresponds to the challenge
    public static String password = "virus";
    //This is the variable that represents the captured response
    public static int captured;
    //This is the variable that will be used by the thread to inform each other that the password has been cracked
    //For instance, if a thread cracks the password, it update the value of this variable to true
    public static boolean found = false;

    //The main method, here starts the execution	
    public static void main(String[] args) throws InterruptedException {
        //tempx is a temporary string variable that we are using to create the concatenation of the password with the challenge 
        String tempx = password + challenge;
        //Here we create the response by computing the hash of the previously computed string object
        captured = tempx.hashCode();

        System.out.println("-------Multi-Threaded Process-------");
        final long START = System.nanoTime();   //starts a timer

        //Thread creation and instanciation (three threads are created)
        ThreadBots t_1 = new ThreadBots(1, 'i');
        ThreadBots t_2 = new ThreadBots(2, 't');
        ThreadBots t_3 = new ThreadBots(3, 'v');

        //Thread trigging (starting the threads)
        t_1.start();
        t_2.start();
        t_3.start();

        final long END = System.nanoTime(); //ends timer (runtime)
        TimeUnit.SECONDS.sleep(1); //finish outputting before displaying runtime
        System.out.println("Time taken : " + ((END - START) / 1e+9) + " seconds");
        
        System.out.println("\n-------Single-Threaded Process-------");
        found = false;
        final long START2 = System.nanoTime(); //start timer
        ThreadBots singleThread = new ThreadBots(1, 'i');
        singleThread.singleThreadProcess(); //seperate method created to simulate single thread
        final long END2 = System.nanoTime(); //end timer (runtime)
        TimeUnit.SECONDS.sleep(1); //finish outputting before displaying runtime
        System.out.println("Time taken : " + ((END2 - START2) / 1e+9) + " seconds");  
    }

}
