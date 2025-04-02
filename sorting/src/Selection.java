import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr ={13,46,24,52,20,9};
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i; j < arr.length ; j++) {
                if(arr[j]<arr[min]){
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Selection sort : "+ Arrays.toString(arr));
    }
}