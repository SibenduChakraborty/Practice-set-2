package com.cyberdream;

public class smallestletter {
    static char search2(char[] letters, int target){
        int start=0;
        int end= letters.length-1;
        int res=0;
        while(start<=end){
            int mid = start + ( end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            } else {
                start= mid+1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] arr= new char[]{'c' , 'f' , 'j'};
        char res= search2(arr,'a' );
        System.out.println(res);
    }
}
