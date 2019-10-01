
package heckerank;
   import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Electronics {
 
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int res=0;
        for(int i=0; i<keyboards.length;i++){
            for(int j=0;j<drives.length;j++){
                int cost=keyboards[i]+drives[j];
                if(cost<=b && cost>res){
                    res= cost;
                }
            }
        }
            if(res==0){
                return -1;
            }
            else{
                return res;
            }

    }
 
     public static void main(String[] args) throws IOException ,NullPointerException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 // private static final Scanner scanner = new Scanner(System.in);
   Scanner scanner = new Scanner(System.in);
        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        System.out.println("Enter Buget ,n,m ");
        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
           System.out.println("Enter keyboard price");
        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
         System.out.println("Enter USBdriver price");
        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


