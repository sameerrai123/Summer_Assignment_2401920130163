class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        
       
        int count = 1;
        int maxcount = 1;

      
        for(int i = 1; i < nums.length; i++){
            if(   nums[i] == nums[i-1] ){
                continue;
            }
            if(  nums[i] == (nums[i-1] + 1)){
                count += 1;
            }
            else{
                count = 1;
            }
            
           maxcount = Math.max(count , maxcount);
        }
        return maxcount;
    }
}









2nd soln using hashset

  class Solution {
    public int longestConsecutive(int[] nums) {
      
      HashSet<Integer> set = new HashSet<>();

      for(int num : nums){
        set.add(num);
      }

      int maxlen = 0;

      for(int num : set){
        if(!set.contains(num - 1)){  // starting point
                int currnum = num;
                int currlen = 1;

                while(set.contains(currnum + 1)){
                   currnum++;
                    currlen ++;
                    
                }
                maxlen = Math.max(currlen , maxlen);
        }
      }
      return maxlen;
    }
}
  
