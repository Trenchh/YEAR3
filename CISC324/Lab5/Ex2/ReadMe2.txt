-----------------------------------------------------------------
		Question 1
-----------------------------------------------------------------
OUTPUT: 

Producing A ...
Producing B ...
Producing C ...
Producing D ...
----------------
This output occurs due to producers not notifying the consumers when the buffer is full. 
It holds on to the shared resource and no wait() or notify() functions are called.

-----------------------------------------------------------------
		Question 2
-----------------------------------------------------------------
OUTPUT:

Am inside Get
--------------
This output occurs for the same reason as above, the consumer is stuck in the lock
because no notify() or wait() functions are called.

-----------------------------------------------------------------
		Question 3
-----------------------------------------------------------------
out2.txt
