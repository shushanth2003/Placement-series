import java.util.Scanner;

public class PatternM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = a-1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int z = 1; z <=i; z++) {
                System.out.print("*");
            }
            for (int x = 1; x <=i-1 ; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
