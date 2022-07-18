import java.util.Scanner;

public class OppPattarn {
    public static void main(String Aregs[]){
        int n;
        String a;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Rows to Print Pattarn : ");
        n = sc.nextInt();
        System.out.println("Enter A Character To Print Pattarn : ");
        a = sc.next();
        int j;
        for (int i=0;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(""+a);
            }
            System.out.println("\n");
        }
    }
}
