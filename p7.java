//find largest among three numbers
import java.util.*;
public class p7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number :");
    int a = sc.nextInt();

    System.out.println("enter second number :");
    int b = sc.nextInt();
    
    System.out.println("enter third number :");
    int c = sc.nextInt();

    if(a>b && a>c){
        System.out.println("first is biggest");
    }else if(b>a && b>c){
        System.out.println("second is largest");
    }else{
        System.out.println("third is largest");
    }
    sc.close();
    
}  
}
