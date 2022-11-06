# Selection Sort
This sorting algorithm goes through an array of values repeatedly finding the smallest element within the array of values and moving it to the beginning of the array. This is done by maintaining a constant position wihtin the array and then going through all the other values within the array, comparing them, If when comparing the values the one later on within the array is smaller than the constant then they are swapped. The constant is then changed to the next values within the array repeating the same processes. 

Within the folder system there are two main files, one is a Java class where the selection sorting algorithm is implemented, and the other program is a demo program that shows an unsorted array and then the sorted array that has been through the selection sort algorithm. 

## What is the Code Doing
When looking at the code you will see that there are two different for loops that go through the array. The first loop is used to define the `minIndex` this is the value that is being compared to as the smallest value within the array. The second for loop takes the value used to iterate through the first loop and adds 1 to it, then by iterating through the array compares each of the values to the `minIndex` value swapping them if the value is smaller. \
Then once that has been done the for loop iterates itself and the `minIndex` changes to the second value within the array, repeating the whole process again.

Each time this process is completed the value at the previous index will be the smallest one possible for that position. A written demo of how the algorithm works on paper is below.

<details>
  <summary>Writtem Example</summary>
  
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
