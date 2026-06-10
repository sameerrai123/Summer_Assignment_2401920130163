class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, 0, target,
                  new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] candidates,
                           int index,
                           int target,
                           List<Integer> path,
                           List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if(target < 0 || index == candidates.length) {
            return;
        }

        path.add(candidates[index]);

        backtrack(candidates,
                  index,
                  target - candidates[index],
                  path,
                  ans);

        path.remove(path.size() - 1);

        backtrack(candidates,
                  index + 1,
                  target,
                  path,
                  ans);
    }
}
