import java.util.Scanner;

public class PatternQ {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int i = n; i >=row ; i--) {
                System.out.print("*");
            }
            for (int j =1; j <=row-1 ; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=row-1 ; x++) {
                System.out.print(" ");
            }
            for (int y = n; y >=row ; y--) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int row = 1; row <=n ; row++) {
            for (int i = 1; i <=row ; i++) {
                System.out.print("*");
            }
            for (int j = n-1; j >=row ; j--) {
                System.out.print(" ");
            }
            for (int x = n-1; x >=row ; x--) {
                System.out.print(" ");
            }
            for (int y = 1; y <=row ; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
