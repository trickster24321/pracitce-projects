package org.example;


import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

    int num1 = 0;
    int guess;
    int yes;

    System.out.println("do you wanna guess the number");

    Scanner scanner2 = new Scanner(System.in);
    System.out.println("if yes input 1 if not input 0");

    yes = scanner2.nextInt();
    do {
            num1 = (int) (Math.random() * 101);

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("enter your guessed number");

            guess = scanner1.nextInt();

            if (guess == num1) {
                System.out.println("answer is correct: your answer: " + num1);

            } else {
                System.out.println("your answer is wrong: correct answer:" + num1);

                Scanner scanner3 = new Scanner(System.in);
                System.out.println("do you wanna go again? 1 or 0");

                yes = scanner3.nextInt();
            }


    } while (yes == 1);

        System.out.println("thank you for playing");
    }
    }