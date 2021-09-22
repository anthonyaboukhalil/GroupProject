package com.example;

public final class App {
    private App() {
    }

 
    public static void main(String[] args) {
        int n  = 50 ;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                sum+= i;

        }
        System.out.println("The sum of all even integers is: " + sum);
    
    }
}
