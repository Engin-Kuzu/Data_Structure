# FIFO and Priority Queue Simulation in Java

This project demonstrates a comparative simulation between a standard **FIFO (First In, First Out)** queue and a **Priority Queue** based on individual processing times. It calculates wait times and compares the performance efficiency between the İwo methods.

---

## Data Structure Overview

* **Node Structure:** Each node represents a person in the queue, storing their `personSequence`, a randomly generated `randNumber` (processing time), and their calculated `waitTime`.
* **Linked List Implementation:** The queues are managed using custom linked list structures with `start`, `q`, and `next` pointers to navigate through elements and manage memory dynamically.

---

## Core Functionalities

### 1. Normal Queue (FIFO)
This method processes individuals in the exact order they arrived at the system.
* **Logic:** Each person is assigned a random processing time between 30 and 300 seconds.
* **Calculation:** The wait time for each person is the cumulative sum of their own processing time plus the processing times of everyone ahead of them in the sequence.

### 2. Priority Queue (SJF Logic)
This method reorganizes the queue to process the "shortest jobs" first to minimize the overall average wait time.
* **Copying Mechanism:** The original queue is cloned into a `startCopy` list to preserve initial arrival data while reordering.
* **Selection Process:** The algorithm scans the list to find the node with the **smallest** `randNumber`.
* **Reordering:** The identified "shortest job" node is extracted and appended to the `PriorityQueue` linked list, and wait times are recalculated based on this optimized order.

### 3. Comparison and Analysis
* **Time Difference:** The system calculates the specific wait time difference for each person between the FIFO and Priority Queue methods.
* **Performance Metrics:** It computes the average completion time for both scenarios to demonstrate the mathematical advantage of priority-based scheduling.

---

## Logic Flow

1. **Initialization:** The user enters the total number of people entering the system.
2. **FIFO Generation:** A linked list is created with random processing times, and initial wait times are displayed.
3. **Priority Processing:** 
    * The system searches for the minimum processing time among remaining people.
    * The selected person is moved to the priority list.
    * This recursive process continues until the entire queue is reordered.
4. **Final Result:** A comprehensive comparison table is printed, showing the "Wait Time Difference" for every individual.

---

## Tech Stack

* **Language:** Java
* **Concepts:** Linked Lists, Priority Queue Logic, Shortest Job First (SJF) Scheduling, Random Number Generation, Object-Oriented Programming (OOP).

---
