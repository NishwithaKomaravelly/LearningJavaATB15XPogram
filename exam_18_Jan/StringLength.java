package exam_18_Jan;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide an input to check the length");
        String input = sc.nextLine();
        if(input.length()>10){
            System.out.println("Length of the given String " +input+" is greater than 10 and length is: " +input.length());
        }
        else System.out.println("Length of the given String " +input+ " is less than 10 and length is: " +input.length() );
        sc.close();
    }
}
