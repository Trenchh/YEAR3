//The content of this file defines a Java class named 'ThreadBot' 
//This class inherits from the predefined Java class Thread.

public class ThreadBots extends Thread {

    int Identity; //This integer variable will be the thread identifier
    char init_char;//This character will be used by each thread as the first letter in the password

    //Here we redefine the default constructor of this class.
    //By default it has no arguments, but in this example
    //We are using two arguments
    public ThreadBots(int id, char c) {
        //Here we retrieve the value of the identity passed by the main class
        Identity = id;
        //Here we retrieve the value of the character passed by the main class
        init_char = c;
    }

    @Override
    public void run() {
        char[] cracked = new char[4];
        //Loop to produce each 4 letter string from a-z
        for (cracked[0] = 'a'; cracked[0] <= 'z'; cracked[0]++) {
            for (cracked[1] = 'a'; cracked[1] <= 'z'; cracked[1]++) {
                for (cracked[2] = 'a'; cracked[2] <= 'z'; cracked[2]++) {
                    for (cracked[3] = 'a'; cracked[3] <= 'z'; cracked[3]++) {
                        if (ThreadAttacker.found == true) { //stops bots if password has been cracked
                            break;
                        }
                        String password = init_char + new String(cracked);  //concatenates eligible password
                        String tempx = password + ThreadAttacker.challenge;    //Concatenates string to be hashed
                        int hashCheck = tempx.hashCode();   //generates hash for string
                        if (hashCheck == ThreadAttacker.captured) { //check if password is correct
                            System.out.println("The password is: '" + password + "', cracked by: " + this.getName());
                            ThreadAttacker.found = true;
                        }
                    }
                }
            }
        }
    }

    //method to simulate a single thread, inefficiently runs through "run()" 3 times, changing init_char respectively
    public void singleThreadProcess() {
        //Thread instantiated init_char with 'i'
        char[] cracked = new char[4];
        for (cracked[0] = 'a'; cracked[0] <= 'z'; cracked[0]++) {
            for (cracked[1] = 'a'; cracked[1] <= 'z'; cracked[1]++) {
                for (cracked[2] = 'a'; cracked[2] <= 'z'; cracked[2]++) {
                    for (cracked[3] = 'a'; cracked[3] <= 'z'; cracked[3]++) {
                        if (ThreadAttacker.found == true) {
                            break;
                        }
                        String password = init_char + new String(cracked);  //concatenates eligible password
                        String tempx = password + ThreadAttacker.challenge;    //Concatenates string to be hashed
                        int hashCheck = tempx.hashCode();   //generates hash for string
                        if (hashCheck == ThreadAttacker.captured) { //check if password is correct
                            System.out.println("The password is: '" + password + "', cracked by: " + this.getName());
                            ThreadAttacker.found = true;
                        }
                    }
                }
            }
        }

        //New iteration, changing init_char value to 't'
        init_char = 't';
        for (cracked[0] = 'a'; cracked[0] <= 'z'; cracked[0]++) {
            for (cracked[1] = 'a'; cracked[1] <= 'z'; cracked[1]++) {
                for (cracked[2] = 'a'; cracked[2] <= 'z'; cracked[2]++) {
                    for (cracked[3] = 'a'; cracked[3] <= 'z'; cracked[3]++) {
                        if (ThreadAttacker.found == true) {
                            break;
                        }
                        String password = init_char + new String(cracked);  //concatenates eligible password
                        String tempx = password + ThreadAttacker.challenge;    //Concatenates string to be hashed
                        int hashCheck = tempx.hashCode();   //generates hash for string
                        if (hashCheck == ThreadAttacker.captured) { //check if password is correct
                            System.out.println("The password is: '" + password + "', cracked by: " + this.getName());
                            ThreadAttacker.found = true;
                        }
                    }
                }
            }
        }

        //New iteration, changing init_char value to 'v'
        init_char = 'v';
        for (cracked[0] = 'a'; cracked[0] <= 'z'; cracked[0]++) {
            for (cracked[1] = 'a'; cracked[1] <= 'z'; cracked[1]++) {
                for (cracked[2] = 'a'; cracked[2] <= 'z'; cracked[2]++) {
                    for (cracked[3] = 'a'; cracked[3] <= 'z'; cracked[3]++) {
                        if (ThreadAttacker.found == true) {
                            break;
                        }
                        String password = init_char + new String(cracked);  //concatenates eligible password
                        String tempx = password + ThreadAttacker.challenge;    //Concatenates string to be hashed
                        int hashCheck = tempx.hashCode();   //generates hash for string
                        if (hashCheck == ThreadAttacker.captured) { //check if password is correct
                            System.out.println("The password is: '" + password + "', cracked by: " + this.getName());
                            ThreadAttacker.found = true;
                        }
                    }
                }
            }
        }
    }
}
