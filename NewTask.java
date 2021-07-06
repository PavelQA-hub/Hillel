package pavelmykhailutsa;

public class NewTask {
    public static void main(String[] args) {
        System.out.println("result " + powNumber(3, 3));
    }
    public static int powNumber(int num, int degree) {
       int res = num;
        if (degree == 0) return 1;
        for (int i = 1; i < degree; i++) {
            res = res * num;
        }
        return res; //hello
    }
}
