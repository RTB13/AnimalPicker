import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which animal would you like to see? (dog/cat)");
        String choice = scanner.nextLine().toLowerCase();
        
        if (choice.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (choice.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        } else {
            System.out.println("Invalid choice! Please choose either 'dog' or 'cat'.");
        }        
        scanner.close();
    }
}
