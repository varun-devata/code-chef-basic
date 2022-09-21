/*
Problem
Ezio can manipulate at most X number of guards with the apple of eden.

Given that there are Y number of guards, predict if he can safely manipulate all of them.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY.

Output Format
For each test case, print YES if it is possible for Ezio to manipulate all the guards. Otherwise, print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

Constraints
-- 1≤T≤100
-- 1≤X,Y≤100
Sample 1:
Input       Output
3
5 7         NO
6 6         YES
9 1         YES

Explanation:
Test Case 1: Ezio can manipulate at most 5 guards. Since there are 7 guards, he cannot manipulate all of them.

Test Case 2: Ezio can manipulate at most 6 guards. Since there are 6 guards, he can manipulate all of them.

Test Case 3: Ezio can manipulate at most 9 guards. Since there is only 1 guard, he can manipulate the guard.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class EzioAndGuards {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = t; i > 0; i--) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X < Y) System.out.println("NO");
            else if (X == Y) System.out.println("YES");
            else System.out.println("YES");
        }
    }
}
