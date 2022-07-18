import java.util.Scanner;

public class E_Pattarn {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= n ; j++){
                if (i == 1 || i == n || j == 1 || i == n/2){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
