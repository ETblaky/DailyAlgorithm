package me.etblaky.daily.pitagoras;

import java.util.Scanner;

/**
 * Created by ETblaky on 03/08/2017.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("1. Calculate the Hypotenuse");
        System.out.println("2. Verify if triangle is right");

        int option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("What's the first leg?");
                int c1 = in.nextInt();
                System.out.println("What's the second leg?");
                int c2 = in.nextInt();
                System.out.println("The Hypotenuse is: " + pitaguras(c1, c2));
                break;
            case 2:
                System.out.println("What's the first leg?");
                c1 = in.nextInt();
                System.out.println("What's the second leg?");
                c2 = in.nextInt();
                System.out.println("What's the Hypotenuse?");
                int h = in.nextInt();
                System.out.println(pitaguras(c1, c2) == h);
                break;
        }

    }

    private static double pitaguras(int c1, int c2){
        return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
    }

}
