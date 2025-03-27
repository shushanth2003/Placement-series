import java.util.Scanner;

public class PatternN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int z = a; z >=i ; z--) {
                System.out.print("*");
            }
            for (int x = a-1; x >=i ; x--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
