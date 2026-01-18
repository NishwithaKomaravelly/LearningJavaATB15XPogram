package exam_18_Jan;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide string input:");
        String input =scanner.nextLine();
        String temp = "";
        for (int i =1 ; i<=input.length();i++){
             temp = temp + input.charAt(input.length()-i);
        }
        System.out.println(temp);
    }
}
