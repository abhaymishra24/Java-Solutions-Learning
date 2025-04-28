public class rearrangearray {
    public static void rearrangeArray(int[] nums, int[] pos) {
         
        int[] temp = new int[nums.length];
        
         
        for (int i = 0; i < nums.length; i++) {
            temp[pos[i]] = nums[i];
        }
        
         
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] pos = {3, 2, 4, 1, 0};
        
        rearrangeArray(nums, pos);
        
     
        System.out.print("Rearranged array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}