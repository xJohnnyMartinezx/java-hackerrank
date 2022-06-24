package hacker_rank_practice.data;

import java.util.Scanner;

public class ProblemNo5 {

    public static void main(String[] args) {
//        Every line of input will contain a String followed by an integer.
//        Each String will have a maximum of  10 alphabetic characters,
//                and each integer will be in the inclusive range from 0 to 999.
//
//        Output Format
//
//        In each line of output there should be two columns:
//        The first column contains the String and is left justified using exactly 15 characters.
//                The second column contains the integer, expressed in exactly 3 digits;
//        if the original input has less than three digits,
//        you must pad your output's leading digits with zeroes.


            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                    System.out.printf("%-15s", s1);
                    System.out.printf("%03d %n", x);

            }
            System.out.println("================================");

//                https://www.homeandlearn.co.uk/java/java_formatted_strings.html#:~:text=To%20get%20the%20left%2Djustified,except%20for%20the%20minus%20sign.
//                    https://www.baeldung.com/java-printstream-printf

//        ****** PRINTF IS A FORMATTING TOOL USED TO PRINT TABLES. *******


    }
}
