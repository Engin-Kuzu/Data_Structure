# Queue Data Structure Implementation in C

This project demonstrates a **Queue** data structure based on a **Linked List** using dynamic memory management in C. It follows the **FIFO (First In, First Out)** principle.

---

## Data Structure Overview
* **Node Structure:** Each node contains an integer (`int data`) and a pointer to the next node (`struct NODE *next`).
* **Pointers:** 
  * `front`: Points to the first element (where removal occurs).
  * `rear`: Points to the last element (where insertion occurs).

---

## Core Functions

### 1. `enQueue(int realData)`
Adds a new element to the end of the queue.
* Allocates memory using `malloc`.
* If the queue is empty, both `front` and `rear` point to the new node.
* If not empty, it links the new node to the current `rear` and updates the `rear` pointer.

### 2. `deQueue()`
Removes the element from the front of the queue.
* Checks if the queue is empty.
* Updates the `front` pointer to the next node, effectively removing the first element.

### 3. `peek()`
Returns the value of the element at the front without removing it.

### 4. `display()`
Traverses the queue from `front` to `rear` and prints all stored values.

### 5. `menu()`
An interactive terminal-based interface to manage queue operations easily.

---

## 🛠️ Tech Stack
* **Language:** C
* **Concepts:** Dynamic Memory (malloc), Pointers, Linked Lists, Queue Logic (FIFO).
