package com.example;

public final class App {
    private App() {
    }

 
    public static void main(String[] args) {
        int n  = 50 ;
        int sum = 0, sum_odd = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                sum+= i;
            if(i%2==1)
                sum_odd += i;

        }
        System.out.println("The sum of all even integers is: " + sum);

        System.out.println("The sum of all odd integers is: " + sum_odd);
        System.out.println("Average of all odd integers is: " + (double) sum_odd/n);
    }
}
