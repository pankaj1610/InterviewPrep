import java.util.*;
import java.io.*;
/*1. Print name N times using recursion
*/
public class Test{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        printName(N);
    }

    public static void printName(int N){
        if(N == 0) return;
        System.out.println("Pankaj");
        printName(N - 1);
    } 
}