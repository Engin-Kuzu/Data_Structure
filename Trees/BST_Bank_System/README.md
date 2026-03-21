# Banking System (Binary Search Tree Implementation)

This project demonstrates a **Banking System** simulation implemented using a **Binary Search Tree (BST)** in Java. It provides an efficient way to manage bank accounts by utilizing account IDs as unique keys for tree organization.

---

## Data Structure Overview

* **Node Structure:** Each node in the tree represents a bank account, containing details such as `name`, `branchName`, `balance`, and a unique `accountId`.
* **BST Property:** Accounts are organized based on their `accountId`. Smaller IDs are placed in the left subtree, while larger IDs are placed in the right subtree.
* **Pointers:** Each node maintains `left` and `right` child pointers to form the hierarchical tree structure.

---

## Core Functions

### 1. `insert(name, branchName, balance, accountId)`
Adds a new account to the system.
* It uses a recursive approach to find the correct empty spot (null) according to the `accountId`.
* Ensures the Binary Search Tree property is maintained during insertion.

### 2. `search(accountId)`
Efficiently locates an account within the tree.
* Compares the target ID with the current node's ID to decide whether to search in the left or right subtree.
* Returns the full `Node` object if found, or `null` if the account does not exist.

### 3. `deposit(accountId, amount)` & `withdraw(accountId, amount)`
Manages financial transactions for a specific account.
* **Deposit:** Finds the account and increases the `balance`.
* **Withdraw:** Checks if the account exists and verifies if there is a sufficient `balance` before deducting the amount.

### 4. `inOrderTraversal()`
Prints all accounts stored in the tree.
* Visits nodes in "Left-Root-Right" order, which results in accounts being displayed in ascending order of their `accountId`.

---

## User Interface (BankSystem)

The system includes a terminal-based menu that allows users to interact with the BST:
1. **Add Account:** Prompt for account details and insert into the BST.
2. **Search Account:** Look up account details by ID.
3. **Deposit Money:** Add funds to an existing account.
4. **Withdraw Money:** Remove funds after balance verification.
5. **Print Accounts:** Display all registered accounts sorted by ID.

---

## Tech
* **Language:** Java
* **Concepts:** Binary Search Tree (BST), Recursive Algorithms, Encapsulation (Getters/Setters), Dynamic Memory Management

---
