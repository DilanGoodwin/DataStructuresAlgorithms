# Insertion Sort

This sorting algorithm works by going through the list and comparing the different values, starting with the second element wihtin the array. What it does is compares the element with the one to the left of it, if it is greater then no changes are made. However if it is less than the element to the left of it the value is moved until it reaches the point where the element to the left if no longer greater than it. This process is continued until the end of the array/list is reached.

Within this directory structure there are two main files, one is a class in which the Insertion sorting algorithm has been implemented and the other is a demo program that simply shows an unorganised list and then the result of that list having been processed by the insertion sort class. 

## What is the Code Doing

The code within the insertion sort class is simply taking a value and then comparing it to the value to the left of it. If the value to the left of it is greater than the current value then their places are swapped, then the current value in its new position is again compared with the value to the left. This continues until it either reaches the beginning of the list or a value that is smaller than it. A written demonstration of how the algorithm does this is below.

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

As you can see from the above demonstration the insertion sort moves the values on at a time through the array until they have reached their final position. 