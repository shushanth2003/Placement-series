import java.util.Arrays;

public class Bubble {
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
