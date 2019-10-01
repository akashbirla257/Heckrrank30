/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heckerank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Time {
    static String timeConversion(String s) {
    DateFormat df = new SimpleDateFormat("hh:mm:ssa");
    Date result = new Date();
    try {
      result =  df.parse(s);
    } catch (Exception e) { }
    DateFormat dr =  new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    return (String) dr.format(result);
  }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Enter the data");
        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
