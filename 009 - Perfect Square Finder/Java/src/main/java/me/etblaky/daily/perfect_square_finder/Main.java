package me.etblaky.daily.perfect_square_finder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ETblaky on 01/11/2017.
 */
public class Main {

    private static ArrayList<Integer> pSquares = new ArrayList<Integer>();

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Find perfect squares");
        System.out.println("From: ");
        int from = s.nextInt();

        System.out.println("To:");
        int to = s.nextInt();

        System.out.println(Arrays.toString(find(from, to).toArray()));

    }

    private static ArrayList<Integer> find(int f, int t){
        for(int i = f; i < t; i ++){
            if(Math.sqrt(i) % 1 == 0){
                pSquares.add(i);
            }
        }

        return pSquares;
    }

}
