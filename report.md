# Lab 1 Report

Benjamin Bowman
CpS 209
August 29, 2025

Time spent: ~4 hours

## Work Completed

In this lab, I created a basic `Hello` program in which I learned about Java's methods for basic I/O and string to integer conversion.
In part B, I translated a basic number guessing game from Python to Java and worked with random numbers and control flow.
Finally, in the last part I wrote a `Grader` script that used conditions and some modulus math to process grades according to the rules. 

## Known Issues

- Grader will crash if the incorrect number of students is submitted.

## Transcripts

`Guess`:
```
C:\Users\benja\Documents\CS-Labs\CpS209\lab-01-java-orientation-thbop>./app/build/install/app/bin/app  
2
Your guess is too low.
5
Your guess is too low.
6
You got it!!
It took you 3 guesses.
```

`grades.txt`:
```
4
73
67
38
33
```
`Grader`:
```
PS C:\Users\benja\Documents\CS-Labs\CpS209\lab-01-java-orientation-thbop> cat grades.txt | java app/src/main/java/app/Grader.java
75
67
40
33
```