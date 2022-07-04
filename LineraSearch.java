import java.util.Scanner;

public class LineraSearch {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Array : ");
        size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0 ; i < size ; i++)
        {
            System.out.print("Enter "+i+" Number in Array : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter No To Search From Array : ");
        int s = sc.nextInt();
        for (int i = 0 ; i < size ; i++)
        {
            if (arr[i] == s)
            {
                System.out.println(s+" Number Is Found At position "+i);
            }
        }
    }
}
