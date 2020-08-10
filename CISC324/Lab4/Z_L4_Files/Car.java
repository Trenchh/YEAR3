// This file defines class "Car".

// This code uses
//      class Synch, which defines the semaphores and variables
//                   needed for synchronizing the cars.

public class Car extends Thread {
	int myName; // The variable myName stores the name of this thread.
				// It is initialized in the constructor.

	// This is the constructor for class Car. It has an integer parameter,
	// which is the name that is given to this thread.
	public Car(int name) {
		// copy the parameter value to local variable "MyName"
		myName = name;

		// Call threadStart to let the timeSim scheduler know that another
		// thread is starting. timeSim needs to know how many threads there
		// are, so that it can accurately judge when all threads have finished
		// their current computation, so that simulated time can be advanced.
		Synch.timeSim.threadStart();
	} // end of the constructor for class "Car"

	public void run() {
		for (int I = 1; I <= 3; I++) {

			// Simulate driving around Barriefield.
			System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName + " is driving around Barriefield.\n");
			Synch.timeSim.doSleep(1, 500);

			// Now cross the causeway westbound, into Kingston. This might
			// involve some waiting (if the westbound light is red).
			System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName + " wants to cross westbound.\n");
			try {	//mutual exclusion for modifying the amount of cars waiting to go west
				Synch.westMutex.acquire();
			} catch (Exception e) {
			}
			Synch.westCarsCount++;	//incrementing amount of cars waiting
			Synch.westMutex.release(); //releasing for other cars
			try { //semaphore to check if light is green to go west bound
				Synch.westBound.acquire();
			} catch (Exception e) {
			}

			// Now we have permission to cross the causeway. Crossing is simulated
			// by a sleep. The sleep time is chosen to be relatively long (compared
			// to the sleep times for driving around and getting donuts), so that
			// it frequently happens that several cars are on the bridge.
			System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName + " is starting to cross westbound.\n");
			Synch.timeSim.doSleep(100);
			Synch.westBound.release(); //car has crossed

			try { //mutex for manipulating amount of cars waiting to go west
				Synch.westMutex.acquire();
			} catch (Exception e) {
			}
			Synch.westCarsCount--;	//decrementing cars waiting
			Synch.westMutex.release(); //releasing for other cars

			// Simulate driving to petrol station, filling the car fuel tank with
			// gasoil/diesel, leaving petrol station, and
			// driving back to the causeway.
			System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName
					+ " is filling the car fuel tank at the petrol station.\n");
			Synch.timeSim.doSleep(1, 500);

			// Now cross the causeway eastbound, back into Barriefield.
			System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName + " wants to cross eastbound.\n");

			try { //mutex for manipulating amount of cars waiting to go east
				Synch.eastMutex.acquire();
			} catch (Exception e) {
			}
			Synch.eastCarsCount++; //incrementing amount of cars waiting
			Synch.eastMutex.release(); //release for other cars
			try { //semaphore to check of light is green to go east bound
				Synch.eastBound.acquire();
			} catch (Exception e) {
			}
			
			//can cross east bound
			System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName + " is starting to cross eastbound.\n");
			Synch.timeSim.doSleep(100);
			Synch.eastBound.release(); // car has crossed
			try { //mutex for manipulating amount of cars waiting to go east
				Synch.eastMutex.acquire();
			} catch (Exception e) {
			}
			Synch.eastCarsCount--; //decrementing amount of cars waiting to go east
			Synch.eastMutex.release(); //release for other cars

		} // end of "for" loop
		System.out.println("At time " + Synch.timeSim.curTime() + " Car " + myName + " has stoped and its driver went out.\n");
		Synch.timeSim.threadEnd(); // Let timeSim know that this thread
									// has ended.
		try { // mutex for manipulating number of cars active
			Synch.carCountMutex.acquire();
		} catch (Exception e) {
		}
		Synch.carCount--; // car is no longer active
		Synch.carCountMutex.release(); //release for other cars
	} // end of "run" method

} // end of class "Car"
