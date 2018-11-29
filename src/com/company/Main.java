package com.company;


public class Main {

    public static void main(String[] args) {
        int ranNum = -1;

        int[] uniqueNumbers = new int[101];
        int count = 0;
        int timesLoopRuns = 0;
        int attemptCount = 0;

        int theAverage = 0;

        int timesRun = 1000;
        int[] numAverageTimesRun = new int[timesRun];
        for (int i = 0; i < timesRun; i++) {//makes entire loop run x many times
            attemptCount = 0;
            count = 0;
            timesLoopRuns = 0;
            while (count != 100) {
                timesLoopRuns++;
                for (int k = 0; k < 10; k++) { //generates random number and puts it into array
                    attemptCount++;
                    // System.out.println("inside");
                    ranNum = (int) (Math.random() * 100) + 1;
                    if (ranNum != uniqueNumbers[ranNum]) {
                        uniqueNumbers[ranNum] = ranNum;
                        count++;
                    }
                    if (count == 100) {
                        //System.out.println("BREAK");
                        break;

                    }
                }
                //System.out.println("times loop runs" + timesLoopRuns);

            }
            //System.out.println("initiating restart loop");
            for(int l = 0; l < uniqueNumbers.length; l++){
                uniqueNumbers[l] = 0;
                // System.out.println("clear one");
            }
            numAverageTimesRun[i] = attemptCount;

//avg = count/timesran

            //System.out.println("done restart");

        }
        for (int j = 1; j < uniqueNumbers.length; j++){
            // System.out.println(uniqueNumbers[j]);
        }
        //System.out.println("number of loop iterations: " + timesLoopRuns);
        //System.out.println("total attempts: " + attemptCount);
        int allTimesRan = 0;
        for (int i = 0; i < numAverageTimesRun.length; i++){
            //System.out.println(numAverageTimesRun[i]);
            allTimesRan += numAverageTimesRun[i];
        }
        theAverage = allTimesRan / timesRun;
        System.out.println("The average time it took to hit all numbers out of " + timesRun + " tries was " + theAverage + " times.");

        System.out.println("\nWhen we increase the total amount of tries in the loop, we are decreasing our average number spread because we have a larger sample size of data. \n" +
                "This leads to more accurate data because the most common amount of tries is recorded and printed.");

    }
}

