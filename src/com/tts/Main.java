package com.tts;
import java.util.*;


public class Main {

    int num;
    int size;
    int power;

    public Main(int num, int size, int power) {
        this.num = num;
        this.size = size;
        this.power = power;
    }
//


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static void main(String[] args) {
        // write your code here
//        Ask the user for 5 numbers and store them in an array list.
//        Then find the sum, product, largest, and smallest of those numbers.
        //loop thru array for sum
        Scanner input = new Scanner(System.in);
        //this is how you create an arraylist
//        ArrayList<Integer> numArray = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number.");
            int num = input.nextInt();
            numArray.add(num);
        }
        System.out.println("your array of numbers is " + numArray);
//
////1. find th sum of the numbers:
        int sum = 0;
        for (int num : numArray) {
            sum += num;
        }
        System.out.println("The sum of input numbers is " + sum);
////2. find the product
//        int mult = 1;
//        for (int num : numArray) {
//            mult *= num;
//        }
//        System.out.println("the product of input numbers is " + mult);
////3. find the largest number
//        int maxNum = 0;
//        for (int i = 0; i < 5; i++) {
//            if (numArray.get(i) >= maxNum) {
//                maxNum = numArray.get(i);
//            }
//        }
//        System.out.println("The largest number is " + maxNum);
////4. find smallest number
//        int minNum = 0;
//        for (int i = 0; i < 5; i++) {
//            if (numArray.get(i) <= minNum) {
//                minNum = numArray.get(i);
//            }
//        }
//        System.out.println("The smallest number is " + minNum);
        //What is the output?
//        double[ ] exampleArray = {1,5,6,5,4,1};
//        double maximum = exampleArray[0];
//        int index = 0;
//        for (int i = 1; i<exampleArray.length>; i++){
//            if (exampleArray[ i ] > maximum) {
//                maximum = exampleArray[ i ];
//                index = i;
//            }
//        }
//        System.out.println(index);
////
//        Write a public static method called "toPower" that takes in as parameters two integers called size and power.
//        The method should return an array of size "size" with each array index raised to the value of "power."
//        So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the
//        following result: [0,1,4,9].

//            ArrayList<Integer> numArray = new ArrayList<Integer>(4);
            System.out.println("Enter a number for the length of an Array.");
            int size = input.nextInt();
            input.nextLine();
            System.out.println("Enter a number where each array index will be raised to the power .");
            int power = input.nextInt();


//        int [] arr = {0,1,2,3};
//            int[] arr = (int) {0,1,2,3};

            Integer powerArray[] = new Integer[size];
        public static void toPower(){
            for (int i = 0; i < size; i++) {
                powerArray[i] = Math.pow(size, power);
                System.out.println(powerArray[i]);
            }

        }

///

    }
}

