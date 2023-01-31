package org.example;

import org.example.arithmetic.Addition;
import org.example.arithmetic.Multiplication;
import org.example.arithmetic.Subtraction;
import org.example.logger.FileLogger;
import org.example.logger.FileLoggerConfiguration;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();

/*        System.out.println("Addition result: " + addition.sum(6, 10)
                + "\nMultiplication result: " + multiplication.mult(10, 5)
                + "\nSubtraction result " + subtraction.sub(10, 1));*/
        FileLogger logger = new FileLogger(new FileLoggerConfiguration());
        logger.info("INFO");
    }
}