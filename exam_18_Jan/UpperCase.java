package exam_18_Jan;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println("Please provide a string to convert to Upper case");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String upperCaseInput = input.toUpperCase();
        System.out.println("Converted given input '"+input+ "' in to upper case: " +upperCaseInput);

    }
}
