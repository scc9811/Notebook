import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test{
    public static void main(String[] args)throws IOException {
        int[] array1 = {1,2};
        int[] array2;
        array2 = Arrays.copyOf(array1,2);
        array2[1] = 5;
        System.out.println(Arrays.toString(array2));













    }
}