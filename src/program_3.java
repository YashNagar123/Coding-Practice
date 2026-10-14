import java.util.Scanner;

public class program_3 {
// print arrangement : concat 1st char and last char , 2nd char and 2nd last char
// input 1  - Hello
// output 1  - HOELL
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "Hello";

        s = s.toUpperCase();

        String ans = "";

        for(int i = 0 ; i < s.length() / 2 ; i++){

            char ch1 = s.charAt(i);

            char ch2 = s.charAt(s.length() - 1 - i);

            ans = ans + ch1 + ch2 ;

        }

        if(s.length() % 2 != 0){

            ans = ans + s.charAt(s.length() / 2);
        }

        System.out.println(ans);
    }
}
