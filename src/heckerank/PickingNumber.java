
package heckerank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PickingNumber {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The N");
        int n = in.nextInt();
        Map<Integer,Integer>m=new HashMap<>();
        System.out.println("Enter the key and value");
        for(int i=0;i<n;i++){
            int num=in.nextInt();
            if(m.containsKey(num))
                m.put(num, m.get(num)+1);
            else
                m.put(num,m.get(num));
        }
         int maxSet = 0;
         for(int i:m.keySet()){
             int left=(m.containsKey(i-1))?(m.get(i-1)+m.get(i)):m.get(i);
             int right = (m.containsKey(i+1)) ? m.get(i) + m.get(i+1) : m.get(i);
               if(left > maxSet)
                maxSet = left;
            if(right > maxSet)
                maxSet = right;
        }
        System.out.println(maxSet);
            
             
         }
        
     }

