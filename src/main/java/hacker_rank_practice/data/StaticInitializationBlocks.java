package hacker_rank_practice.data;

import java.util.Scanner;

public class StaticInitializationBlocks {

    static int B;
    static int H;
    static boolean flag = true;

    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();

        try{
            if (B<=0 || H<=0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}

//***** Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
