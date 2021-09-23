package com.example;

import java.util.Scanner;

public  class App {

    public static  double evenAvg(int n, int sum){
        int average = sum/n;
        return average;
    }

    public static double avgDivisibleBy(int n, int divisor) {
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
            return (double) sum/count;
        }
        else {
            return 0;
        }
    }
        
    public static double oddAvg(int n, int sum){
        return (double) sum/n;
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer ( (-) signs will be removed): ");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please Enter a Valid Integer!\n");
            System.out.println("Enter a positive integer ( (-) signs will be removed): ");
        }
        int x = scanner.nextInt();
        scanner.close();
        return Math.abs(x);
    }



    public static void main(String[] args) {
        int n =userInput();
        int counter=0;
        int divisor = 10;
        int sum = 0, sum_odd =0, count_odd = 0;
        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                sum+= i;
                if (i != 0)
                    counter++;}
            else if(i%2==1){
                sum_odd += i;
                if (i != 0)
                    count_odd++;
            }



            }



        System.out.println("The sum of all even integers is: " + sum);
        System.out.printf("The average of all integers divisble by %d is %f%n", divisor, avgDivisibleBy(50, divisor));


        System.out.println("The sum of all odd integers is: " + sum_odd);
        System.out.println("Average of all odd integers is: " + oddAvg(count_odd, sum_odd));

        System.out.println("The average of all even integers is: " + evenAvg(counter,sum));


    }
}
