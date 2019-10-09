package stringImplementation;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String a = ob.nextLine();
        System.out.print("Index: ");
        for (int i = 0; i < (a.length()); i++) {
            System.out.printf("\t%d", i);
        }
        System.out.print("\nchars: ");
        for (int i = 0; i < (a.length()); i++) {
            System.out.printf("\t%s", a.charAt(i));
        }

        ob.close();
    }

}
