import java.util.Scanner;

public class PrintNtimes {
    public static void printNtimes(int i,int n){
        if(i>=n)
            return;
        System.out.println("Raj");
        printNtimes(i+1,n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        printNtimes(0,n);
    }
}