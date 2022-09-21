/*
Problem
Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 11 while pressing the volume down button decreases the volume by 11. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.

Output Format
For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.

Constraints
-- 1≤T≤100
-- 1≤X,Y≤100
Sample 1:
Input       Output
2
50 54       4
12 10            2

Explanation:
Test Case 1: Chef can press the volume up button 44 times to increase the volume from 5050 to 5454.

Test Case 2: Chef can press the volume down button 22 times to decrease the volume from 1212 to 1010.
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class VolumeControl
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = t; i > 0; i--) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            if (v1 < v2) {
                System.out.println(v2-v1);
            }
            else {
                System.out.println(v1-v2);
            }
        }
    }
}
