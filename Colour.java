package pavelmykhailutsa;

import java.io.*;

public class Colour {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Red");
        String name1 = bufferedReader.readLine();
        System.out.println("Orange");
        String name2 = bufferedReader.readLine();
        System.out.println("Yellow");
        String name3 = bufferedReader.readLine();
        System.out.println("Green");
        String name4 = bufferedReader.readLine();
        System.out.println("Blue");
        String name5 = bufferedReader.readLine();
        System.out.println("Purple");
        String name6 = bufferedReader.readLine();

        if (name1.equals("Red")) {
            System.out.println("My favorite color is red");
        } else if (name2.equals("Orange")) {
            System.out.println("My favorite color is orange");
        }
    }
}
