# Bubble Sort

This sorting algorithm works by going through the list comparing the current element with the one next to it. If the next number is greater than the current number the program swaps the position of the 2 different numbers. If this is not the case though the numbers do not swap. It then moves onto the next number within the data structure, repeating the checking step and swapping the numbers if necessary. If any numbers were swapped then the algorithm will repeat. If no swaps are made in the end then the program comes to and end.

Within this folder system there are two files, one is the class in which the Bubble sort method is defined and the other is a small program that demonstrates what you can do with the class. The only reason that I have broken these into separate files is for when I start adding them to more advanced data structures (like doubly linked lists) and have to edit them a bit so it will work. 

## What is the Code Doing
Looking at the code there are two for loops that affect how each other operate. Looking directly at them it can be quite confusing so instead what I recommend is adding a small `System.out.println()` inside the BubbleSort class that simply displays the two numbers that the program appears to be working with (that would be `arrayValues[j]` and `arrayValues[j+1]`). 

If you have added these print lines to the code then you will see that the program moves the biggest number along unitl it finds a number that is bigger, once it has found a number that is bigger it keeps moving that value either until it reaches the end of the array or meets another number that is bigger. This is done within the code by constatnly swapping values that are larger into positions that are further within the array. 

But then the question becomes why is the value of `j` compared against `arrayValue.length-(1+i)`? \
This is simply because each time the program goes through the list you can pretty much guarantee that the value at the end of the list is the greatest value, which we can provde. Look at the demonstration below, you will see that each time we complete a full pass through of the array the numbers are the end of the array do not change.

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

All we are doing by having the amount `j` iterates through the array be smaller is reducing the time it takes for the algorithm to complete. This step could be removed and you could have the method go through each element within the array every single time if you wanted but it would not be the most effective thing to do. As you can see from the example above after each process iteration the numbers at the end of the array stay the same.
