class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int l = nums.length;
        for (int i = 0; i < l; i++){
            int a = nums[i];
            int b = target - a;
            for (int c = i+1; c < l; c++){
                if (nums[c] == b){
                    answer[0] = i;
                    answer[1] = c;
                    break;
                }
            }
        }
        return answer;
    }
}