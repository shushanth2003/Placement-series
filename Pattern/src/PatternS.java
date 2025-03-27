import java.util.Scanner;
public class PatternS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int i = n-1; i >=row ; i--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                if (col == 1||row==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int r = row-1; r >=1; r--) {
                if(r==1||row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = n-1; j >=row; j--) {
                System.out.print(" ");
            }

            System.out.println("");
        }

        }
    }

