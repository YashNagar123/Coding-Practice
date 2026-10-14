import java.util.Scanner;

public class program_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "World Wide Web";

        s = s.toUpperCase();

        String[] ans = s.split(" ");

        String result = ""; // Initialize an empty string to store the final output

        for (String word : ans) {

            int wordSum = 0; // Reset sum for each individual word

            for (int i = 0; i < word.length() / 2; i++) {

                int ch1 = word.charAt(i) - 64;

                int ch2 = word.charAt(word.length() - 1 - i) - 64;

                int dif = Math.abs(ch1 - ch2);

                wordSum += dif;
            }

            if (word.length() % 2 != 0) {

                int ch3 = word.charAt(word.length() / 2) - 64;

                wordSum += ch3;
            }

            // Concatenate each word's sum to the final result string
            result += wordSum;
        }

        System.out.println(result);
    }
}