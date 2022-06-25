import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String Args[]){
        int Num;
        Stud s = new Stud();
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        Num = sc.nextInt();

        if (Num % 2 == 0){
            System.out.println("Number Is Even");
        }
        else {
            System.out.println("Number Is Odd");
        }
    }
}

