import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cahrge_greedy {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int charge = 1000 - sc.nextInt();
        int count =0;
        count += charge/500; charge %= 500;
        count += charge/100; charge %= 100;
        count += charge/50; charge %= 50;
        count += charge/10; charge %= 10;
        count += charge/5; charge %= 5;
        count += charge;

        System.out.println(count);



    }
}
