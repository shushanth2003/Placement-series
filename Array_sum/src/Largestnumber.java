public class Largestnumber {
    static void largest(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,67,9};
        largest(arr);
    }
}
