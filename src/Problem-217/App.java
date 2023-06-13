import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] test_cases_ = {1,2,2,3,4,5};
        System.out.println(containsDuplicate(test_cases_));
    }
    
    // My solution was too complex O(n^2) :sob:
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int n = 0; n < nums.length; n++){
                if(nums[i] == nums[n] && i != n)
                    return true;
            }
        }
        return false;
    }

    // Solution of Leetcode
    public boolean containsDuplicateLeetcode(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
