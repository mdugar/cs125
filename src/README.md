# UIUC CS 125 Proficiency Exam Prep
A compilation of exercises, labs, and projects as part of my summer proficiency exam preparation for UIUC's CS 125 course.

## Repo Overview
### Class Exercises
Completed set of class exercises (organized by topic/concept) from available [CS 125 Lectures & Slides](https://cs125.cs.illinois.edu/learn).

#### ```algorithms```
Implementation of some interesting algorithms accounting for runtime/complexity issues. One algorithm that stands out is located in ```EuclidianGCD.java``` and provides two different Euclidian Greatest Common Denominator solutions.

#### ```arrays```
1D & 2D Array Manipulation.

#### ```functions```
Functions made to implement certain algorithms, along with an intro to method overloading.

#### ```generics```
Useful implementations of Java Generics and common in-built data structures.

#### ```lists```
Implementation of an ArrayList and Singly LinkedList class.

#### ```objects```
Working with objects and an intro to inheritance & overriding.

- ###### ```polymorphism```
  - Understanding upcasting, downcasting, and different variations of polymorphism.

- ###### ```object references```
  - Understanding how object references are stored in arrays and variables in Java.

- ###### ```interfaces```
  - Understanding interfaces in Java.
  
#### ```sorting```
Overview of various sorting algorithms in Java.

#### ```strings```
Functions that implement certain string-operating algorithms.

#### ```treesAndRecursion```
Working with a BinaryTree & BinarySearchTree implementation and other recursion exercises.


### Labs
Selectively completed set of labs from available [CS 125 Labs](https://cs125.cs.illinois.edu/lab/)
* Lab 1: Least Common Multiple Finder 
* Lab 2: Caesar Cipher w/ ROT13 Encryption


### Proficiency Practice
Provided challenges from the designated course on [PrarieLearn](https://prairielearn.engr.illinois.edu/).

#### ```Exercise 1: String Rotation (Right)```
Contains a function called rotateRight that takes a String as its first argument and a positive int as its second argument and rotates the String right by the given number of characters. Any characters that get moved off the right side of the string wrap around to the left.

#### ```Exercise 2: CheckBoard (Horizontal + Vertical Only)```
Checks a 3-by-3 Tic-Tac-Toe board for a winner. Functions receives an input of a 3-by-3 two-dimensional array of characters, with each space containing an X, O, or a . if nobody has played in that position. Returns X, O, or tells user if no player has won yet.

#### ```Exercise 3: LastTen```
Implementation of a class called LastTen that contains two public methods:
- ```void add(int newValue)```: add a new integer to the remembered values.
- ```int[] getLastTen()```: return the last ten values that were added using add. Return zeroes in place of unadded values.

#### ```Exercise 4: Comparable Max```
Designed a class called Max that provides a single class method called max. The max method takes two arguments to objects that can be compared, that implement the Java Comparable interface as shown above. Returns a reference to whichever is larger.

#### ```Exercise 5: Simple ArrayList```
Completed implementation of the ```SimpleList``` interface shown above in a class called ```SimpleArrayList```. 

#### ```Exercise 6: Simple LinkedList```
Completed implementation of a LinkedList that uses a linked list of ```Item``` objects internally.

#### ```Exercise 7: BinaryTree Sum```
Completed implementation of a ```BinaryTree``` class with a sum function that returns the sum taking into account all nodes of the tree.

#### ```Exercise 8: BinaryTree Height Balanced```
Completed implementation of a method for the ```BinaryTree``` class which lets the user know whether the tree is height balanced.

#### ```Exercise 9: Insertion Sort```
Completed implementation of an ```InsertionSorter``` class which returns the number of swaps needed to perform a proper insertion sort on an array.
