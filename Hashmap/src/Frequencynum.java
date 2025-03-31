import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequencynum {
    public static void main(String[] args){
        int[] arr = {2, 3, 2, 3, 5};
        int[] new_arr = new int[arr.length];

        // Initialize new_arr with indexes +1
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = i + 1;
        }

        // Store frequency count in HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Debugging: Print map contents
        System.out.println("Map contents: " + map);

        // Create answer array based on new_arr lookup
        int[] ans = new int[arr.length];
        for (int i = 0; i < new_arr.length; i++) {
            ans[i] = map.getOrDefault(new_arr[i], 0); // Get frequency from the map
        }

        // Print final result
        System.out.println("Final Answer: " + Arrays.toString(ans));
    }
}

