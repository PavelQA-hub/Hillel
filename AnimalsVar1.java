package pavelmykhailutsa;

public class AnimalsVar1 {
    public static void main(String[] args) {
        int cow = 4;
        for (int chicken = 1; chicken < 5; chicken++) {
            System.out.println("У нас есть: " + chicken + " курица и " + cow-- + " корова");
        }
    }

}
