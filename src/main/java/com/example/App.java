package com.example;

public final class App {
    private App() {
    }

 
    public static void main(String[] args) {
        int n  = 50 ;
        int divideby = 10;
        int sum = 0;
        int sumDivisibleBy = 0;
        int divisibleCount = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                sum+= i;
            if(i % divideby == 0) {
                sumDivisibleBy += i;
                if (i != 0) {
                    divisibleCount++;
                }
            }
        }
        System.out.println("The sum of all even integers is: " + sum);
        if (sumDivisibleBy != 0) {
            System.out.printf("The average of all integers divisble by %d is %d%n", divideby, sumDivisibleBy/divisibleCount);
        }
    
    }
}
