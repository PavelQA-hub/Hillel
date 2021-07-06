package pavelmykhailutsa;

public class DevideNumbers {
    public static void main(String[] args) {
        div(10,0);
    }

    public static void div(int a, int b) {
        if (b != 0) {
            System.out.println("result: " + a / b);
        } else {
            System.out.println("You not allowed divide by 0");
        }

    }
}

// public static void calculate(int x,  int y) {
//
// }