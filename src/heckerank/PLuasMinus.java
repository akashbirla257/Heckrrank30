/*
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to are acceptable.

For example, given the array there are elements, two positive, two negative and one zero. Their ratios would be , and . It should be printed as

0.400000
0.400000
0.200000

Function Description

Complete the plusMinus function in the editor below. It should print out the ratio of positive, negative and zero items in the array, each on a separate line rounded to six decimals.

plusMinus has the following parameter(s):

    arr: an array of integers

Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains space-separated integers describing an array of numbers .

Constraints


Output Format

You must print the following lines:

    A decimal representing of the fraction of positive numbers in the array compared to its size.
    A decimal representing of the fraction of negative numbers in the array compared to its size.
    A decimal representing of the fraction of zeros in the array compared to its size.

*/
package heckerank;

import java.util.Scanner;

public class PLuasMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n=arr.length;
        float pos=0;
        float neg=0;
        float zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0)
                pos++;
            else if(arr[i]<0)
                neg++;
            else
                zero++;
            
        }
        System.out.println((float)pos/n );
        System.out.println((float)neg/n );
        System.out.println((float)zero/n );
        

    }


    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

       // String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter the Elements in Array ");

        for (int i = 0; i < n; i++) {
     
            arr[i] = scanner.nextInt();
        }

        plusMinus(arr);

        scanner.close();
    }
}

