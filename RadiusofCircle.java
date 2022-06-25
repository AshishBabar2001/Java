import java.util.*;

public class RadiusofCircle {
        public static void main(String args[])
        {
            double Radius,Area;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Radius Of Cirlce : ");
            Radius = sc.nextDouble();
            Area = Radius * 3.14;
            Area = Area * Radius;

            System.out.println("Area Of Circle Is : "+ Area);
        }
}
