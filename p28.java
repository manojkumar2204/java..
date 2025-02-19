//star pascals triangle

public class p28 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    
}
