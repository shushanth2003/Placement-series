import java.util.Scanner;

public class Sumofdigits {
    public static void sumofdigit(int a, int sum){
        if(a<1){
            System.out.println(sum);
            return;
        }
        sumofdigit(a-1,sum+a);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        sumofdigit(a,0);
    }

}
