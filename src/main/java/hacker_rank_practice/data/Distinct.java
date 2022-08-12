package hacker_rank_practice.data;

import java.util.HashSet;

public class Distinct {

//    Write a function
//
//    class Solution { public int solution(int[] A); }
//
//    that, given an array A consisting of N integers, returns the number of distinct values in array A.
//
//    For example, given array A consisting of six elements such that:
//
//    A[0] = 2    A[1] = 1    A[2] = 1
//    A[3] = 2    A[4] = 3    A[5] = 1
//    the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N is an integer within the range [0..100,000];
//    each element of array A is an integer within the range [−1,000,000..1,000,000].


    public int solution(int[] A){

//        ***** USING A HashSet FOR EFFICIENCY ******
        HashSet<Integer> hs = new HashSet<>();

//        **** FOR EACH ELEM "a" IN THE ARRAY "A"...NEED TO ADD IT TO THE HASHSET ******
        for (int a : A) {
            hs.add(a); /*BECAUSE USING HASHSET, DON'T "IF" STATEMENT TO CHECK IF ELEM IN THE SET.
            MY UNDERSTANDING IS THAT .add() DOESN'T ADD DUPLICATES TO HashSet.  */
//            System.out.println(hs);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        Distinct d = new Distinct();
        System.out.println(d.solution(new int[] {1,2,3,1,2,3}));
        System.out.println(d.solution(new int[] {2,1,1,2,3,1}));
        System.out.println(d.solution(new int[] {-1,0,1,-1,2}));
        System.out.println(d.solution(new int[] {-1,2,3,4,5,3}));
        System.out.println(d.solution(new int[] {}));
    }

}
