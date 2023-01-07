package Grind75.Week1;

public class TwoSum {
   
   //Brute Force O(n^2)
    public static int[] twoSum(int[] nums,int target){
        int[] result =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(target-nums[i] == nums[j]){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }


    //Optimised O(n)
    public static int[] twoSumMap(int[] nums, int target){
        int[] result=new int[2];
        
        return result;
    }
}
