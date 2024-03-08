import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class WithoutStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> aList = new ArrayList<String>();
        
        System.out.println("Enter string: ");
        String oriStr = input.nextLine().toLowerCase();
        String revStr = "";

        for (int i = 0 ; i < oriStr.length() ; i++) {
            revStr = oriStr.charAt(i) + revStr;
            revStr.toLowerCase();
        }

        if (oriStr.equals(revStr)) {
            System.out.println("THAT IS A PALINDROME");
        } else {
            System.out.println("THAT IS NOT A PALINDROME");
        }
    
    }
}