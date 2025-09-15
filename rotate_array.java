public class rotate_array {
    public static void main(String[]args){
        int k =3;
        int nums[] = {1,2,3,4,5,6,7};
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        for(int num:nums){
            System.out.print(num+" ");
        }

    }
    public static void reverse(int nums[],int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    
}
