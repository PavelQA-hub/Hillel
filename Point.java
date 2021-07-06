package pavelmykhailutsa;

public class Point {
    public static void main(String[] args) {
        int point = 37;
        if (point < 0) {
            System.out.println("Your grade: impossible!");
        } else if (point >= 0 && point <= 49) {
            System.out.println("Grade: failed");
        } else if (point >= 50 && point <= 59) {
            System.out.println("1");
        } else if (point >= 60 && point <=69) {
            System.out.println("2");
        } else if (point >= 70 && point <=79) {
            System.out.println("3");
        } else if (point >= 80 && point <=89) {
            System.out.println("4");
        } else if (point >= 90 && point <=100) {
            System.out.println("5");
        } else if (point > 100) {
            System.out.println("incredible!");
        }
    }
}
