package com.cyberdream;

public class binaryseach1 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        //check for first occurrence
       int start = search(nums, target, true);
       int end= search(nums, target, false);

       ans[0]= start;
       ans[1]= end;
       return ans;
    }
    //this funciton will return the index value of target
    int search(int[] nums , int target, boolean findstartindex) {
        int ans=-1;
        int start=0;
        int end= nums.length-1;
        //binary search -->
        while(start<=end) {//************************LOOP
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential answer is found
                ans=mid;
                if(findstartindex){
                    end= mid-1;
                }
                else {
                    start= mid+1;
                }
            }
        }
        return ans;
    }
}
