package com.company;

public class lib {

    public static boolean haveThree(int[] nums) {
        int count = 0;
        boolean threeFound = false;
        for(int i = 0; i < nums.length; i++){
            if(threeFound == false){
                if(nums[i] == 3){
                    count++;
                    threeFound = true;
                }
            }else{
                if(nums[i] == 3){
                    return false;
                }
                threeFound = false;
            }
        }
        if(count == 3){
            return true;
        }else{
            return false;
        }
    }

}
