package hacker_rank_practice.data;

import java.util.HashSet;

public class Distinct {

    public int solution(int[] A){
        HashSet<Integer> hs = new HashSet<>();
        for (int a : A) {
            hs.add(a);
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
