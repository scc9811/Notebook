import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale_greedy {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        int sum =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
        }
        Arrays.sort(array);

















    }
}
