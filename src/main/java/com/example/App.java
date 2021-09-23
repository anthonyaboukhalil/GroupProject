package com.example;

import java.util.Scanner;

public  class App {

    public static  double evenAvg(int n, int sum){
        int average = sum/n;
        return average;
    }


    public static double oddAvg(int n, int sum){
        return (double) sum/n;
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        System.out.println("Enter a positive integer: ");
        while(error){
            while(!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Please Enter a Valid Integer!\n");
                System.out.println("Enter a positive integer: ");
            }
            int x = scanner.nextInt();
            if(x <= 0){
                System.out.println("Positive integers only please: ");
                error = true;
            }else{
                error = false;
                scanner.close();
                return x;
            }
    }
        scanner.close();
        return 1;
    }



    public static void main(String[] args) {
        int n =userInput();
        int counter=0;
        int sum = 0, sum_odd =0, count_odd = 0;


        for (int i = 0; i < n; i++) {
            if(i%2==0){
                sum+= i;
                counter++;}
            else if(i%2==1){
                sum_odd += i;
                count_odd++;
            }



            }




        System.out.println("The sum of all even integers is: " + sum);


        System.out.println("The sum of all odd integers is: " + sum_odd);
        System.out.println("Average of all odd integers is: " + oddAvg(count_odd, sum_odd));

        System.out.println("The average of all even integers is: " + evenAvg(counter,sum));


    }
}
