class Solution {
    class Pair{
        TreeNode node;
        int row , col;
    

    Pair(TreeNode node, int row , int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       

        TreeMap<Integer , TreeMap<Integer , List<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root , 0 , 0) );
        while(!q.isEmpty()){
            Pair curr = q.poll();

            TreeNode node = curr.node;
            int row = curr.row;
            int col = curr.col;

            //flow is like
            /* 
             col
                row
                   values
            */

            //set col
            if(!map.containsKey(col)){
                map.put(col , new TreeMap<>());
            }

            //set row
            if(!map.get(col).containsKey(row)){
                map.get(col).put(row , new ArrayList<>());
            }

            //set values
            map.get(col).get(row).add(node.val);

            if(node.left != null){
                q.add(new Pair(node.left , row + 1 , col - 1));
            }

            if(node.right != null){
                q.add(new Pair(node.right , row + 1 , col + 1));
            }
        }


             List<List<Integer>> ans = new ArrayList<>();

             //for each column
             for(TreeMap<Integer , List<Integer>> rows : map.values()){
                List<Integer> collist = new ArrayList<>();
                //for each row inside one column
                for(List<Integer> values : rows.values()){
                    //rows already sorted we only sort values on same rows
                    Collections.sort(values);
                    collist.addAll(values);
                }
                ans.add(collist);
             }
             return ans;
    }
}
