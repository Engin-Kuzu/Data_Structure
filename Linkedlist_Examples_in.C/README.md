# C Language Linked List Examples

This documentation explains the structure and logic of three different C source codes involving linked lists.

--------

## 1. Product Management System (Advanced Linked List)
A simulation of an inventory system where products are categorized and sorted by quantity using a dynamic linked list.

### Data Structure
* **Node Structure:** Stores category (`int`), name (`char[20]`), quantity (`int`), and price (`double`).
* **Pointer:** Contains a `next` pointer to the subsequent node.

### Core Functions
* **`menu()`**: The main interface for user input and operation management.
* **`ekleme()`**: Inserts a new product into the list, sorted by quantity.
* **`silme()`**: Finds and removes a node based on the product name.
* **`display()`**: Prints all products in the list to the console.

--------

## 2. Append to End (Simple Linked List)
A fundamental example that appends user-entered integers to the end of a linked list.

### Core Functions
* **`sona_ekle(int veri)`**: Allocates memory and links the new node to the tail of the list.
* **`display()`**: Traverses the list and prints elements in `data => data` format.

--------

## 3. Static Linked List Setup (Introductory)
A basic example demonstrating how to manually create and link two nodes in memory.

### Logic
* **Memory Management:** Uses `malloc` to allocate space on the heap.
* **Linkage:** Manually connects the first node to the second and terminates with `NULL`.
* **Output:** Produces the output `15=>25`.
