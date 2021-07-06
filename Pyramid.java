package pavelmykhailutsa;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Pyramid {
    public static void main(String[] args) {
        String letter = "A";
        for (int i = 0; i < 5; i++) {
            System.out.println(letter);
            letter += "A";
        }
    }
}
