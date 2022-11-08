import java.util.*;
import java.io.*;
/*
1. Count subsequence of an array which have sum S using recursion
t.c = o(2^n)
s.c = o(n)
*/
public class CountSubsequence{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int S = scn.nextInt(); 
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        int ans = print(0, arr, new ArrayList<>(), S);
        System.out.println(ans);
    }

    public static int print(int level, int arr[], ArrayList<Integer> ans, int S){
        
        //base case -> if we reach at the end of array and S is zero
        if(level == arr.length)
        {   if(S == 0){
                return 1;
            }
            return 0;
        }
        //dont take and move to next level
        int count = print(level + 1, arr, ans, S);
        
        //take and move to next level
        if(arr[level] <= S){
            count += print(level + 1, arr, ans, S - arr[level]);   
        }

        return count;
        
    }


}