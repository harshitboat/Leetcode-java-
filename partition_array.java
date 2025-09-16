import java.util.*;

public class partition_array {
    public static void main(String[]args){

       int[]nums={1,2,3,4};

       Arrays.sort(nums);
       int sum=0;
       
       for(int i=0;i<nums.length;i=i+2){
        sum=sum+nums[i];
       }
      System.out.print(sum);

    }
}
