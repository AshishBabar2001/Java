import java.util.Scanner;

public class Take_name_and_print_on_Screen {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        size = sc.nextInt();
        String arr[] = new String[size];
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter a Elements In Array : ");
            arr[i] = sc.next();
        }
        for (int i = 0 ; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}