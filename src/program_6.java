import java.util.Scanner;

public class program_6 {

    /*

    RULE = First letter of small string in LC
    + all letter of large string in UC
    + nth digit of pin code from LHS
    +  nth digit of pin code from RHS

     CASE 1

     input1 : String : firstName : Rohit
    * input2 : String : lastName : Roy
     * input3 : int : pin code : 462309 { Exact 6 digits}
     * input4 : int : N : 2  { 1<=N<=6 }
     *
     * output : userName: rROHIT60

     CASE 2

     input1 : String : firstName : Kumar
    * input2 : String : lastName : Kumud
     * input3 : int : pin code : 462309 { Exact 6 digits}
     * input4 : int : N : 5  { 1<=N<=6 }
     *
     * output : userName: kKUMUD06

    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fName = sc.nextLine();

        String lName = sc.nextLine();

        int pin_code = sc.nextInt();

        int N = sc.nextInt();

        String output = "";

        if(fName.length() > lName.length()) output = output + lName.toLowerCase().charAt(0) + fName.toUpperCase();
        else if(fName.length() < lName.length()) output = output + fName.toLowerCase().charAt(0) + lName.toUpperCase();
        else{
            if(fName.compareTo(lName) > 0) output = output + lName.charAt(0) + fName.toUpperCase();
            else output = output + fName.charAt(0) + lName.toUpperCase();
        }

       String pin = String.valueOf(pin_code);

        output = output + pin.charAt(N - 1) + pin.charAt(pin.length() - N);

        System.out.println(output);

    }

}
