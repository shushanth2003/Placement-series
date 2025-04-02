import java.util.Arrays;
import java.util.Scanner;

public class Quick {
    static void quick(int[] arr,int l,int h){
        if(l<h){
            int partition=qs(arr,l,h);
            quick(arr,l,partition-1);
            quick(arr,partition+1,h);
        }
    }
    static int qs(int[] arr,int l,int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(i<=h&&arr[i]<=pivot){
                i++;
            }
            while(j>=l&&arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        int[] arr={4 ,1 ,3,9,7};
        int low=0;
        int high=arr.length-1;
        quick(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
