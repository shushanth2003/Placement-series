import java.util.Scanner;

public class PatternR {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(" "+"*"+" ");
            }
            System.out.println(" ");
        }
        for (int j = 1; j <=n ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" "+"*"+" ");
            }
            System.out.println(" ");
        }

    }
}
