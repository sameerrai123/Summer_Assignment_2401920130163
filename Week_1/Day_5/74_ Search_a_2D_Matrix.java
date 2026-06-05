class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length ;
        int m = matrix[0].length ;

        int left = 0;
        int right = m * n - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            int row = mid / m; // row number dedega
            int col = mid % m; // col number dedega

            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}
