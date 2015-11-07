/*
 * CSCI2125 Assignment 2 Submission
 * Garrick Ranck granck@uno.edu
 * BinarySearchTree program
 */

-version control
java  -version = 1.8.0_60
javac -version = 1.8.0_60

I had a small issue getting the startup.java file to compile correctly. It was only due to the nullsymbol being of type int and the sequence being of type Integer. When they were placed into the constructor for binarytree/binarysearchtree there was a type mismatch. Both the sequence and nullsymbol are of type T, so they need to be the same type. I got the startup to compile when I changed the nullsymbol to also be of type Integer.

For my que I used a linkedlist. The instructions were explicit on how I was required to make the que. I chose the linkedlist because it is automatically dynamically changing it's size to accomodate a larger or smaller number of values to be qued and it doesn't require changing indexes when removing values.

No other concerns beyond that. Everything should compile correctly.

