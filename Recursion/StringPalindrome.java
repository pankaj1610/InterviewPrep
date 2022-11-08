import java.util.*;
import java.io.*;
/*
1. Check If a string is palindrome or not using recursion
*/
public class StringPalindrome{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(validPalindrome(str, 0, str.length() - 1));
    }

    public static boolean validPalindrome(String str, int l, int r){
        if(l >= r){
            return true;
        }

        if(str.charAt(l) != str.charAt(r)){
            return false;
        }

        return validPalindrome(str, l + 1, r - 1);
    } 
}