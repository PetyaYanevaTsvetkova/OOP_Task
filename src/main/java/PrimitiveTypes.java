public class PrimitiveTypes {
    public static void main(String[] args) {
        byte num1 = 10;
        short num2 = 100;
        int num3 = 250158845;
        long num4 = 1234577851;
        char char5 = 'f';
        boolean boolean6 = true;
        float num7 = 1.6f;
        double num8 = 1.54789d;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(char5);
        System.out.println(boolean6);

        System.out.println("Casting:");
        System.out.println((int) num8);
        System.out.println((int) char5);
        System.out.println((long) num3);
    }
}
