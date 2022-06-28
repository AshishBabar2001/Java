import java.util.*;

public class Stud {
    public static void main(String args[]){
        int Sci,Maths,Eng,Tot,Avg;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks Of Science : ");
        Sci = sc.nextInt();
        System.out.println("Enter Marks Of Maths :  ");
        Maths = sc.nextInt();
        System.out.println("Enter Marks Of English : ");
        Eng = sc.nextInt();

        Tot = Sci + Maths + Eng ;
        System.out.println("Total Marks are : "+Tot);

        Avg = Tot/3;

        System.out.println("AVerage Mark Is : "+Avg);

    }
}
