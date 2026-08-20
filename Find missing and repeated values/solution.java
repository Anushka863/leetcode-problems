class Solution {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int N=n*n;
        int ans[]=new int[2];
        long actual_sum=0;
        long actual_sq_sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                actual_sum+=grid[i][j];
                actual_sq_sum+=grid[i][j]*grid[i][j];

            }
        }
        long expected_sum=(long)(N*(N+1)/2);
        long expected_sq_sum=(long) (N * (N + 1) * (2L * N + 1) / 6);
        //logic
        //actual_sum=expected_sum+a-b;
        long diff=actual_sum-expected_sum;
        //squaring all the terms
        //actual_sq_sum-expected_sq_sum=a*a-b*b;
        //which will be equal to (a+b)(a-b)
        long sq_diff=actual_sq_sum-expected_sq_sum;
        long sumAB=  sq_diff/ diff;//=a+b;..eq2
       //adding eq1 and eq2
        int a=(int)((diff+sumAB)/2);
        int b=(int)(a-diff);

       ans[0]=a;
       ans[1]=b;

       return ans;





        
        
    }
    public static void main(String args[]){
        int grid[][]={{1,3},{2,2}};
        System.out.println(findMissingAndRepeatedValues(grid));

    }
    
}
