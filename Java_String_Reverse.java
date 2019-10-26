/*
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes*/

/*CODE*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i = 0, j=A.length()-1;
        while(A.charAt(i)==A.charAt(j) && i++<j--);
        if(i>j){
        System.out.print("Yes");
        }
        else
System.out.print("No");
    }
}
