
package heckerank;

import java.util.Arrays;
import java.util.Scanner;

public class MarcentSocks {
    public static void main(String[] args)
    {
      

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int j= 0; j < n; j++) {
            a[j] = in.nextInt();
        }
        Arrays.sort(a);
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i < n && a[i] == a[i + 1]) {
                total++;
                i = i + 1;
            }
        }
        System.out.println(total);
    }
}
