import java.util.HashMap;

public class Countduplicatenumber {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr={1,2,3,2,1,4,5,4};
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map.values());
    }
}
