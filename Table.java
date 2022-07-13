import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        int i,Num,tab;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        Num = sc.nextInt();

        for( i = 1 ; i <= 10 ; i++)
        {
            tab = Num * i;
            System.out.println(""+Num+" * "+i+"  = "+tab);
        }
    }
}
