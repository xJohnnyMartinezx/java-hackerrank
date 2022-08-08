package hacker_rank_practice.data;

public class BinaryGap {

    public int solution(int N) {

        String binaryString = Integer.toString(N, 2);
//        System.out.println(binaryString);

        boolean started  = false;

        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            String c = binaryString.substring(i, i + 1);
            if (c.equals("1")){
                if (started){
                    if (counter > maxCounter){
                        maxCounter = counter;
                    }
                }
                counter = 0;
                started = true;
            }
            if (c.equals("0")){
                counter++;
            }
        }
        return maxCounter;
    }

    public static void main(String[] args) {
        BinaryGap gb = new BinaryGap();
        System.out.println(gb.solution(529));
        System.out.println(gb.solution(20));
        System.out.println(gb.solution(32));
        System.out.println(gb.solution(1));
        System.out.println(gb.solution(1041));





    }
}
