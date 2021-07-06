package pavelmykhailutsa;

public class Ternary {
    public static void main(String[] args) {
        String seasonName = "winter";

        String result = (seasonName.equals("winter") || seasonName.equals("spring") || seasonName.equals("autumn")) ? "It`s cold" : "It`s hot";
        System.out.println(result);
    }
}
