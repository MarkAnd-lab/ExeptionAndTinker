package se.lexicon.mark;

public class App
{
    public static void main(String[] args) {
        double x = 100;
        double y = 0;

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
