# Couting Sort
The counting sort algorithm works by knowing the range of values that make up the list, for example 0 - 9. Using this information it then makes a secondary array and places all of the numbers from the primary list into the secondary based on their value. The secondary array is then used to re-create the primary array in an ordered form.\
In my example code I have created two methods to make up the counting sort algorithm but if you want you only need a single method as long as you tell it the range of values within the primary array.

This algorithm is best to use when there is a small range of values that are repeated multiple times, if there is a large range of values then using this specific algorithm doesn't really have much of a benefit to the sorting process.

## Written Example

```
Array Values = [0, 2, 7, 7, 7, 7, 7, 7, 6, 8, 9, 1, 7, 9, 4, 7, 0, 1, 6, 3]

Secondary Array = [(0,0),(1,0),(2,0),(3,0),(4,0),(5,0),(6,0),(7,0),(8,0),(9,0)]

Organise Array Values into Secondary Array

Secondary Array = [(0,2),(1,2),(2,1),(3,1),(4,1),(5,0),(6,2),(7,7),(8,1),(9,2)]

Re-create Array Values using Secondary Array

Array Values = [0, 0, 1, 1, 2, 3, 4, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 9]
```
