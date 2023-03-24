package Leksii.L5.Ex001Calc;

import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return scan.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
