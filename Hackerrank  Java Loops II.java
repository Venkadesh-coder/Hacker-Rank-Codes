/*Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/
/*Code*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int k =0;
        int r=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
       // System.out.println(a+" "+b+" "+n );
        for (double j =0;j<n;j++){
        r = r+(int)(Math.pow(2.0,j)*b);
        k=r+a;
        System.out.print(k+" ");
        }
        System.out.print("\n");
    }
        in.close();
    }
}