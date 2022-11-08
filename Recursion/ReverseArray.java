import java.util.*;
import java.io.*;
/*
1. Reverse array using recursion
*/
public class ReverseArray{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr, 0, N - 1);
        for(int val : arr){
            System.out.print(val +  " ");
        }
    }

    public static void reverse(int arr[], int l, int r){
        if(l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    } 
}