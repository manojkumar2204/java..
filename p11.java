//check leap year
import java.util.*;
public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year:");
        int year = sc.nextInt();
        if(year % 4 == 0 ){
            System.out.println("the year is leap year");
        }else if(year % 100 == 0){
            System.out.println("the year is leap year");
        }else{
            System.out.println("not aleap year");
        }
        sc.close();

    }
    
}

    