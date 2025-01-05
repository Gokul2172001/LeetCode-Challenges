
class Solution {
    public int majorityElement(int[] nums) {
        int candid = 0;
        int count = 0;

        for(int num:nums) {
            if(count == 0 ) {
                candid = num;
                count = 1;
            } else if(num == candid) {
                count++;
            } else {
                count--;
            }

        }
        return candid;
    }
}