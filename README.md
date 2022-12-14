# Data Structures and Algorithms
This is a Github repository that stores programs demonstrating data structures and algorithms using the Java programming language. Each of these programs contains a class that stores the algorithm or data structure in questions and a demo script that shows an example of how the class can be used. Once a range of different data structures have been created I will also show how the sorting algorithms have to be adapted so that they can be used with the different data structures.

# Sorting Algorithms
These are different algorithms that can all be used to complete the same function, organising a list. Now while they all complete the same base function some of them are faster than others in certain applications and it is often the case that depending on which data structure you are using will also affect which sorting algorithm you are using.

## Bubble Sort
This sorting algorithm works by going through the list comparing the current element with the one next to it. If the next number is greater than the current number the program swaps the position of the 2 different numbers. If this is not the case though the numbers do not swap. It then moves onto the next number within the data structure, repeating the checking step and swapping the numbers if necessary. If any numbers were swapped then the algorithm will repeat. If no swaps are made in the end then the program comes to and end.

This algorithm can be adapted to work in conjunction with different data structure types which will be demonstrated within the relevant data structure programs that will be created. 

### Demonstration of Algorithm
Below is a demonstration of how the bubble sort algorithm works when writing it down.

<details>
  <summary>Written Example</summary>

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

</details>

## Insertion Sort
This sorting algorithm works by going through the list and comparing the different values, starting with the second element wihtin the array. What it does is compares the element with the one to the left of it, if it is greater then no changes are made. However if it is less than the element to the left of it the value is moved until it reaches the point where the element to the left if no longer greater than it. This process is continued until the end of the array/list is reached.

Within this directory structure there are two main files, one is a class in which the Insertion sorting algorithm has been implemented and the other is a demo program that simply shows an unorganised list and then the result of that list having been processed by the insertion sort class. 

### Demonstration of Algorithm
Below is a demonstration of the Insertion sort algorithm when written out.

<details>
  <summary>Written Example</summary>

```
Array Values
22, 70, 40, 40, 64, 60, 60, 80, 55, 20

1st Pass
22, 70, 40, 40, 64, 60, 60, 80, 55, 20
Is 22 < 70? Yes, no swap made.

2nd Pass
22, 70, 40, 40, 64, 60, 60, 80, 55, 20
Is 70 < 40? No, swap made.
Is 22 < 40? Yes, no swap made.
22, 40, 70, 40, 64, 60, 60, 80, 55, 20

3rd Pass
22, 40, 70, 40, 64, 60, 60, 80, 55, 20
Is 70 < 40? No, swap made.
Is 40 < 40? No, swap made.
Is 22 < 40? Yes, no swap made.
22, 40, 40, 70, 64, 60, 60, 80, 55, 20

4th Pass
22, 40, 40, 70, 64, 60, 60, 80, 55, 20
Is 70 < 64? No, swap made.
Is 40 < 64? Yes, no swap made.
22, 40, 40, 64, 70, 60, 60, 80, 55, 20

5th Pass
22, 40, 40, 64, 70, 60, 60, 80, 55, 20
Is 70 < 60? No, swap made.
Is 64 < 60? No, swap made.
Is 40 < 60? Yes, no swap made.
22, 40, 40, 60, 64, 70, 60, 80, 55, 20

6th Pass
22, 40, 40, 60, 64, 70, 60, 80, 55, 20
Is 70 < 60? No, swap made.
Is 64 < 60? No, swap made.
Is 60 < 60? No, swap made.
Is 40 < 60? Yes, no swap made.
22, 40, 40, 60, 60, 64, 70, 80, 55, 20

7th Pass
22, 40, 40, 60, 60, 64, 70, 80, 55, 20
Is 70 < 80? Yes, no swap made.
22, 40, 40, 60, 60, 64, 70, 80, 55, 20

8th Pass
22, 40, 40, 60, 60, 64, 70, 80, 55, 20
Is 80 < 55? No, swap made.
Is 70 < 55? No, swap made.
Is 64 < 55? No, swap made.
Is 60 < 55? No, swap made.
Is 60 < 55? No, swap made.
Is 40 < 55? Yes, no swap made.
22, 40, 40, 55, 60, 60, 64, 70, 80, 20

9th Pass
22, 40, 40, 55, 60, 60, 64, 70, 80, 20
Is 80 < 20? No, swap made.
Is 70 < 20? No, swap made.
Is 64 < 20? No, swap made.
Is 60 < 20? No, swap made.
Is 60 < 20? No, swap made.
Is 55 < 20? No, swap made.
Is 40 < 20? No, swap made.
Is 40 < 20? No, swap made.
Is 22 < 20? No, swap made.
End List, swap beginning.
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
```

</details>

## Selection Sort
This sorting algorithm goes through an array of values repeatedly finding the smallest element within the array of values and moving it to the beginning of the array. This is done by maintaining a constant position wihtin the array and then going through all the other values within the array, comparing them, If when comparing the values the one later on within the array is smaller than the constant then they are swapped. The constant is then changed to the next values within the array repeating the same processes. 

Within the folder system there are two main files, one is a Java class where the selection sorting algorithm is implemented, and the other program is a demo program that shows an unsorted array and then the sorted array that has been through the selection sort algorithm. 

### Demonstration of Algorithm
Below is a demonstration of how the seelection sort algorithm works when writing it down.

<details>
  <summary>Written Example</summary>

  ```
Array Vlues
22, 70, 40, 40, 64, 60, 60, 80, 55, 20

1st Pass
22, 70, 40, 40, 64, 60, 60, 80, 55, 20
20, 70, 40, 40, 64, 60, 60, 80, 55, 22

2nd Pass
20, 70, 40, 40, 64, 60, 60, 80, 55, 22
20, 22, 40, 40, 64, 60, 60, 80, 55, 70

3rd Pass
20, 22, 40, 40, 64, 60, 60, 80, 55, 70

4th Pass
20, 22, 40, 40, 64, 60, 60, 80, 55, 70

5th Pass
20, 22, 40, 40, 64, 60, 60, 80, 55, 70
20, 22, 40, 40, 60, 64, 60, 80, 55, 70
20, 22, 40, 40, 55, 64, 60, 80, 60, 70

6th Pass
20, 22, 40, 40, 55, 64, 60, 80, 60, 70
20, 22, 40, 40, 55, 60, 64, 80, 60, 70

7th Pass
20, 22, 40, 40, 55, 60, 64, 80, 60, 70
20, 22, 40, 40, 55, 60, 60, 80, 64, 70

8th Pass
20, 22, 40, 40, 55, 60, 60, 80, 64, 70
20, 22, 40, 40, 55, 60, 60, 64, 80, 70

9th Pass
20, 22, 40, 40, 55, 60, 60, 64, 80, 70
20, 22, 40, 40, 55, 60, 60, 64, 70, 80
```

</details>

## Quicksort
This sorting algorithm works by splitting the array down the middle and then organising it with all the values that are less than the middle value placed on the left and all the ones higher on the right. It uses a recursive sorting method to call the methods multiple times to organise the array values. Method will call itself until the start value is less than the end value. 

This algorithm can be adapted to work with different data structures but is not the easiest to do depending on the data structure. Demonstration of implementing this sorting algorithm into a data structure will be done when start implementing data structures.

## Shell Sort
This sorting algorithm works by calculating an interval that it should travel through the array by, this is calculated using the algorithm `h=(h*3)+1`. Once the interval has been calculated it travels through the array comparing the values at those intervals to each other an swapping their positions depending on whether they are greater or less than each other. \
This process results in the smaller values being closer to the beginning of the list and the larger values nearer the end. Each time the values at a given interval position have been sorted the reverse for the interval algorithm occur (`h=(h-1)/3`) and the program is run again but with the new interval definition. This will continue until the interval counter equals 1, by which time the majority of the list will have been sorted.

This algorithm works best with large data structures and is an expansion to the insertion sort. The larger the data set the better this algorithm operates which is why the array for this specific demonstration was made larger. \
Once again this algorithm will be properly implemented when creating data structures.

## Counting Sort
The counting sort algorithm works by knowing the range of values that make up the list, for example 0 - 9. Using this information it then makes a secondary array and places all of the numbers from the primary list into the secondary based on their value. The secondary array is then used to re-create the primary array in an ordered form.\
In my example code I have created two methods to make up the counting sort algorithm but if you want you only need a single method as long as you tell it the range of values within the primary array.

This algorithm is best to use when there is a small range of values that are repeated multiple times, if there is a large range of values then using this specific algorithm doesn't really have much of a benefit to the sorting process.

### Demonstration of Algorithm
Below is an example of the counting sort algorithm when written down.

<details>
  <summary>Written Example</summary>

  ```
  Array Values = [0, 2, 7, 7, 7, 7, 7, 7, 6, 8, 9, 1, 7, 9, 4, 7, 0, 1, 6, 3]

Secondary Array = [(0,0),(1,0),(2,0),(3,0),(4,0),(5,0),(6,0),(7,0),(8,0),(9,0)]

Organise Array Values into Secondary Array

Secondary Array = [(0,2),(1,2),(2,1),(3,1),(4,1),(5,0),(6,2),(7,7),(8,1),(9,2)]

Re-create Array Values using Secondary Array

Array Values = [0, 0, 1, 1, 2, 3, 4, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 9]
```
</details>

# Extras
These are programs that do not really fit in as a data structure or sorting algorithm but are good examples of some of the concepts that are used within the programs.

## Greatest Common Denominator 
This is a fairly simple program that finds the largest denominator of two values that are passed to it. The reason this program is included is because it is recursive (meaning it calls itself) and is a rather easy version of the concept to follow on a piece of paper. I would highly recommend understanding the code within the program as it will help to understand some of the more advanced pieces of code that are used wihtin the sorting algorithms.