
package heckerank;
   
 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayRotaion {
    
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int q=s.nextInt();
    int m;
    LinkedList<Integer>L=new LinkedList<Integer>();
    for(int i=0;i<n;i++){
       L.add(s.nextInt()) ;
        
    }
    for(int i=0;i<k;i++){
        m=L.removeLast();
        L.addFirst(m);
        
    }
    for(int i=0;i<q;i++){
        m=s.nextInt();
        System.out.println(L.get(m));
        
    }
    s.close();
    
}
   
}
