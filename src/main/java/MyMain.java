import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 1;
        double m = 0;
        double trueRe = Math.sqrt(x);
        while (!(Math.abs(trueRe - n) <= 0.00001)) {
            m = (n + x/n) / 2;
            n = m;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double result = 1;
        if (x == 0) {
            return 1;
        }
        else {
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        }
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double realE = Math.E;
        double estE = 0;
        int i = 0;
        while (!(Math.abs(realE - estE) <= 0.00001)) {
            estE += (1/factorial(i));
            i++;
        }
        return estE;
    }
    
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        double num = scan.nextDouble();
        System.out.println("The squareroot of "+num+" is "+babylonian(num));

        System.out.println("The value of e is roughly :"+calculateE());
        
        scan.close();
    }
}
