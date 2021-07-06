package pavelmykhailutsa;

import java.io.*;

public class NumberMinusOne {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter the number:");

        int sum = 0;

        while (true) {
            String number = bufferedReader.readLine();
            int numberValue = Integer.parseInt(number);
            sum = sum + numberValue;
            if (numberValue == -1) {
                break;

            }

        }
        System.out.println(sum);
       }

    }

