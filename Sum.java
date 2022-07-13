import java.util.*;

public class Sum {
    public static void main(String arg[]){
        int num1,num2,sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Number : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = num1 + num2 ;
        System.out.println("Summation Of Two Numbers Is : "+ sum);
    }


}
