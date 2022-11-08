import java.util.*;
import java.io.*;
/*1. Print 1 to N in increasing order using recursion
*/
public class Print1toN{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        print(N);
    }

    public static void print(int N){
        if(N == 0) return;
        print(N - 1);
        System.out.println(N);
    } 
}