import java.util.*;
import java.io.*;

public class SubsetSum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        findSubSetSums(0, ans, n, arr, 0);
        System.out.println(ans);
    }
    private static void findSubSetSums(int level, List<Integer> ans, int n, int arr[], int sum){
        if(level > n) return;
        //if u reach at the end add the sum in ans
        if(level == n){
            ans.add(sum);
            return;
        }
        // dont pick and sum will remain same
        findSubSetSums(level + 1, ans, n, arr, sum);
        //pick and sum will change
        findSubSetSums(level + 1, ans, n, arr, sum + arr[level]);  
    }
}