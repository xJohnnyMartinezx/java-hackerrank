package hacker_rank_practice.data;

public class PassingCars {

    public int solution(int[] A){

        int eastBoundCarsSeen = 0;
        int passingCars = 0;
        for(int a : A){
            if(a == 0){
                eastBoundCarsSeen++;
            }else{
                passingCars+=eastBoundCarsSeen;
            }
        }
        return passingCars > 1000000000 ? -1 : passingCars;
    }

    public static void main(String[] args) {
        System.out.println(new PassingCars().solution(new int[] {1}));
    }

}
