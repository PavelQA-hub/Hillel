package pavelmykhailutsa;

import java .io.*;

public class Month {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter number of the month");
        String number1 = bufferedReader.readLine();

        int number1Value = Integer.parseInt(number1);
        if (number1Value < 1 && number1Value > 12) {
            System.out.println("Month failed ");
        } else if (number1Value == 1) {
            System.out.println("December");
        } else if (number1Value == 2) {
            System.out.println("January");
        }else if (number1Value == 3) {
            System.out.println("February");
        } else if (number1Value == 4) {
            System.out.println("Spring");
        }
    }
}
