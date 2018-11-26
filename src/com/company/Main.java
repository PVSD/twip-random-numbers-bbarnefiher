package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ranNum = -1;
        int[] uniqueNumbers = new int[101];
        int count = 0;
        int timesLoopRuns = 0;
        int attemptCount = 0;
        Scanner stringReader = new Scanner(System.in);
        System.out.println("How many times");
        String userInput = stringReader.nextLine();
        while (count != 100){
            timesLoopRuns++;
        for (int i = 0; i < 10; i++) { //generates random number and puts it into array
            attemptCount++;
            ranNum = (int) (Math.random() * 100) + 1;
            if (ranNum != uniqueNumbers[ranNum]) {
                uniqueNumbers[ranNum] = ranNum;
                count++;
            }
            if (count == 100){
                break;
            }
        }
        }
        for (int i = 1; i < uniqueNumbers.length; i++){
            System.out.println(uniqueNumbers[i]);
        }
        System.out.println("number of loop iterations: " + timesLoopRuns);
        System.out.println("total attempts: " + attemptCount);




    }
}
