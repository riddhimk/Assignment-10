# Assignment-10

## Overview  
This Java program demonstrates the **concept of Threads** by simulating a simple cricket match scenario where multiple activities (batting, umpiring, and commentary) happen concurrently using multithreading in Java.

## Features  
- Simulates a short over (6 balls) cricket scenario  
- Uses **Runnable interface** to implement thread behavior  
- Three roles executed as separate threads:
  - **Batsmen**: Two different batsmen playing
  - **Umpire**: Announces each delivery
  - **Commentary**: Provides real-time commentary  
- Demonstrates use of `Thread.sleep()` to simulate delays  
- Clean modular design with multiple Java files  
- Threads run in parallel, creating a dynamic and engaging simulation  

## Class Structure  

### Batsman.java  
- Implements `Runnable`  
- Attributes:
  - `name`: Batsman name  
- Method:
  - `run()`: Simulates hitting a ball every second for 6 balls  

### Umpire.java  
- Implements `Runnable`  
- Method:
  - `run()`: Simulates umpire announcements for each ball with delays  

### Commentary.java  
- Implements `Runnable`  
- Method:
  - `run()`: Simulates commentary for each delivery with slight delay  

### MatchManager.java  
- Contains the `main()` method  
- Creates and starts all threads  
- Demonstrates concurrent execution of multiple cricket actions  

## Thread Roles and Behaviors

| Thread      | Role Description         | Behavior Description              |
|-------------|--------------------------|-----------------------------------|
| Batsman     | Simulates hitting shots  | Runs 6 times, 1 second delay      |
| Umpire      | Announces deliveries     | Runs 6 times, 1 second delay      |
| Commentary  | Gives real-time updates  | Runs 6 times, 1.5 seconds delay   |

## Output
The program stops when all the threads run 6 times, simulating an over in cricket.
