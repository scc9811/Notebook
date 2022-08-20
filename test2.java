import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String[] array1 = new String[N];
        int M = Integer.parseInt(st.nextToken());
        Boolean[] tf = new Boolean[N];

        for (int i=0; i<N; i++){
            array1[i] = br.readLine();
        }
        Arrays.sort(array1);
        for (int i=0; i<M; i++){
            String s = br.readLine();
            try{
                tf[(Arrays.binarySearch(array1,s))] = true;
                break;
            }
            catch (ArrayIndexOutOfBoundsException ignore){}
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            try {
                if (tf[i]) sb.append(array1[i] + "\n");
            } catch (java.lang.NullPointerException ignore) {}
        }
        System.out.println(sb);











    }
}
