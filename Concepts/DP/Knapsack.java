package Concepts.DP;
import java.util.*;

public class Knapsack {
    public static int[][] t= new int[202][1002];
    // Arrays.stream(t).forEach(row->Arrays.fill(row,-1));

    
    public int knapsack(int[] wt,int[] val,int W,int n){
        //Base Condn
        if(n==0|| W==0){            
            return 0;
        }
        //memoization
        if(t[n][W] != -1){          
            return t[n][W];
        }
        //Choice diag 
        if(wt[n-1]<= W){
            return t[n][W] = Math.max(val[n-1]+ knapsack(wt, val, W-wt[n-1], n-1),knapsack(wt, val, W, n-1));  //item inluded in 1st call and not included in 2nd call
        }else if(wt[n-1] > W){
            return  t[n][W] = knapsack(wt, val, W, n-1);    //item not included
        }

        return 0;
    }
}


