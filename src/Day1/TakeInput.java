package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) throws IOException {
        // Using scanner
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);

        // using Buffer Reader
        InputStreamReader insr= new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(insr);
        String input = bf.readLine();
        int number = Integer.parseInt(input);
        System.out.println(number);


    }
}
