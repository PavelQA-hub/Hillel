package pavelmykhailutsa;

import java.io.*;

public class Rectangle {
    public static void main(String[] args) throws IOException {
//      int m = 2;
//      int n = 4;
//
//        for (int k = 0; k < m; k++) {
//            for (int i = 0; i < n; i++) {
//                System.out.print(8);
//            }
//            System.out.println();
//        }


        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter the first number:");
        String number = bufferedReader.readLine();
        System.out.println("Enter the second number:");
        String number2 = bufferedReader.readLine();

        int m = Integer.parseInt(number);
        int n = Integer.parseInt(number2);

        for (int k = 0; k < m; k++) {
            for (int i = 0; i < n; i++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}

