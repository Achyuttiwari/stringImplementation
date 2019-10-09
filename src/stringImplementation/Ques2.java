package stringImplementation;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String a = ob.nextLine();
        int index = ob.nextInt();
        String substring = a.substring(index);
        System.out.println(substring);

        ob.close();
    }
}
