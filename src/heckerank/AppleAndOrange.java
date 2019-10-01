
package heckerank;
 import java.util.Scanner;
public class AppleAndOrange {
   
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter S ");
        int s = scan.nextInt();
        System.out.println("Enter t ");
        int t = scan.nextInt();
        System.out.println("Enter a ");
        int a = scan.nextInt();
        System.out.println("Enter b ");
        int b = scan.nextInt();
        System.out.println("Enter m ");
        int m = scan.nextInt();
        System.out.println("Enter n ");
        int n = scan.nextInt();
        
        /* Calculate # of apples that fall on house */
        System.out.println("Enter the Number Of Apples");
        int applesOnHouse = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + scan.nextInt();
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        }
         System.out.println("falling Apples the Number Of Apples");
        System.out.println(applesOnHouse);
        
        /* Calculate # of oranges that fall on house */
        
        int orangesOnHouse = 0;
         System.out.println("Enter the Number Of Orange :");
        for (int i = 0; i < n; i++) {
            int orangePosition = b + scan.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println("falling  Of Orange :");
        System.out.println(orangesOnHouse);
        
        scan.close();
    }
}


