import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        int[] arr={1,2,1,3,1,2,3,4,5};
        for(int n:arr){
            a.add(n);
        }
        System.out.println(a);
    }
}
