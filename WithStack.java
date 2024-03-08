import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
import java.util.ArrayList;


public class WithStack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner input = new Scanner(System.in);
        ArrayList<Character> aList = new ArrayList<Character>();


        System.out.println("Enter string: ");
        String oriStr = input.nextLine().toLowerCase();

        for (int i = 0 ; i < oriStr.length(); i++) {
            st.push(oriStr.charAt(i));
        }        
        Collections.reverse(st);
        st.toString();

        StringBuilder build = new StringBuilder();
        for (int i = 0 ; i < st.size() ; i++) {
            build.append(st.get(i));
        }
        String reversed_string = build.toString();

        if (oriStr.equals(reversed_string)) {
            System.out.println("THAT IS A PALINDROME");
        } else {
            System.out.println("THAT IS NOT A PALINDROME");
        }
    }
}
