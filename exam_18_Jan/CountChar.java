package exam_18_Jan;

import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Provide a String to count characters");
    String input = sc.nextLine();
    char[] ch = input.toCharArray();
    int counter =0;
    for(char e: ch){

        if(e == ' '){
          continue;
        }
        counter++;
    }
        System.out.println("no. of characters in a String: " +counter);
sc.close();
    }
}
