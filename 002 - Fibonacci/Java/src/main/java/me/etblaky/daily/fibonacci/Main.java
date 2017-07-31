package me.etblaky.daily.fibonacci;

import java.util.Scanner;

/**
 * Created by ETblaky on 30/07/2017.
 */
public class Main {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("1. Generate Fibonacci");
        System.out.println("2. Get Number from index");

        int option = reader.nextInt();

        switch (option){
            case 1:
                generate();
            case 2:
                System.out.println("From which index you want to get the number? ");
                getFromIndex(reader.nextInt());
        }

    }

    public static void generate(){

        int n0 = 0;
        int n1 = 1;

        while (true){
            System.out.println(n0);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

            System.out.println(n1);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

            n0 = n0 + n1;
            n1 = n1 + n0;

        }

    }

    public static void getFromIndex(int index){

        double phi = (1 + Math.sqrt(5)) / 2;
        double fx = (Math.pow(phi, index) - Math.pow(1 - phi, index)) / Math.sqrt(5);

        System.out.println(Math.round(fx));

    }

}
