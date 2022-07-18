import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CardSort_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int sum =0;
        for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }
        Arrays.sort(array);
        String s = Integer.toBinaryString(N);
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                sum *= (s.length()-i-1);
            }
            System.out.println("sum = "+sum);
        }
        System.out.println(sum);







    }
}
