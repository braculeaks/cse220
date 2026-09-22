public class t05 {
    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;

        int[] ans = solve(nums, k);

        System.out.println();
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.println();
    }

    public static int[] solve(int[] nums, int k) 
    {
        int lim = nums.length;
        MaxHeap mh = new MaxHeap(lim);
        for (int i = 0; i < lim; i++) 
            mh.insert(nums[i]); 


        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            Integer x = mh.extractMax();
            ans[i] = x;
        }

        return ans;
    }
}