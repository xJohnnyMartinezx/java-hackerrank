package hacker_rank_practice.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OddOccurencesInArray {

    public int solution(int[] A){

        HashSet<Integer> aList = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (aList.contains(a)){
                aList.remove(a);
            } else {
                aList.add(a);
            }
        }
        return aList.iterator().next();

    }

    public static void main(String[] args) {
        OddOccurencesInArray ooia = new OddOccurencesInArray();
        System.out.println(ooia.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));

    }
}
