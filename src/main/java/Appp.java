/*
Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.


BAC = (A × 5.14 / W × r) − .015 × H

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
 */


import java.util.*;


public class Appp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Variables used.
        String d;
        int ounces;
        int weight;
        int H;
        double BAC;
        int input;

        System.out.print("Enter a 1 is you are a male or a 2 if you are female: ");
        input = in.nextInt();


        switch (input)
        {
            case 1: //Male
                System.out.print("How many ounces of alcohol did you have? ");
                ounces = in.nextInt();

                System.out.print("What is your weight, in pounds? ");
                weight = in.nextInt();

                System.out.print("How many hours has it been since your last drink? ");
                H = in.nextInt();

                BAC = (ounces * 5.14 / weight * 0.73) - (0.015 * H); //This formula is for male since 0.73

                System.out.printf("Your BAC is %.6f",BAC); //Printing the total BAC
                System.out.println(" ");

                if(BAC < 0.08) //Here we are comparing with the standard in order to check if the male can drive legally or not
                {
                    System.out.print("It is legal for you to drive.");
                }
                else
                {
                    System.out.print("It is not legal for you to drive.");
                }
                break;

            case 2:  //Female

                System.out.print("How many ounces of alcohol did you have? ");
                ounces = in.nextInt();

                System.out.print("What is your weight, in pounds? ");
                weight = in.nextInt();

                System.out.print("How many hours has it been since your last drink? ");
                H = in.nextInt();

                BAC = (ounces * 5.14 / weight * 0.66) - (0.015 * H); //This formula is for male since 0.73

                System.out.printf("Your BAC is %.6f",BAC); //Printing the total BAC
                System.out.println(" ");

                if(BAC < 0.08) //Here we are comparing with the standard in order to check if the male can drive legally or not
                {
                    System.out.print("It is legal for you to drive.");
                }
                else
                {
                    System.out.print("It is not legal for you to drive.");
                }
                break;

            default:
                System.out.println("The value inputted is incorrect.");

        }

    }
}
