class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length ;
        int m = n * n;

        HashSet<Integer> seen = new HashSet<>();
        int repeated = -1;
       
       
            for(int[] row : grid){
                for(int num : row){
                    if(!seen.add(num)){
                        repeated = num;
                    }
                }
            }

            int missing = -1;

            for(int i = 1; i <= m; i++){
                if(!seen.contains(i)){
                    missing = i;
                    break;
                }
            }

            return new int []{repeated , missing};
        
    }
}
