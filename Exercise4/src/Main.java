import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        int width, height;

        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextInt();
        rectangle.width = width;

        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextInt();
        rectangle.height = height;

        System.out.println(rectangle);
    }
}