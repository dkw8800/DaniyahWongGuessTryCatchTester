package com.company;
    import java.util.InputMismatchException;
    import java.util.Scanner;
public class DWongLib {
    public static void initialObjective1()
    {
        int guessnumber = 0;
        int answer = (int)(10.0*Math.random());
        int game = 0;

        System.out.println("Enter your name!");
        Scanner username = new Scanner(System.in);
        String use = username.nextLine();

        while(game == 0) {
            System.out.println("Enter a number to guess!");

            Scanner user = new Scanner(System.in);
            try {
                int useranswer = user.nextInt();
                guessnumber++;
                if (answer == useranswer) {
                    System.out.println("Correct " + use + "! The number of guesses you ended with is" + guessnumber);
                    game = 1;
                }
            }
            catch(InputMismatchException error)
            {
                System.out.println("You need to give me a number!");
                user.next();
            }
        }
    }
}
