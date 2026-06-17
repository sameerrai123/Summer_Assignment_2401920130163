class Solution {
    public int maxArea(int[] height) {
        // water stored will depend on smaller line height

        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;

        while(left < right){
            int width = right - left;
            int ht = Math.min(height[left] , height[right]);

            maxarea = Math.max(maxarea ,( ht * width) );

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
