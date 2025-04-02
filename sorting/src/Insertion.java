import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        int[] arr={4,1,3,9,7};
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
