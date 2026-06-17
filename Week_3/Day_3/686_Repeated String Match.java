class Solution {
    public int repeatedStringMatch(String a, String b) {
       StringBuilder sb = new StringBuilder();
       sb.append(a);
        int count = 1;
       
        while(sb.length() <= b.length() && !sb.toString().contains(b)){
            sb = sb.append(a);
           count += 1;
        }

          if( sb.toString().contains(b)){
             return count; 
        }

        sb.append(a);

        if( sb.toString().contains(b)){
             return count + 1; 
        }
        return -1;
    }
}
