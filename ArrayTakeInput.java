import java.util.Scanner;

public class ArrayTakeInput {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Size of Array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter "+i+"st Array Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("--------------------------");
        for (int i = 0 ; i < n ; i++ ){

            System.out.println(arr[i]);
        }
    }
}
