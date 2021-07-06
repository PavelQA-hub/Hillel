package pavelmykhailutsa;

public class Arithmetic {
    public static void main(String[] args) {
        int a = -5;
        int b = 8;
        int c = 6;
        int x = -5 + 8 * 6;
        System.out.println(x);

        int d = 55;
        int g = 9;
        int f = 9;
        int y = (55+9) % 9;
        System.out.println(y);

        float number1 = 20f;
        float number2 = -3f;
        float number3 = 5f;
        float number4 = 8f;
        float sum = 20 + -3*5/8;
        System.out.println(sum);

        int r = 5;
        int t = 15;
        int u = 3;
        int e = 2;
        int z = 8;
        int l = 3;
        int summ = r + t/u*e-z%l;
        System.out.println(summ);
    }
}
