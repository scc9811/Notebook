import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coins {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int[] dp = new int[k+1];
        for (int i=0; i<n; i++){
            array[i] = Integer.parseInt(br.readLine());
            dp[array[i]] = 1;
        }
        for (int i=1; i<=k; i++){
            for (int j=0; j<n; j++){
                try{
                    dp[i] += dp[i-array[j]];
                }
                catch(ArrayIndexOutOfBoundsException e){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dp));








    }
}
