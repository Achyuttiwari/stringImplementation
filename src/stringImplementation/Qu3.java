package stringImplementation;

import java.util.Scanner;

public class Qu3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String input = ob.nextLine();

        input = input.toLowerCase();
        input = input.replace('a', '*');
        input = input.replace('e', '*');
        input = input.replace('i', '*');
        input = input.replace('o', '*');
        input = input.replace('u', '*');

        System.out.println(input);

        ob.close();
    }
}
