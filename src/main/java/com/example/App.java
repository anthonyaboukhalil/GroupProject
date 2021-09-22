package com.example;

public final class App {
    private App() {
    }

    public static int avgDivisibleBy(int n, int divisor) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if(i % divisor == 0) {
                sum += i;
                if (i != 0) {
                    count++;
                }
            }
        }
        if (count != 0) {
            return sum/count;
        }
        else {
            return 0;
        }
        
    }

 
    public static void main(String[] args) {
        int n  = 50 ;
        int divisor = 10;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if(i%2==0)
                sum+= i;
        }
        System.out.println("The sum of all even integers is: " + sum);
        System.out.printf("The average of all integers divisble by %d is %d%n", divisor, avgDivisibleBy(50, divisor));
    
    }
}
