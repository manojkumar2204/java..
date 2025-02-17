//find hcf of two number
import java.util.*;
class Hcf{
    public static int findHCF(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }
}


public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = sc.nextInt();

        System.out.println("Enter second number:");
        int n2 = sc.nextInt();

        int hcf = Hcf.findHCF(n1,n2);

        System.out.println("hcf of " + n1 + "and " + n2 + " is " + hcf);
        sc.close();
    } 
}
