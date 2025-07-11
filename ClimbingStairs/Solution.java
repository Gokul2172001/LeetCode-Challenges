class Solution {
    
    public int climbStairs(int n) {
        if(n==1) {
        return 1;
    }
        
        int firstVal =1;
        int secondVal =1; 

        for(int i=2; i<=n; i++) {     
            int temp=firstVal+secondVal;
            firstVal =secondVal;
            secondVal =temp;   
        }
        
        return secondVal;
    }
}
