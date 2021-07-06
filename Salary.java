package pavelmykhailutsa;

public class Salary {
    public static void main(String[] args) {
        System.out.println("Your salary is: " + hackSalary(500) + " dollars per week");
    }
    public static int hackSalary(int salary) {
        return salary + 100;
    }
}
