import java.util.*;
import java.io.*;
/*
1. Sum of first N numbers using recursion
*/
public class SumOfFirstNNumbers{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println(sum(N));
    }

    public static int sum(int N){
        if(N == 0) return 0;
        return N + sum(N - 1);
    } 
}