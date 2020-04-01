package se.lexicon.mark;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        //double x = 100;
        //double y = 0;

        Scanner scan = new Scanner(System.in);
        double x;
        double y;

        System.out.println("Enter first number: ");
        x = scan.nextDouble();
        System.out.println("Enter second number to divide with: ");
        y = scan.nextDouble();

        try {
            if (y == 0){
                throw new ArithmeticException();
                            }
            double result = divide(x,y);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("The calculation went terribly wrong: ");
            e.printStackTrace();
        }

    }    public static double divide(double x , double y){
    return x/y;
}
}
