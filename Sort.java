import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] a = {3,6,5,9,4,0,1,7,2,8};

        insertionSort(a,10);
        System.out.println(Arrays.toString(a));







    }
    static void bubbleSort1(int[] a, int n){
        for (int i=0; i<n-1; i++)
            for (int j=n-1; j>i; j--)
                if (a[j-1] > a[j])
                    swap(a,j-1,j);
    }

    static void bubbleSort2(int[] a, int n){
        for (int i=0; i<n-1; i++){
            int exchg =0;
            for (int j=n-1; j>i; j--)
                if (a[j-1]>a[j]){
                    swap(a, j-1, j);
                    exchg++;
                }
            if (exchg==0) break;
        }
    }

    static void bubbleSort3(int[] a, int n){
        int k=0;
        while (k < n-1){
            int last = n-1;
            for (int j=n-1; j>k; j--)
                if (a[j-1] > a[j]){
                    swap(a,j-1,j);
                    last = j;
                }
            k = last;

        }
    }

    static void selectionSort(int[] a, int n){
        for (int i=0; i<n-1; i++){
            int min =i;
            for (int j=i+1; j<n; j++)
                if (a[j] < a[min])
                    min = j;
            swap(a,i,min);
        }
    }

    static void insertionSort(int[] a, int n){
        for (int i=1; i<n; i++){
            int j;
            int tmp = a[i];
            for (j=i; j>0 && a[j-1] > tmp; j--)
                a[j] = a[j-1];
            a[j] = tmp;
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
