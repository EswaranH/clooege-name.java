import java.util.Scanner;

public class CollegeNameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your college name: ");
        String collegeName = scanner.nextLine();

        System.out.println("Welcome to " + collegeName + "!");
        
        scanner.close();
    }
}
