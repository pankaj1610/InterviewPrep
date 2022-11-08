import java.util.*;
import java.io.*;
/*
1. Print 1 to N in decreasing order using recursion
*/
public class PrintNto1{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        print(N);
    }

    public static void print(int N){
        if(N == 0) return;
        System.out.println(N);
        print(N - 1);
    } 
}