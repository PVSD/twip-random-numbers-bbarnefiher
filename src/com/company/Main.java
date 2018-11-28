package com.company;


public class Main {

    public static void main(String[] args) {
        int ranNum = -1;
        int numAverageTimesRun;
        int[] uniqueNumbers = new int[101];
        int count = 0;
        int timesLoopRuns = 0;
        int attemptCount = 0;

        int timesRun = 100;
        for (int i = 0; i < timesRun; i++) {//makes entire loop run x many times
            while (count != 100) {
                timesLoopRuns++;
                for (int k = 0; k < 10; k++) { //generates random number and puts it into array
                    attemptCount++;
                    ranNum = (int) (Math.random() * 100) + 1;
                    if (ranNum != uniqueNumbers[ranNum]) {
                        uniqueNumbers[ranNum] = ranNum;
                        count++;
                    }
                    if (count == 100) {
                        break;
                    }
                }
                
            }

        }
        for (int j = 1; j < uniqueNumbers.length; j++){
            System.out.println(uniqueNumbers[j]);
        }
        System.out.println("number of loop iterations: " + timesLoopRuns);
        System.out.println("total attempts: " + attemptCount);




    }
}
