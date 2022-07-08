import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Meeting_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(br.readLine());
        int[][] array = new int[meetingCount][2];
        for (int i=0; i<meetingCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array, Comparator.comparing(o1 -> o1[1]));

        int[] dp = new int[array[meetingCount-1][1]];

        for (int i=0; i<meetingCount; i++){

        }




//        for (int i=0; i<meetingCount; i++){
//            for (int j=0; j<2; j++){
//                System.out.print(array[i][j] +" ");
//            }
//            System.out.println();
//        }





    }
}
