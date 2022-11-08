import java.util.*;
import java.io.*;
/*
1. Factorial of N using recursion
*/
public class Factorial{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println(fact(N));
    }

    public static int fact(int N){
        if(N == 0) return 1;
        return N * fact(N - 1);
    } 
}