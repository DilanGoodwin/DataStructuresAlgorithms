# Data Structures and Algorithms
This is a Github repository that stores programs demonstrating data structures and algorithms using the Java programming language. Each of these programs contains a class that stores the algorithm or data structure in questions and a demo script that shows an example of how the class can be used. Once a range of different data structures have been created I will also show how the sorting algorithms have to be adapted so that they can be used with the different data structures.

# Sorting Algorithms
These are different algorithms that can all be used to complete the same function, organising a list. Now while they all complete the same base function some of them are faster than others in certain applications and it is often the case that depending on which data structure you are using will also affect which sorting algorithm you are using.

## Bubble Sort
This sorting algorithm works by going through the list comparing the current element with the one next to it. If the next number is greater than the current number the program swaps the position of the 2 different numbers. If this is not the case though the numbers do not swap. It then moves onto the next number within the data structure, repeating the checking step and swapping the numbers if necessary. If any numbers were swapped then the algorithm will repeat. If no swaps are made in the end then the program comes to and end.

This algorithm can be adapted to work in conjunction with different data structure types which will be demonstrated within the relevant data structure programs that will be created. 

### Demonstration of Algorithm
Below is a demonstration of how the bubble sort algorithm works when writing it down.
```
Array Values
22,70,40,40,64,60,60,80,55,20

1st Pass
22, 70, 40, 40, 64, 60, 60, 80, 55, 20
22, 40, 70, 40, 64, 60, 60, 80, 55, 20
22, 40, 40, 70, 64, 60, 60, 80, 55, 20
22, 40, 40, 64, 70, 60, 60, 80, 55, 20
22, 40, 40, 64, 60, 70, 60, 80, 55, 20
22, 40, 40, 64, 60, 60, 70, 80, 55, 20
22, 40, 40, 64, 60, 60, 70, 80, 55, 20
22, 40, 40, 64, 60, 60, 70, 55, 80, 20
22, 40, 40, 64, 60, 60, 70, 55, 20, 80

2nd Pass
22, 40, 40, 64, 60, 60, 70, 55, 20, 80
22, 40, 40, 64, 60, 60, 70, 55, 20, 80
22, 40, 40, 64, 60, 60, 70, 55, 20, 80
22, 40, 40, 60, 64, 60, 70, 55, 20, 80
22, 40, 40, 60, 60, 64, 70, 55, 20, 80
22, 40, 40, 60, 60, 64, 70, 55, 20, 80
22, 40, 40, 60, 60, 64, 55, 70, 20, 80
22, 40, 40, 60, 60, 64, 55, 20, 70, 80
22, 40, 40, 60, 60, 64, 55, 20, 70, 80

3rd Pass
22, 40, 40, 60, 60, 64, 55, 20, 70, 80
22, 40, 40, 60, 60, 64, 55, 20, 70, 80
22, 40, 40, 60, 60, 64, 55, 20, 70, 80
22, 40, 40, 60, 60, 64, 55, 20, 70, 80
22, 40, 40, 60, 60, 64, 55, 20, 70, 80
22, 40, 40, 60, 60, 55, 64, 20, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80

4th Pass
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 60, 55, 20, 64, 70, 80
22, 40, 40, 60, 55, 60, 20, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80

5th Pass
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 60, 55, 20, 60, 64, 70, 80
22, 40, 40, 55, 60, 20, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80

6th Pass
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 55, 20, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80

7th Pass
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 40, 20, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80

8th Pass
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 40, 20, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
22, 20, 40, 40, 55, 60, 60, 64, 70, 80

9th Pass
22, 20, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
20, 22, 40, 40, 55, 60, 60, 64, 70, 80

Final Result
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
```

## Insertion Sort

## Selection Sort

# Data Structures

