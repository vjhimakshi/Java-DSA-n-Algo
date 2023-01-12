package Concepts.Stacks;
import java.util.*;

public class StockSpan {
    
    public static int[] stockSpan(int[] nums){
        int[] result =new int[nums.length];
        //Brute force
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            int count =1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    count++;
                }else{
                    result[i]=count;
                    break;
                }
            }
        }
        

        //stack
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()){
                result[i]=1;
            }else if(nums[i]<st.peek()[0]){
                result[i]=i-st.peek()[1];
                break;
            }else if(nums[i]>st.peek()[0]){
                while(st.size()>0 && nums[i]>=st.peek()[0]){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i]=1;
                }else{
                    result[i]=i-st.peek()[1];
                }

            }
            st.add(new int[] {nums[i],i});
        }
        return result;
    }
}
