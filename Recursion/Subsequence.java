import java.util.*;
import java.io.*;
/*
1. Print all subsequence of an array using recursion
t.c = o(2^n)
s.c = o(n)
*/
public class Subsequence{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        print(0, arr, new ArrayList<>());
    }

    public static void print(int level, int arr[], ArrayList<Integer> ans){
        
        //base case -> if we reach at the end of array print the ans
        if(level == arr.length){
            System.out.println(ans);
            return;
        }
        //dont take and move to next level
        print(level + 1, arr, ans);
        
        //take and move to next level
        // build subsequence -> add arr[level] in list 
        ans.add(arr[level]);
        print(level + 1, arr, ans);
        //remove the last added val
        ans.remove(ans.size() - 1);
    } 
}