class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxlen = -1;
       
        HashMap<Character , Integer> map = new HashMap<>();
    
       char [] arr = s.toCharArray();

       for(int i = 0; i < arr.length; i++){
            
            if(map.containsKey(arr[i])){
                int len = i - map.get(arr[i]) - 1;
               
                 maxlen = Math.max(len , maxlen);
            }
            else{
                map.put(arr[i] , i);

            }
             
       }
       return maxlen;
      
    }
}