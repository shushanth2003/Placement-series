import java.util.Scanner;
import java.lang.Math;
public class PrintNtoone {
    public static int sumOfSeries(int n) {
        if(n<1){
            return 0;
        }
        return (n*n*n) + sumOfSeries(n-1);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int ans =sumOfSeries(n);
        System.out.println(ans);
    }
}
