package pavelmykhailutsa;

import java.io.*;

public class MathTask {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter number");
        int x = Integer.parseInt(bufferedReader.readLine());
        System.out.println(x);
        double s = Math.sqrt(x);
        System.out.println(s);
//        System.out.println(x);
        s = Math.pow(s, x) + 4;
        System.out.printf("result: %f", s);

//        public static int x;
    }
}
