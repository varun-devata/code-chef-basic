/*
Problem
Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.

You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).

Constraints
-- 1 ≤ T ≤ 100
-- 1 ≤ X, Y ≤ 100
Sample 1:
Input       Output
3
30 65       FIRST
42 42       ANY
90 50       SECOND

Explanation:
Test case 1: The first cab service is cheaper than the second cab service.

Test case 2: Both the cab services have the same price.

Test case 3: The second cab service is cheaper than the first cab service.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheaperCab
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = t; i > 0; i--) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if(c1 < c2) {
                System.out.println("FIRST");
            }
            else if (c1 == c2) {
                System.out.println("ANY");
            }
            else {
                System.out.println("SECOND");
            }
        }
    }
}
