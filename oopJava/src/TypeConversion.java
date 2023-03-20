public class TypeConversion {
    public static void main(String[] args) {
        double f;

        f = 5 / 4;
        System.out.println(f);

        f = (double) 5 / 4;
        System.out.println(f);

        int i = (int)1.3 + (int) 1.8;
        System.out.println(i);
    }
}
