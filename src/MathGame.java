package maths_game;

/* @author Ben Hamilton
    @author        */

import java.util.Scanner;
import java.util.Random;


public class MathGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        maths_game.KeepScore myScore = new maths_game.KeepScore();

        int count = 0;
        int totalAQuestions = 10;


        for (int j = 0; j < totalAQuestions; j++)

        {

            int x = rand.nextInt(totalAQuestions) + 1;
            int y = rand.nextInt(totalAQuestions) + 1;

            System.out.printf("What is %d + %d?\n ", x, y);
            int response = input.nextInt();
            myScore.setScore(response);
            int sum = x + y;


            if (response == sum) {
                System.out.printf(("correct, you have answered %s\n"), myScore.getScore() + " out of " + totalAQuestions + " question(s) correctly");
                System.out.println();
                count++;


            } else {

                System.out.println("incorrect, the correct answer is " + sum);
                System.out.printf(("you have answered %s\n"), (count) + " question(s) correctly");
                System.out.println();

            }
        }

        if (count >= 8) {

            System.out.println("You answered " + count + " out of " + totalAQuestions + " questions correctly");
            System.out.println("Congratulations");

        } else if (5 <= count && count <= 7) {

            System.out.println("You answered " + count + " out of " + totalAQuestions + " questions correctly");
            System.out.println("You did ok, try again to better you score, ");


        } else if (0 <= count && count <= 4) {

            System.out.println("You answered " + count + " out of " + totalAQuestions + " questions correctly");
            System.out.println("O' dear, you need more practice ");
        }

    }
}
