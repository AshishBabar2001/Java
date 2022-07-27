import java.util.Scanner;

public class oppsite_L_Pattarn {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n ; j++){
                if (i == 1 || j == n)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
