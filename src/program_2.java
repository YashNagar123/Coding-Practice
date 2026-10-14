import java.util.Scanner;

public class program_2 {
// print alphabetical order number of each alphabet of string
// input - Hello
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "Hello";

        s = s.toUpperCase();

        for(int i = 0 ; i < s.length() ; i++){

            System.out.print((int)s.charAt(i) - 64);
        }


    }
}
