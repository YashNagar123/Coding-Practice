import java.util.Scanner;

public class program_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = "Fi_er";

        String input2 = "Fever:Filer:Fibre:Fiber:Offer:tailor:Fixer";

        String output = "";

        input1 = input1.toUpperCase();

        String[] arr = input2.toUpperCase().split(":");

        int pos = input1.indexOf('_');

        for (String s : arr) {

            String temp = input1;

            char ch = s.charAt(pos);

            temp = temp.replace('_', ch);

            if (temp.equals(s)) {

                if (output == "") {

                    output = temp;
                } else {
                    output += ":" + temp;
                }
            }
        }

        if(output == "") output = "ERROR";

        System.out.println(output);

    }
}
