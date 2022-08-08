package hacker_rank_practice.data;

public class MaxCounters {

    public int[] solution(int N, int[] A){

        int maxVal = 0;
        int minVal = 0;

        int[] counters = new int[N];
        for (int i = 0; i < A.length; i++){
            int operation = A[i];
            if(operation == N+1){
//                maxVal op
               minVal = maxVal;
            }else{

//                increment op
                operation--;
                counters[operation] = Math.max(counters[operation] + 1, minVal + 1);
                maxVal = Math.max(maxVal, counters[operation]);
            }
        }
        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], minVal);
        }

        return counters;
    }

    public static void main(String[] args) {
        MaxCounters mc = new MaxCounters();

        int[] result = mc.solution(5, new int[] {3,4,4,6,1,4,4});
        for (int i : result) {
            System.out.println(i);
        }
    }

}
