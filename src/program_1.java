import java.util.Scanner;

public class program_1 {
// print ASCII value of each character of string
// input - Hello
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "Hello";

        for(int i = 0 ; i < s.length() ; i++){

            System.out.print((int)s.charAt(i));
        }


    }
}
