package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // testing a prime number
        //prime number is a number that has only itself and as a factor


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        for(int i=1; i<=num;i++){
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0)
                    count= count+1;

            }
            if(count==2)  // when count is 2 that means the number only divided by itself and 1;
                System.out.println(i + " is a prime number ");
            else
                System.out.println(i + " is not a prime number");




        }


    }
}
