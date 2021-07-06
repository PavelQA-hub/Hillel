package pavelmykhailutsa;

import java .io.*;

public class Number {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter the number:");
        String number1 = bufferedReader.readLine();
        System.out.println("Enter second number");
        String number2 = bufferedReader.readLine();

        int number1Value = Integer.parseInt(number1);
        int number2Value = Integer.parseInt(number2);

        if (number1Value >= 1) {
            System.out.println("Entered number is: " + number1Value * 2);
        }

        if (number2Value < 0) {
            System.out.println("Number after conversions: " + number2Value++);
        }

        if (number1Value == 0 && number2Value == 0) {
            System.out.println(0);
        }

        System.out.println("DONE");
    }
}
