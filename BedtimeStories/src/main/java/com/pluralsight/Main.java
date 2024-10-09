package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        try {

            String goldilocksFilename = "goldilocks.txt";
            String hanselAndGretelFilename = "hansel_and_gretel.tx";
            String maryHadALittleLambFilename = "mary_had_a_little_lamb.txt";

            String Answer = PromptForString();

            if (Answer.equalsIgnoreCase(goldilocksFilename)) {
                FileInputStream fis = new FileInputStream(goldilocksFilename);
                Scanner s = new Scanner(fis);
                System.out.println("--".repeat(50) + "\n");
                int lineCount = 1;

                while (s.hasNextLine()) {
                    String string = s.nextLine();
                    System.out.println(lineCount++ + ": " + string);
                }
            }
            else if (Answer.equalsIgnoreCase(hanselAndGretelFilename)) {
                FileInputStream fis = new FileInputStream(hanselAndGretelFilename);
                Scanner s = new Scanner(fis);
                System.out.println("--".repeat(50) + "\n");
                int lineCount = 1;

                while (s.hasNextLine()) {
                    String string = s.nextLine();
                    System.out.println(lineCount++ + ": " + string);
                }
            }
            else if (Answer.equalsIgnoreCase(maryHadALittleLambFilename)) {
                FileInputStream fis = new FileInputStream(hanselAndGretelFilename);
                Scanner s = new Scanner(fis);
                System.out.println("--".repeat(50) + "\n");
                int lineCount = 1;

                while (s.hasNextLine()) {
                    String string = s.nextLine();
                    System.out.println(lineCount++ + ": " + string);
                }
                s.close();
            }
        }catch (Exception e){
            System.out.println("Whoops, not an option!");
            e.printStackTrace();
        }

    }

    public static String PromptForString() {
        System.out.println("\nPoems available to read 'goldilocks.txt' , 'hansel_and_gretel.txt' , " +
                "'mary_had_a_little_lamb.txt' :");
        System.out.println("--".repeat(50));
        System.out.print("Type out poem name here: ");
        return sc.nextLine();
    }
}

