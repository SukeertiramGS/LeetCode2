class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // int sum=0;

        // for(List<Integer> r : triangle){
        //     int min= Integer.MAX_VALUE;
        //     for(int n : r){
        //         min=Math.min(min,n);
        //     }
        //     sum+=min;
        // }

        // return sum;

         int n = triangle.size();

        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int current = triangle.get(row).get(col);

                int leftChild = triangle.get(row + 1).get(col);
                int rightChild = triangle.get(row + 1).get(col + 1);

                triangle.get(row).set(col, current + Math.min(leftChild, rightChild));
            }
        }
        return triangle.get(0).get(0);
    }
}