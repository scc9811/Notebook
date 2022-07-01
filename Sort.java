import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        quickSort(array,0,N-1);
        for (int i=0; i<N; i++){
            System.out.println(array[i]);
        }


    }
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }
    static int sort3elem(int[] x, int a, int b, int c){
        if (x[b] < x[a]) swap(x, b, a);
        if (x[c] < x[b]) swap(x,c,b);
        if (x[b] < x[a]) swap(x,b,a);
        return b;
    }
    static void quickSort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int m = sort3elem(a, pl, (pl+pr)/2 , pr);
        int x = a[m];

        swap(a, m, right-1);
        pl++;
        pr -=1;

        do{
            while (a[pl] < x )pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr)
                swap (a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);


    }
}
