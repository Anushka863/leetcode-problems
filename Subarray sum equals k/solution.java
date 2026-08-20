import java.util.HashMap;
class Solution{
    public int subarraySum(int nums[],int k){
        //using prefix_sum and hashmap
        int prefix_sum_j=0;
        int count=0;

        //creating a hashmap
        HashMap<Integer,Integer>map=new HashMap<>();
        //initially sum is 0
        map.put(0,1);//means 0 ek baar already exist karta hai
        
        for(int num:nums){
            prefix_sum_j+=num;

            //k=prefix_sum_j-prefix_sum_(i-1)
            //prefix_sum_(i-1)=prefix_sum_j-k

            if(map.containsKey(prefix_sum_j-k)){
                count+=map.get(prefix_sum_j-k);
            }
            map.put(prefix_sum_j,map.getOrDefault(prefix_sum_j,0)+1);


        }
        return count;
    }
}
