package Concepts.Stacks;

import java.util.Stack;

public class NearestGreater {
    
    public static int[] nearestGreaterRight(int[] nums){
        int[] result=new int[nums.length];
        
        //Brute force
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]>nums[i]){
        //             result[i]=nums[j];
        //             break;
        //         }
        //     }
        //     if(result[i]== 0) 
        //         result[i]=-1;
        // }
        // result[nums.length-1]=-1;
        // return result;

        //Stack
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(st.isEmpty()){
                result[i]=-1;
            }else if(!st.isEmpty() && st.peek()>nums[i]){
                result[i]=st.peek();
            }else if(st.size()>0 && st.peek()<nums[i]){
                while(st.size()>0 && st.peek()<=nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i]=-1;
                }else{
                    result[i]=st.peek();
                }
               
            }
            st.add(nums[i]);
        }
        return result;
    }
}
