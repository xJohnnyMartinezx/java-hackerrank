package hacker_rank_practice.data;

import java.util.Scanner;

public class ProblemNo7 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int x = 0; x < n; x++){
                a+=b;
                if(x > 0){
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b * 2;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
