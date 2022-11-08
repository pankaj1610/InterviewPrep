import java.util.*;
import java.io.*;
/*
1. Print all the combination which have sum S using recursion
t.c = o(2^t * k) k = avg length of combination  t = no of times we can pick or not pick ane ele 
s.c = o(k * x) x = no of combination
*/
public class CombinationSum{
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

    public static void print(int level, int arr[], ArrayList<Integer> ans, int S){
        
        //base case -> if we reach at the end of array and S is zero print the combination
        if(level == arr.length)
        {   if(S == 0){
                System.out.println(ans);
            }
            return;
        }

        //dont take and move to next level
        print(level + 1, arr, ans, S);

        //take and stay at the same level
        // build combination -> add arr[level] in list
        if(arr[level] <= S){
            ans.add(arr[level]);
            print(level, arr, ans, S - arr[level]);
            //remove the last added val
            ans.remove(ans.size() - 1);
        }
        
    }


}