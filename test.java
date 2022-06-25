import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n, w;
        do{
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        do{
            System.out.print("w값: ");
            w = stdIn.nextInt();
        } while ( w <= 0 || w > n);

        for (int i=0; i<n; i++){
            System.out.print("*");
        }






    }


}
