import java.util.Scanner;
public class PatternD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         int printVal=1;
        for (int i = 1; i<=a; i++) {
            printVal=i%2==0 ? 0:1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(printVal+" ");
                printVal=1-printVal;
            }
            System.out.println("");
        }
    }
}
