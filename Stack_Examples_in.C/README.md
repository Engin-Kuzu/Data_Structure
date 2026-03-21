# Stack Data Structure Implementation in C

This project demonstrates a **Stack** data structure implemented using a **Linked List** with dynamic memory management in C. It follows the **LIFO (Last In, First Out)** principle.

---

## Data Structure Overview

* **Node Structure:** Each node consists of an integer (`int data`) and a pointer to the next node (`struct NODE *next`) representing the element below it.
* **Pointers:**
    * `top`: Points to the top element of the stack (where both insertion and removal occur).
    * `q`: A temporary pointer used for traversing the stack during display.

---

## Core Functions

### 1. `push(int realData)`
Adds a new element to the top of the stack.
* Allocates memory dynamically using `malloc`.
* The new node's `next` pointer is set to the current `top`.
* The `top` pointer is then updated to point to this new node.

### 2. `pop()`
Removes the element from the top of the stack.
* Checks if the stack is empty to prevent errors.
* Updates the `top` pointer to the next node in the sequence, effectively removing the current top element.

### 3. `peek()`
Returns the value of the top element without removing it from the stack. It includes a check to ensure the stack is not empty.

### 4. `display()`
Traverses the stack from the `top` to the bottom and prints each stored value. It provides a visual representation of the current stack state.

### 5. `menu()`
An interactive terminal-based interface that allows users to perform operations through a numbered menu.

---

## 🛠️ Tech Stack
* **Language:** C
* **Concepts:** Dynamic Memory Allocation (malloc), Pointers, Linked Lists, Stack Logic (LIFO).
