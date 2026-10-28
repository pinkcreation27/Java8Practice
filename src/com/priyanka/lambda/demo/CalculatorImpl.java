package com.priyanka.lambda.demo;

@FunctionalInterface // any interface with only one abstract method , called functional interface
interface  Calculator{
    int subtract(int i1, int i2);//we cant have implementation of abstract method within functional interface
}

public class CalculatorImpl {
    public static void main(String[] args) {

        Calculator calculator = (i1,i2) ->
        {
            if(i2 < i1)
            {
                throw new RuntimeException("Second input is smaller than first input");
            }
            else return i2 - i1;

        };
        System.out.println(calculator.subtract(28,29));
    }
}