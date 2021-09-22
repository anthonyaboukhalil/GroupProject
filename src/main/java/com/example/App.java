package com.example;

public  class App {
    
    public static  double evenAvg(int n, int sum){
        int average = sum/n;
        return average;

    }
 
    public static void main(String[] args) {
        int n  = 50 ;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                sum+= i;

        }
        System.out.println("The sum of all even integers is: " + sum);
        System.out.println("The average of all even integers is: " + evenAvg(n,sum));
    
    }
}
