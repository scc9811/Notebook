import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumber_greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum =1;
        long i=1;
        while (sum < n){
            i++;
            sum += i;
        }
        if (sum > n) i--;
        System.out.println(i);





    }
}
