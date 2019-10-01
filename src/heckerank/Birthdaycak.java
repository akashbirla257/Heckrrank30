
package heckerank;
  import java.io.*;
import java.util.*;


public class Birthdaycak {
 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Candels there");
        int n = in.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        System.out.println("Enter height of Candels");
        for(int i =0; i < n; i++){
            num = in.nextInt();
            if(num > max){
                sum = 1;
                max = num;
            }else if(num == max){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

