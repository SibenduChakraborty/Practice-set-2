package com.cyberdream;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        sort(arr,0,3);
        for(int i=0;i<4;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void merge(int[] arr, int l, int mid, int r){
        int n1= mid-l+1;
        int n2= r-mid;

        int[] a= new int[n1];
        int[] b= new int[n2];

        for(int i=0;i<n1; i++){//coping the elements
            a[i] = arr[l+i];
        }
        for(int i=0;i<n2; i++){//coping the elements
            b[i] = arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;//the pointer that will be used to put elements into the sorted array
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                arr[k] = a[i];
                k++;i++;//i++ because we have put the i th element, its work is over
            }
            else{
                arr[k] = b[j];
                k++;j++;//j++ because we have put the j th element, its work is over
            }
        }
        //now if all the elements of the second array is placed, then we have to follow the next step
        while(i<n1){
            arr[k]=a[i];
            k++;i++;
        }
        while(j<n2){
            arr[k] = b[j];
            k++;j++;
        }
    }
    static void sort(int[] arr, int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);//similar to mid++
            merge(arr, l,mid,r);
        }
    }

}
