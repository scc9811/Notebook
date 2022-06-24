import java.util.Scanner;
public class findNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] Sarray1 = input.nextLine().split(" ");
        int m = Integer.parseInt(input.nextLine());
        String[] Sarray2 = input.nextLine().split(" ");

        for (int i=0; i<m; i++){
            boolean tf = false;
            for (int j=0; j<n; j++){
                if (Sarray2[i].equals(Sarray1[j])){
                    tf = true;
                    break;
                }
            }
            if (tf==true) System.out.println(1);
            else System.out.println(0);

        }



    }
}
