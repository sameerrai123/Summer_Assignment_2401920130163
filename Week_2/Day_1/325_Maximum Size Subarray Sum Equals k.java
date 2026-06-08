class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

       map.put(0 , -1);
      int currsum = 0;
      int maxlen = 0;

        for(int i = 0; i < nums.length; i++){
             currsum += nums[i];

          if(map.containsKey(currsum - k)){
                maxlen = Math.max(maxlen , i - map.get(currsum - k));
          }

          if(!map.containsKey(currsum )){
             map.put(currsum , i);
       }

          return maxlen;
    }
}
