import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Search_String {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght Of Array : ");
        size = sc.nextInt();

        String[] array = new String[size];
        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter "+i+" Name : ");
            array[i] = sc.next();
        }
        System.out.println("Enter String To Search In Array : ");
        String s = sc.next();

        for(int i = 0 ; i < size ; i++){
            if (array[i] == s){
                System.out.println(s+" String Is Found At Position "+i);
            }
            else {
                System.out.println("There Is no String Like This ...!!!!");
            }
        }
    }
}
