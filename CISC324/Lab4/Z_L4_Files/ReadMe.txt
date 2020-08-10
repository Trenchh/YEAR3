Configuration: 9 cars and 3 rounds

Correctness: I believe this solution works given the output below, cars can be seen waiting until their desired light turns green.
Semaphores are used at every point of shared resource manipulation as well as for informing cars of a green light. Overall, majority of the 
control comes from the traffic light simulator, it is the one that provides releases()/ allows cars to cross and its functionality is 
correct, so it all works smoothly. Given the output, I cant see how it would be working improperly.

------------------------------------------------
		Console Output
------------------------------------------------
At time 0 Car 1 is driving around Barriefield.

At time 0 Car 3 is driving around Barriefield.

At time 0 Car 2 is driving around Barriefield.

At time 0 the light is green for eastbound traffic 

At time 0 Car 4 is driving around Barriefield.

At time 0 Car 5 is driving around Barriefield.

At time 0 Car 8 is driving around Barriefield.

At time 0 Car 9 is driving around Barriefield.

At time 0 Car 7 is driving around Barriefield.

At time 0 Car 6 is driving around Barriefield.

At time 80 Car 1 wants to cross westbound.

At time 111 Car 2 wants to cross westbound.

At time 137 Car 4 wants to cross westbound.

At time 185 Car 7 wants to cross westbound.

At time 211 Car 3 wants to cross westbound.

At time 281 Car 8 wants to cross westbound.

At time 281 Car 5 wants to cross westbound.

At time 328 Car 6 wants to cross westbound.

At time 474 Car 9 wants to cross westbound.

At time 500 the light is red in both directions 

At time 600 the light is green for westbound traffic 

At time 600 Car 1 is starting to cross westbound.

At time 600 Car 2 is starting to cross westbound.

At time 600 Car 4 is starting to cross westbound.

At time 600 Car 8 is starting to cross westbound.

At time 600 Car 5 is starting to cross westbound.

At time 600 Car 3 is starting to cross westbound.

At time 600 Car 7 is starting to cross westbound.

At time 600 Car 9 is starting to cross westbound.

At time 600 Car 6 is starting to cross westbound.

At time 700 Car 1 is filling the car fuel tank at the petrol station.

At time 700 Car 2 is filling the car fuel tank at the petrol station.

At time 700 Car 8 is filling the car fuel tank at the petrol station.

At time 700 Car 3 is filling the car fuel tank at the petrol station.

At time 700 Car 9 is filling the car fuel tank at the petrol station.

At time 700 Car 6 is filling the car fuel tank at the petrol station.

At time 700 Car 7 is filling the car fuel tank at the petrol station.

At time 700 Car 5 is filling the car fuel tank at the petrol station.

At time 700 Car 4 is filling the car fuel tank at the petrol station.

At time 707 Car 6 wants to cross eastbound.

At time 714 Car 2 wants to cross eastbound.

At time 788 Car 8 wants to cross eastbound.

At time 839 Car 9 wants to cross eastbound.

At time 843 Car 4 wants to cross eastbound.

At time 969 Car 1 wants to cross eastbound.

At time 1093 Car 3 wants to cross eastbound.

At time 1100 the light is red in both directions 

At time 1145 Car 7 wants to cross eastbound.

At time 1156 Car 5 wants to cross eastbound.

At time 1200 the light is green for eastbound traffic 

At time 1200 Car 6 is starting to cross eastbound.

At time 1200 Car 2 is starting to cross eastbound.

At time 1200 Car 4 is starting to cross eastbound.

At time 1200 Car 1 is starting to cross eastbound.

At time 1200 Car 9 is starting to cross eastbound.

At time 1200 Car 8 is starting to cross eastbound.

At time 1200 Car 5 is starting to cross eastbound.

At time 1200 Car 7 is starting to cross eastbound.

At time 1200 Car 3 is starting to cross eastbound.

At time 1300 Car 3 is driving around Barriefield.

At time 1300 Car 6 is driving around Barriefield.

At time 1300 Car 4 is driving around Barriefield.

At time 1300 Car 9 is driving around Barriefield.

At time 1300 Car 8 is driving around Barriefield.

At time 1300 Car 2 is driving around Barriefield.

At time 1300 Car 7 is driving around Barriefield.

At time 1300 Car 5 is driving around Barriefield.

At time 1300 Car 1 is driving around Barriefield.

At time 1348 Car 5 wants to cross westbound.

At time 1428 Car 1 wants to cross westbound.

At time 1490 Car 9 wants to cross westbound.

At time 1493 Car 6 wants to cross westbound.

At time 1524 Car 2 wants to cross westbound.

At time 1607 Car 4 wants to cross westbound.

At time 1657 Car 8 wants to cross westbound.

At time 1700 the light is red in both directions 

At time 1746 Car 7 wants to cross westbound.

At time 1799 Car 3 wants to cross westbound.

At time 1800 the light is green for westbound traffic 

At time 1800 Car 5 is starting to cross westbound.

At time 1800 Car 9 is starting to cross westbound.

At time 1800 Car 1 is starting to cross westbound.

At time 1800 Car 6 is starting to cross westbound.

At time 1800 Car 2 is starting to cross westbound.

At time 1800 Car 4 is starting to cross westbound.

At time 1800 Car 8 is starting to cross westbound.

At time 1800 Car 7 is starting to cross westbound.

At time 1800 Car 3 is starting to cross westbound.

At time 1900 Car 3 is filling the car fuel tank at the petrol station.

At time 1900 Car 5 is filling the car fuel tank at the petrol station.

At time 1900 Car 9 is filling the car fuel tank at the petrol station.

At time 1900 Car 1 is filling the car fuel tank at the petrol station.

At time 1900 Car 6 is filling the car fuel tank at the petrol station.

At time 1900 Car 4 is filling the car fuel tank at the petrol station.

At time 1900 Car 8 is filling the car fuel tank at the petrol station.

At time 1900 Car 7 is filling the car fuel tank at the petrol station.

At time 1900 Car 2 is filling the car fuel tank at the petrol station.

At time 2034 Car 2 wants to cross eastbound.

At time 2117 Car 8 wants to cross eastbound.

At time 2120 Car 9 wants to cross eastbound.

At time 2190 Car 4 wants to cross eastbound.

At time 2215 Car 1 wants to cross eastbound.

At time 2276 Car 6 wants to cross eastbound.

At time 2300 the light is red in both directions 

At time 2305 Car 3 wants to cross eastbound.

At time 2327 Car 7 wants to cross eastbound.

At time 2381 Car 5 wants to cross eastbound.

At time 2400 the light is green for eastbound traffic 

At time 2400 Car 2 is starting to cross eastbound.

At time 2400 Car 8 is starting to cross eastbound.

At time 2400 Car 9 is starting to cross eastbound.

At time 2400 Car 4 is starting to cross eastbound.

At time 2400 Car 1 is starting to cross eastbound.

At time 2400 Car 6 is starting to cross eastbound.

At time 2400 Car 3 is starting to cross eastbound.

At time 2400 Car 7 is starting to cross eastbound.

At time 2400 Car 5 is starting to cross eastbound.

At time 2500 Car 5 is driving around Barriefield.

At time 2500 Car 2 is driving around Barriefield.

At time 2500 Car 8 is driving around Barriefield.

At time 2500 Car 9 is driving around Barriefield.

At time 2500 Car 4 is driving around Barriefield.

At time 2500 Car 1 is driving around Barriefield.

At time 2500 Car 6 is driving around Barriefield.

At time 2500 Car 3 is driving around Barriefield.

At time 2500 Car 7 is driving around Barriefield.

At time 2540 Car 5 wants to cross westbound.

At time 2542 Car 3 wants to cross westbound.

At time 2560 Car 6 wants to cross westbound.

At time 2608 Car 7 wants to cross westbound.

At time 2617 Car 4 wants to cross westbound.

At time 2648 Car 2 wants to cross westbound.

At time 2694 Car 8 wants to cross westbound.

At time 2717 Car 9 wants to cross westbound.

At time 2797 Car 1 wants to cross westbound.

At time 2900 the light is red in both directions 

At time 3000 the light is green for westbound traffic 

At time 3000 Car 5 is starting to cross westbound.

At time 3000 Car 3 is starting to cross westbound.

At time 3000 Car 6 is starting to cross westbound.

At time 3000 Car 7 is starting to cross westbound.

At time 3000 Car 4 is starting to cross westbound.

At time 3000 Car 2 is starting to cross westbound.

At time 3000 Car 8 is starting to cross westbound.

At time 3000 Car 9 is starting to cross westbound.

At time 3000 Car 1 is starting to cross westbound.

At time 3100 Car 5 is filling the car fuel tank at the petrol station.

At time 3100 Car 1 is filling the car fuel tank at the petrol station.

At time 3100 Car 3 is filling the car fuel tank at the petrol station.

At time 3100 Car 6 is filling the car fuel tank at the petrol station.

At time 3100 Car 7 is filling the car fuel tank at the petrol station.

At time 3100 Car 4 is filling the car fuel tank at the petrol station.

At time 3100 Car 2 is filling the car fuel tank at the petrol station.

At time 3100 Car 8 is filling the car fuel tank at the petrol station.

At time 3100 Car 9 is filling the car fuel tank at the petrol station.

At time 3191 Car 7 wants to cross eastbound.

At time 3215 Car 2 wants to cross eastbound.

At time 3296 Car 1 wants to cross eastbound.

At time 3331 Car 6 wants to cross eastbound.

At time 3334 Car 3 wants to cross eastbound.

At time 3342 Car 4 wants to cross eastbound.

At time 3374 Car 5 wants to cross eastbound.

At time 3500 the light is red in both directions 

At time 3594 Car 9 wants to cross eastbound.

At time 3597 Car 8 wants to cross eastbound.

At time 3600 the light is green for eastbound traffic 

At time 3600 Car 7 is starting to cross eastbound.

At time 3600 Car 1 is starting to cross eastbound.

At time 3600 Car 3 is starting to cross eastbound.

At time 3600 Car 2 is starting to cross eastbound.

At time 3600 Car 8 is starting to cross eastbound.

At time 3600 Car 9 is starting to cross eastbound.

At time 3600 Car 5 is starting to cross eastbound.

At time 3600 Car 4 is starting to cross eastbound.

At time 3600 Car 6 is starting to cross eastbound.

At time 3700 Car 7 has stoped and its driver went out.

At time 3700 Car 1 has stoped and its driver went out.

At time 3700 Car 3 has stoped and its driver went out.

At time 3700 Car 9 has stoped and its driver went out.

At time 3700 Car 5 has stoped and its driver went out.

At time 3700 Car 6 has stoped and its driver went out.

At time 3700 Car 4 has stoped and its driver went out.

At time 3700 Car 8 has stoped and its driver went out.

At time 3700 Car 2 has stoped and its driver went out.

At time 4100 the light is red in both directions 

At time 4200 the light is green for westbound traffic 

At time 4700 the light is red in both directions 

This is main speaking
