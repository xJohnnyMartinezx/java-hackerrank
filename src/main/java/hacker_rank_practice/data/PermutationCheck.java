package hacker_rank_practice.data;

import java.util.HashSet;

public class PermutationCheck {

//    A non-empty array A consisting of N integers is given.
//
//    A permutation is a sequence containing each element from 1 to N once, and only once.
//
//    For example, array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//    is a permutation, but array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    is not a permutation, because value 2 is missing.
//
//    The goal is to check whether array A is a permutation.
//
//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//    that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
//
//    For example, given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//    the function should return 1.
//
//    Given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    the function should return 0.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N is an integer within the range [1..100,000];
//    each element of array A is an integer within the range [1..1,000,000,000].

    public int solution(int[] A){
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 1; i <= A.length; i++) {
            nums.add(i);
            System.out.println("this is line 56 " + i);
            System.out.println(nums + " this is line 57");
        }
//        ***** ENHANCED for each. LOOPING THROUGH ARRAY
        for (int a : A){
            System.out.println("this is line 61 " + a);
            if(!nums.contains(a)){
                return 0;
            }
            else {
                nums.remove(a);
            }
        }

        return nums.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        PermutationCheck pc = new PermutationCheck();
        System.out.println("line 74 " + pc.solution(new int[] {4,1,3,2}));
        System.out.println("line 75 " + pc.solution(new int[] {5,1,2}));
        System.out.println("line 76 " + pc.solution(new int[] {4,1,3}));
        System.out.println("line 77 " + pc.solution(new int[] {1,3,2}));
        System.out.println("line 78 " + pc.solution(new int[] {1}));
        System.out.println("line 79 " + pc.solution(new int[] {2}));

    }
}
