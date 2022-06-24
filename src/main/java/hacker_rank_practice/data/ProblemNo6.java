package hacker_rank_practice.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProblemNo6 {
//    Task
//    Given an integer, N, print its first 10 multiples. Each multiple N x i
//    (where 1 <= n <= 10) should be printed on a new line in the form: N x i = result.
//
//    Input Format:
//    A single integer, N.
//
//    Constraints:
//    2 <= N <= 20
//    Output Format
//
//    Print 10 lines of output; each line i (where 1 <= n <= 10)
//    contains the result of N x i in the form:
//    N x i = result.

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
//       ^^ N IS INT INPUTTED BY USER         ^^^ACTS LIKE SCANNER (NEED TO RESEARCH MORE/READ DOCS)

        if (2 <= N && N <= 20) {
//            ^^^^^^^^^^ THIS IS THE CONSTRAINT ASSIGNED. ******* PAY CLOSE ATTENTION TO CONSTRAINTS...FIRST FAIL BECAUSE OF THIS. **********
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + N * i);
//                ^^^^ THIS IS WHAT NEEDS TO LOOPED THROUGH (i)
            }
        }

        bufferedReader.close();
    }

}
