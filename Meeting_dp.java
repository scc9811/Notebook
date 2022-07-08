import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Meeting_dp {
    static int[] dp = new int[100000];
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(br.readLine());
        int[] array = new int[meetingCount];
        int arrayCount = 0;
        int[][] twoArray = new int[meetingCount][2];
//        int[][] array = new int[meetingCount][2];

        for (int i=0; i<meetingCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // start
            twoArray[i][0] = Integer.parseInt(st.nextToken());
            // end
            twoArray[i][1] = Integer.parseInt(st.nextToken());
        }


        // 리스트 정렬
        Arrays.sort(twoArray, Comparator.comparing(o1 -> o1[1]));



        for (int i=0; i<meetingCount; i++){
            int start = twoArray[i][0];
            int end = twoArray[i][1];
//            dp[end] = Math.max(dp[end], dp[start]+1);
            int max = 0;
            for (int j =0; j<arrayCount; j++){
                if (array[j] <= start && dp[array[j]] > max)
                    max = dp[array[j]];
            }
            dp[end] = max +1;
            array[arrayCount] = end;
            arrayCount++;
        }



        System.out.println(dp[array[meetingCount-1]]);






//        // 이중리스트 정렬.
//        Arrays.sort(array, (o1,o2) -> {
//            if (o1[0] == o2[0]){
//                return Integer.compare(o1[1],o2[1]);
//            } else{
//                return Integer.compare(o1[0],o2[0]);
//            }
//        });









//        for (int i=0; i<array.length; i++){
//            for (int j=0; j<array[i].length; j++){
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }






    }
}
