import java.util.*;
import java.io.*;
/*
1. Print any subsequence of an array which have sum S using recursion
t.c = o(2^n)
s.c = o(n)
*/
public class OneSubsequenceWithTarget{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int S = scn.nextInt(); 
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        print(0, arr, new ArrayList<>(), S);
    }

    public static boolean print(int level, int arr[], ArrayList<Integer> ans, int S){
        
        //base case -> if we reach at the end of array and S is zero print the subsequence
        if(level == arr.length)
        {   if(S == 0){
                System.out.println(ans);
                return true;
            }
            return false;
        }
        //dont take and move to next level
        if(print(level + 1, arr, ans, S)){
            return true;
        }
        
        //take and move to next level
        // build subsequence -> add arr[level] in list
        if(arr[level] <= S){
            ans.add(arr[level]);
            if(print(level + 1, arr, ans, S - arr[level])){
                return true;
            }
            //remove the last added val
            ans.remove(ans.size() - 1);
        }

        return false;
        
    }


}