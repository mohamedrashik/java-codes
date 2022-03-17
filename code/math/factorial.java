package code.math;

import java.math.BigInteger;
import java.util.*;

class Factorial {
    Factorial(int n) {
        long out = 1;
        for (int fact = n; fact >= 1; fact--) {
            out *= fact;
        }
        System.out.println(out);

    }
}

class FactorialBigNumbers {
    FactorialBigNumbers(int n) {
        BigInteger out = BigInteger.ONE;
        for (int fact = n; fact >= 1; fact--) {
            out = out.multiply(BigInteger.valueOf(fact));
        }
        System.out.println(out);

    }
}

class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number = scanner.nextInt();
       // new Factorial(number);
       new FactorialBigNumbers(number);
        scanner.close();
    }
}