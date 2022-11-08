import java.util.*;
import java.io.*;
/*
1. Find nth fibonacci number
*/
public class Fibonacci{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println(fib(N));
    }

    public static int fib(int N){
        if(N <= 1) return N;
        return fib(N - 1) + fib(N - 2);
    } 
}