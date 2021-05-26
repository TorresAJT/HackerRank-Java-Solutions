/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasolutions;

import java.io.*;
import java.text.*;
import java.util.*;


/**
 *
 * @author aljoh
 */
public class Solutions {

    // Welcome to Java!
    static void SolutionOne() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    // Java Stdin and Stdout I
    static void SolutionTwo() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    // Java If-Else
    static void SolutionThree() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        scanner.close();
    }

    // Java Stdin and Stdout II
    static void SolutionFour() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    // Java Output Formatting
    static void SolutionFive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
    }

    // Java Loops I
    static void SolutionSix() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        scanner.close();
    }

    // Java Loops II
    static void SolutionSeven() {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans = a;

            for (int x = 0; x < n; x++) {
                ans += Math.pow(2, x) * b;
                System.out.printf("%d ", ans);
            }

            System.out.println();
        }

        in.close();
    }

    // Java Datatypes
    static void SolutionEight() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (x >= Math.pow(-2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

    // Java End-of-file
    static void SolutionNine() {
        Scanner scan = new Scanner(System.in);

        int i = 0;

        while (scan.hasNextLine()) {
            System.out.println(++i + " " + scan.nextLine());
        }
    }

    // Java Static Initializer Block
    static void SolutionTen() {
        boolean flag = true;
        int B;
        int H;
        String error = "java.lang.Exception: Breadth and height must be positive";

        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println(error);
        }

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

    // Java Int to String
//    static void SolutionEleven() {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.close();
//        
//        String s = String.valueOf(n);
//
//        if (n == Integer.parseInt(s)) {
//            System.out.println("Good job");
//        } else {
//            System.out.println("Wrong answer.");
//        }
//    }
//
//    // Java Date and Time
//    public static String findDay(int month, int day, int year) {
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.MONTH, month-1);
//        cal.set(Calendar.DAY_OF_MONTH, day);
//        cal.set(Calendar.YEAR, year);
//        
//        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,Locale.US).toUpperCase();
//        
//        return dayOfWeek;
//    }
//    
//    static void SolutionTwelve() throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }

    // Java Currency Formatter
    static void SolutionThirteen() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here
                
        Locale localeIN = new Locale("en", "IN");
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(localeIN);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

    // Java Strings Introduction
    static void SolutionFourteen() {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int strLength = A.length()+B.length();
        String strLex;
        
        if (A.compareTo(B)>0)
        {
            strLex = "Yes";
        }
        else
        {
            strLex = "No";
        }
        
        String capString = A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
        
        
        System.out.println(strLength);
        System.out.println(strLex);
        System.out.println(capString);
    }

    // Java Substring
    static void SolutionFifteen() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String substr = S.substring(start, end);
        
        System.out.println(substr);
    }

}
