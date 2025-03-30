import java.util.Scanner;

public class PrintNLinearly {
    public static void printnlinear(int i,int n){
        if(i>n)
            return;
        System.out.print(i);
        printnlinear(i+1,n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        printnlinear(1,n);
    }
}
