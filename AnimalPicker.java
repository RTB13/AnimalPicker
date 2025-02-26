import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which animal would you like to see? (dog/cat)");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("dog")) {
            System.out.println("(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        } else if (choice.equals("cat")) {
            System.out.println("|\\---/|\n| o_o |\n \\_^_/");

        } else if (choice.equals("fish")) {
            System.out.println(
                    "/\"*._         _\n      .-*\'`    `*-.._.-\'/\n    < * ))     ,       ( \n      `*-._`._(__.--*\"`.\\");
        } else if (choice.equals("bird")) {
            System.out.println("  , _ ,\n ( o o )\n/\'` \' `\'\\\n|\'\'\'\'\'\'\'|\n|\\\\\'\'\'//|\n   \"\"\"");
        } else {
            System.out.println("Invalid choice! Please choose either 'dog' or 'cat'.");
        }
        scanner.close();

    }
}
