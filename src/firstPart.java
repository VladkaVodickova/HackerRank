import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class firstPart {
    public static void main(String[] args) {
        /* task 1
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
         */
        //Task 2
        // In this challenge, you must read integers from stdin and then print them to stdout.
        // Each integer must be printed on a new line. To make the problem a little easier,
        // a portion of the code is provided for you in the editor below.
        /*
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int myInt = sc.nextInt();
            System.out.println(myInt);
        }
        sc.close();
        */
        //Task 3
        //Given an integer, perform the following conditional actions:
        //If int is odd, print Weird
        //If int is even and in the inclusive range of 2 to 5 print Not Weird
        //If int is even and in the inclusive range of 6 to 20 print Weird
        //If int is even and greater than 20 print Not Weird
        //Complete the stub code provided in your editor to print whether or not int is weird.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if (N % 2 == 0) {
            if (N<5 && N>=2) {
                System.out.println("Not Weird");
            } else if (N>=6 && N<=20) {
                System.out.println("Weird");
            } else if (N>20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        //Task 4
        //
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double newDouble = sc.nextDouble();
        String startingWord = sc.next();
        String wholeString = sc.nextLine();
        System.out.println("String: " + startingWord + wholeString);
        System.out.println("Double: " + newDouble);
        System.out.println("Int: " + number);
        sc.close();
    }
}
