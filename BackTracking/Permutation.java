package BackTraking;

//find & print all permutation of a string........


//public class Permutation {
//
//    public static void findPermutation(String str, String ans){
//
//        if(str.length() == 0){
//            System.out.println(ans);
//            return;
//        }
//
//        for (int i=0; i<str.length(); i++){
//            char curr = str.charAt(i);
//            String NewStr = str.substring(0, i)+ str.substring(i+1);
//            findPermutation(NewStr, ans+curr);
//        }
//    }
//
//
//    public static void main(String[] args){
//        String str = "abc";
//        findPermutation(str,"");
//    }
//}


//######################################################################################################################

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> result) {
        // Base case: if we've reached the end, add the current permutation
        if (start == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            result.add(current);
            return;
        }

        // Generate permutations by swapping elements
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i); // Swap current element to the front
            backtrack(nums, start + 1, result); // Recurse for the next position
            swap(nums, start, i); // Backtrack by undoing the swap
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Permutation sol = new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = sol.permute(nums);
        System.out.println(permutations);
    }
}
