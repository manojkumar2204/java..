//find the perimeter of  a rectangle
import java.util.Scanner;

public class p19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        sc.close();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}
