
package heckerank;

import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the How many number");
        n=s.nextInt();
        int grades[]=new int[n];
        System.out.println("Enter the Marks");
        for( i=0;i<n;i++){
            grades[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            if(grades[i]>=38){
                int multplaefive=5-(grades[i]%5)+grades[i];
                if(multplaefive-grades[i]<3){
                    grades[i]=multplaefive;
                    System.out.println(grades[i]+" ");
                }
            }
        }
       
    }
}
