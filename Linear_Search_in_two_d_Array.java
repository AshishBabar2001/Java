import java.util.Scanner;

public class Linear_Search_in_two_d_Array {
    public static void main(String[] args) {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows And Cols : ");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter Element In Array");
        for (int i = 0 ; i < rows ; i++)
        {
            for (int j = 0 ; j < cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Number To Search in Array  : ");
        int s = sc.nextInt();

        for(int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < cols ; j++)
            {
                if (arr[i][j] == s)
                {
                    System.out.println(s+" Number Found At "+i+","+j);
                }
            }
        }
    }
}
