import java.util.Scanner;
public class PatternJ {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n=a*2;
        int inc=1;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            inc++;
            System.out.println("");
        }
        for (int k =n-inc ; k >=1 ; k--) {
            for (int i = k; i>=1 ; i--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
