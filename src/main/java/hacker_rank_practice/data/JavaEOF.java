package hacker_rank_practice.data;

import java.util.Scanner;

public class JavaEOF {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);

            int n = 0;
            while (scan.hasNext()){
                n++;
                System.out.println(n + " " + scan.nextLine());
            }
            scan.close();
        }

//****** scan.hasNext will continue scanning until theres no more data to read. ******
//    ****** initiating n to 0 and while the while statement will number each line until there's no more data to read. *****

}
