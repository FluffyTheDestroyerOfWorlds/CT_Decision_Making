package com.example;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class MyDecision {
    public static void main(String[] args) {
        String sAnswer = "";

        Scanner in = new Scanner(System.in);

        Boolean AreYouAtClass = false;
        Boolean KidGone = false;

        while (!AreYouAtClass) {
            System.out.println("Alarm goes off- Do you hit snooze? (Y/N): ");
            sAnswer = in.nextLine();
            if (sAnswer.equalsIgnoreCase("N")) {
                System.out.println("Great you got up - Do you want coffee? (Y/N)");
                sAnswer = in.nextLine();
                if (sAnswer.equalsIgnoreCase("N")) {
                    System.out.println("Are you sure - the kids are about to get up? (Y/N)");
                    sAnswer = in.nextLine();
                    if (sAnswer.equalsIgnoreCase("Y")) {
                        System.out.println("OK. Good Luck with that.");
                        sAnswer = "n";
                    } else {
                        sAnswer = "y";
                    }
                }
                if (sAnswer.equalsIgnoreCase("Y")){

                    System.out.println("Do you need cream or sugar? (Y/N)");
                    sAnswer = in.nextLine();
                    if (sAnswer.equalsIgnoreCase("N")) {
                        System.out.println("Black it is.");
                    } else {
                        System.out.println("Gotcha cream and sugar is in!");
                    }
                }

                System.out.println("Do you want to start preparing breakfast for the family? (Y/N)");
                sAnswer = in.nextLine();
                if (sAnswer.equalsIgnoreCase("N")) {
                    System.out.println("Man, you are running out of time. Start soon!");
                    System.out.println("OOOPS! Kid is up he is gonna demand breakfast - Start? (Y/N");
                    sAnswer = in.nextLine();
                    if (sAnswer.equalsIgnoreCase("N")) {
                        System.out.println("Wife Override - get moving!");
                    } else {
                        System.out.println("Good choice the wife started looking at you funny");
                    }
                } else {
                    System.out.println("Great! Breakfast is important for energy.");
                }
                Integer fakeTime = 15;
                Integer fakeHour = 8;
                while (!KidGone) {
                    System.out.println("It is " + fakeHour + ":" + fakeTime + " - Is the child ready? (Y/N)");
                    sAnswer = in.nextLine();
                    if (sAnswer.equalsIgnoreCase("y")) {
                        KidGone = true;
                        System.out.println("Nice the kid is on the bus!");
                    } else {
                        fakeTime = fakeTime + 15;
                        if (fakeTime == 60) {
                            fakeHour = fakeHour + 1;
                            fakeTime = 0;
                        }
                    }

                }

                System.out.println("OK - the house is empty - Did you remember everything? (Y/N)");
                sAnswer = in.nextLine();
                if (sAnswer.equalsIgnoreCase("Y")) {
                    System.out.println("Awesome time for school for you!");
                    AreYouAtClass = true;
                } else {
                    System.out.println("Tough do it later its time for school slacker!");
                    AreYouAtClass = true;
                }
            }
        }
        }

    }



