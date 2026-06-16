class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long result = 0;

        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-') ){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';  // to convert charater in its corresp. integer

            result = result * 10 + digit;

            //overflow
            if(sign * result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(sign * result < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * result);
    }
}
