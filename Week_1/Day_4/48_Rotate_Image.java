class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;

//transpose
//transpose in only upper trinagkle because while traversing whole it will becomes same
        for(int i = 0; i <= n; i++){
            for(int j = i + 1; j <= m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //traverse
        for(int i = 0; i <= n; i++){
            int left = 0;
            int right = matrix[0].length - 1;

            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }
}
