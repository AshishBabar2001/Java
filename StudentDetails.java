import java.util.*;

public class StudentDetails {
    public static void main(String args[]){
        int Roll_No,Marks;
        String Name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number Of STudent : ");
        Roll_No = sc.nextInt();
        System.out.print("Enter Name Of Student : ");
        Name = sc.next();
        System.out.print("Enter MArks Of Student : ");
        Marks = sc.nextInt();

        System.out.println("Roll No : "+Roll_No);
        System.out.println("Name : "+Name);
        System.out.println("Marks : "+Marks);
    }
}
