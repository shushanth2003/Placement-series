import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int z = 1; z <=i ; z++) {
                System.out.print("*");
            }
            for (int x = 1; x <=i-1 ; x++) {
                System.out.print("*");
            }
            for(int y = n-1; y>=i; y--) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <=n-1 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = n-1; k >=i; k--) {
                System.out.print("*");
            }
            for (int x = n-2; x >=i ; x--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
