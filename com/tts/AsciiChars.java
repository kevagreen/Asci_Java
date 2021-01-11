package com.tts;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AsciiChars {

    //declare variables




    public AsciiChars(){





  }

    public static void main(String [] args){
        printNumbers();
        printLowerCase();
        printUpperCase();
        userInteraction();

    }

    public static void printNumbers()
    {
        // TODO: print valid numeric input

        System.out.println("Enter an Integer between 1 and 9: ");
        Scanner input = new Scanner(System.in);
        int valueReceived = input.nextInt();
       System.out.println("You entered:  " + valueReceived);

        switch(valueReceived){
            case 1:
                System.out.println("The Ascii value is 49");
                break;
            case 2:
                System.out.println("The Ascii value is 50");
                break;
            case 3:
                System.out.println("The Ascii value is 51");
                break;
            case 4:
                System.out.println("The Ascii value is 52");
                break;
            case 5:
                System.out.println("The Ascii value is 53");
                break;
            case 6:
                System.out.println("The Ascii value is 54");
                break;
            case 7:
                System.out.println("The Ascii value is 55");
                break;
            case 8:
                System.out.println("The Ascii value is 56");
                break;
            case 9:
                System.out.println("The Ascii value is 57");
                break;
            default:
                System.out.println("Wrong Entry.");
                break;
        }


    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        System.out.println("Enter a proper noun: ");
        Scanner inputProperNoun = new Scanner(System.in);
        String nounReceived = inputProperNoun.next();
        byte[] getAscii = nounReceived.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Here's the lowercase version of your entry: " + nounReceived.toLowerCase() + " and the ASCII value: " + getAscii);
    }

    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic input
        System.out.println("Enter a lowercase word: ");
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.next();
        byte[] getAscii = word.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Here's the Uppercase version of your entry: " + word.toUpperCase() + " and the ASCII value " +getAscii);
    }
    public static void userInteraction() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        Boolean playing = true;
        int magicBall = 0;
        int luckyNum = 0;
        int random1 = 0;
        int random2 = 0;
        int random3 = 0;
        int random4 = 0;
        int random5 = 0;
        Integer [] lottoNumbers = new Integer[6];
        System.out.println("Hello  " + response + "!" + " Do you want to answer some questions? ");
        String answer = scanner.next();

        switch(answer){
            case "yes" :
               playing = true;
                break;
            case "no":
                System.out.println("Ok! Come back another day to play!");
                playing = false;
                break;

        }

            if(playing) {
                System.out.println("Do you have a red car? (yes, no):");
                scanner.next();
                System.out.println("What is your favorite pet?");
                scanner.next();
                System.out.println("What is your favorite pet's age?");
                random2 = scanner.nextInt();
                System.out.println("What is your lucky number?");
                luckyNum = scanner.nextInt();
                System.out.println("Do you have a favorite quarterback?");
                String qb = scanner.next();
                switch(qb){
                    case "yes" :
                        System.out.println("What is their jersey number!");
                        magicBall= scanner.nextInt();
                        break;
                    case "no":
                        break;

                }
                System.out.println("What is two-digit model year of your car?");
                random3 = scanner.nextInt();
                System.out.println("What is the first name of the your favorite actor or actress? ");
                scanner.next();
                System.out.println("Enter a random number between 1 and 50");
                random1 = scanner.nextInt();
                System.out.println("Enter a random number between 1 and 20");
                random4 = scanner.nextInt();
                System.out.println("Enter a random number between 1 and 12");
                random5 = scanner.nextInt();
            }
            if(magicBall == 0){
                lottoNumbers[0] = luckyNum;
            }else{
                magicBall = magicBall * random1;
                if(magicBall > 75) {
                    lottoNumbers[0] = magicBall - 75;
                }else {
                    lottoNumbers[0] = magicBall;
                    lottoNumbers[1] = random1 + luckyNum;
                    lottoNumbers[2] = random2 + 1;
                    lottoNumbers[3] = random3;
                    lottoNumbers[4] = random4 * 2;
                    lottoNumbers[5] = random5;
                }

            }
        System.out.println(Arrays.toString(lottoNumbers));
        }

    }

