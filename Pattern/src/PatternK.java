import java.util.Scanner;
public class PatternK {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            };
            for (int z = 1; z <=i ; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
