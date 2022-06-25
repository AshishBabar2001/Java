import java.util.*;

public class AcceptStudentMarks {
    public static void main(String args[]){
        AcceptData s = new AcceptData();
        s.getdata();
        s.cal();
    }

}
class AcceptData{
    int Sci,Maths,Eng,Tot,Avg;
    String Name;
    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.print("Enter Name Of Student : ");
        Name = sc.next();
        System.out.print("Enter Marks Of 3 Subject : ");
        Sci = sc.nextInt();
        Maths = sc.nextInt();
        Eng = sc.nextInt();
    }
    void cal(){
        Tot = Sci + Maths + Eng ;
        System.out.println("Name Of Student Is : "+Name);
        System.out.println("Marks Of Student Sci : "+Sci+" Maths : "+Maths+" English : "+Eng);
        System.out.println("Total Is : "+Tot);
        Avg = Tot / 3;
        System.out.println("Avrage Is : "+Avg);
    }

}
