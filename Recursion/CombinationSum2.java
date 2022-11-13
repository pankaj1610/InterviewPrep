import java.util.*;
import java.io.*;
/*
Q. Find all unique combination in the array where the sum of elements of combination is equal to target.
   Each number must used onec.
   Answer should not contain duplicate combination.
   combination should be in sorted order. 
*/
public class CombinationSum2{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        // To get the combination in soretd order first sort the array.
        Arrays.sort(arr);
        findCombination(0, target, new ArrayList<>(), arr);
    }

    private static void findCombination(int level, int target, List<Integer> ans, int arr[]){

        // if target reaches print the ans and return; 
        if(target == 0){
            System.out.println(ans);
            return;
        }

        // For each level there are (n - level) possibilities(choices)
        // For each level the first element has to be picked.
        // To pick the remaining element in a level it should not be same as last picked element.
        // For any choice if target is not reachable do not make any further calls 
        for(int choice = level; choice < arr.length; choice++){
            if(choice > level && arr[choice] == arr[choice - 1]) continue;
            if(arr[choice] > target) break;

            ans.add(arr[choice]);
            findCombination(choice + 1, target - arr[choice], ans, arr);
            ans.remove(ans.size() - 1);
        }
    }
}