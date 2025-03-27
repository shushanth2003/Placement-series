
import java.util.Scanner;

public class PatternZ {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n=in.nextInt();
         for(int row=1;row<=n;row++){
            for(int i=1;i<=n;i++){
                if(row==1||i==1){
                    System.out.print(1);
                }
                if(row==2||i==2){
                    System.out.print(2);
                }
                if(row==3||i==3){
                    System.out.print(3);
                } 
                if(row==4||i==4){
                    System.out.print(4);
                }
                if(row==5||i==5){
                    System.out.print(5);
                }
            }
            System.out.println("");
         }
    }
    
}
