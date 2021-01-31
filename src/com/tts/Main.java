package com.tts;
import java.util.*;


public class Main {

    int num;

    public static void main(String[] args) {
        // write your code here
//        Ask the user for 5 numbers and store them in an array list.
//        Then find the sum, product, largest, and smallest of those numbers.
        //loop thru array for sum
        Scanner input = new Scanner(System.in);
        //this is how you create an arraylist
        ArrayList<Integer> numArray = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number.");
            int num = input.nextInt();
            numArray.add(num);
        }
        System.out.println("your array of numbers is " + numArray);

//1. find th sum of the numbers:
        int sum = 0;
        for (int num : numArray) {
            sum += num;
        }
        System.out.println("The sum of input numbers is " + sum);
//2. find the product
        int mult = 1;
        for (int num : numArray) {
            mult *= num;
        }
        System.out.println("the product of input numbers is " + mult);
//3. find the largest number
        int maxNum = 0;
        for (int i = 0; i < 5; i++) {
            if (numArray.get(i) >= maxNum) {
                maxNum = numArray.get(i);
            }
        }
        System.out.println("The largest number is " + maxNum);
//4. find smallest number
        int minNum = 0;
        for (int i = 0; i < 5; i++) {
            if (numArray.get(i) <= minNum) {
                minNum = numArray.get(i);
            }
        }
        System.out.println("The smallest number is " + minNum);




    }
}

