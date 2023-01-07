package Concepts.Stacks;
import java.util.*;

public class NearestSmallest {
    public static int[] nearestSmallestLeft(int[] nums){
        int[] result=new int[nums.length];
        //Stack 
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()){
                result[i]=-1;
            }else if(st.size()>0 && st.peek()<nums[i]){
                result[i]=st.peek();
            }else if(st.size()>0 && st.peek()>nums[i]){
                while(!st.isEmpty() && st.peek()>=nums[i]){
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
