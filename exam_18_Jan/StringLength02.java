package exam_18_Jan;

import java.util.Scanner;

public class StringLength02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please provide an input");
        String input =  sc.nextLine();
       char[] ch =input.toCharArray();
       int counter =0;

        for (char e : ch){
            counter++;
        }
        System.out.println("length of the String is: "+counter);

    }
}
