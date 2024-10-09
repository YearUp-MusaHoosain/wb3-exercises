package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            String[] TenQuotes =
                    {
                            "1 - All right, Mr. DeMille, I'm ready for my closeup.",
                            "2 - Fasten your seatbelts. It's going to be a bumpy night.",
                            "3 - Frankly, my dear, I don’t give a damn.",
                            "4 - Go ahead, make my day.",
                            "5 - Here's looking at you, kid.",
                            "6 - I love the smell of napalm in the morning.",
                            "7 - I'm going to make him an offer he can't refuse.",
                            "8 - May the Force be with you.",
                            "9 - Toto, I've got a feeling we're not in Kansas anymore.",
                            "10 - What we've got here is failure to communicate. You talking to me?"
                    };
            // Code to prompt the user
            System.out.print("Select a Quote (Select #1 - #10): ");
            int index = sc.nextInt();
            index--;
            System.out.println(TenQuotes[index]);
        }
        catch (Exception e){
            System.out.println("That is invalid. Sorry");
            e.printStackTrace();
        }
    }
}