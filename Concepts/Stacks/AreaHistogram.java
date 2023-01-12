package Concepts.Stacks;
import java.util.*;

public class AreaHistogram{

    public static int largestAreaHistogram(int[] heights){
        int[] leftArr=new int[heights.length];
        int[] rightArr=new int[heights.length];

        Stack<int[]> st=new Stack<>();

        for(int i=0;i<heights.length;i++){
            if(st.isEmpty()){
                leftArr[i]=-1;
            }else if(st.size()>0 && st.peek()[0]<heights[i]){
                leftArr[i]=st.peek()[0];
            }else if(st.size()>0 && st.peek()[0]>heights[i]){
                while(!st.isEmpty() && st.peek()[0]>=heights[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    leftArr[i]=-1;
                }else{
                    leftArr[i]=st.peek()[1];
                }
            }
            st.add(new int[] {heights[i],i});
        }

        
        return 0;

    }
}