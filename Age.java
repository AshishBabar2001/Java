import java.util.*;
public class Age {
    public  static void main(String ags[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        if (age>=18){
            System.out.println("You Are Adult");
        }
        else if(age<5){
            System.out.println("Your Are child");
        }
        else {
            System.out.println("You are Not Adult Not Child");
        }
    }


}
