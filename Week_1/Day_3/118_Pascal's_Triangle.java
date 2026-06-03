class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                //result for element at all row level
                // row for eleemnt at single row levels
                // prev for getting previous row eleements for calculation
                else{
                    List<Integer> prev = result.get(i - 1);  // previous row values for addition
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}