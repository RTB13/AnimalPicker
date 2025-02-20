import java.util.Scanner;

public class AnimalPicker {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String choice = "";

    	
    	while(true) {
        	System.out.println("Would you like to see a cat or a dot?");
            choice = scanner.nextLine().trim().toLowerCase();
            
            if (choice.equals("dog")) {
                System.out.println("DOG ASCII ART HERE");
                break;
            } else if (choice.equals("cat")) {
                System.out.println("CAT ASCII ART HERE");
                break;
            }
    	}         
    	
    }
}
