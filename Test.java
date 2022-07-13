public class Test {
    double width,height,depth;

    public static void main(String Args[]){
        double vol;

        Test ST = new Test();

        ST.height = 10.00;
        ST.depth = 24.45;
        ST.width = 10.90;

        vol = ST.depth * ST.height * ST.width;

        System.out.println("Volume Is : "+vol);
    }
}

