import java.util.Scanner;
public class findNumber_another {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] array2 = new int[m];
        for (int i=0; i<m; i++){
            array2[i] = input.nextInt();
        }

        for (int i=0; i<m; i++){
            boolean tf = false;
            for (int j=0; j<n; j++){
                if(array2[i]==array[j]){
                    tf = true;
                    break;
                }
            }
            if (tf==true) System.out.println(1);
            else System.out.println(0);

        }



    }
}
