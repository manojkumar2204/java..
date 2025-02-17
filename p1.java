//Read number from standard input get input from the user
import java.util.*;
public class p1{
    public static void main(String[] args) {
        System.out.println("enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        

        System.out.println(name);
        sc.close();
    }
}