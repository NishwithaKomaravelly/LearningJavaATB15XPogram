package exam_18_Jan;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        System.out.println("Provide input for String1: ");
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        System.out.println("Provide input for String2: ");
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();

        if(s1.equals(s2)){
            System.out.println("Both the given strings are equal");
        }
        else System.out.println(" Given Strings are not equal");

        sc1.close();
        sc2.close();

    }
}
