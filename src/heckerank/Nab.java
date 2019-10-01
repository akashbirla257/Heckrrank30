/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heckerank;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Nab {
  /*package whatever //do not write package name here */



    static int MaxSumDiff(Integer a[],int n){
        LinkedList<Integer>f=new LinkedList<Integer>();
        Arrays.sort(a);
        for(int i=0;i<n/2;++i){
            f.add(a[i]);
            f.add(a[n-i-1]);
        }
        int maxSum=0;
        for(int i=0;i<n-1;++i){
            maxSum+=Math.abs(f.get(i)-f.get(i+1));
        }
        maxSum+=Math.abs(f.get(n-1)-f.get(0));
        
        return maxSum;
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    Integer a[]=new Integer[n];
	    int i;
	    for( i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    System.out.println( MaxSumDiff(a,n)+" ");
	}
	}
}  

