
package heckerank;
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Beautifuldays {
 


    static int beautifulDays(int i, int j, int k) {
    int beutifuldays=0;

        for(int num = i;num<=j;num++){
            
            StringBuilder day = new StringBuilder(String.valueOf(num));
            int xReverse = Integer.parseInt(day.reverse().toString());
                int diff=Math.abs(num-xReverse);
                if(diff % k==0){
                    beutifuldays++;
                }
              
            }
        
          return beutifuldays;
    }

   

    public static void main(String[] args) throws IOException {
        
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(System.in);
       // String[] ijk = scanner.nextLine().split(" ");

        int i = scanner.nextInt();

        int j = scanner.nextInt();

        int k =scanner.nextInt();

        int result = beautifulDays(i, j, k);

        System.out.println(result);

        scanner.close();
        }
       
    }


