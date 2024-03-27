public class FindIndex {
public int[] sumOfTwoNumebers(int []nums,int target) {
int leftIndex = 0;
int rightIndex = nums.length-1;
//System.out.println("right length is : "+ rightIndex+" left index is : "+ leftIndex );
while(leftIndex < rightIndex) {
int sum = nums[leftIndex]+nums[rightIndex];
if(sum == target)
return new int[] {leftIndex,rightIndex};
else if(sum < target)
leftIndex++;
else
rightIndex--;
}
return new int[] {-1,-1};
}
public static void main(String[] args) {
int []nums = {2,7,11,15};
int target = 19;
int[] indexes = new FindIndex().sumOfTwoNumebers(nums, target);
if(indexes[0] <= -1)
System.out.println("No two number sums are equal to target");
else
System.out.println("Index of first number : " +indexes[0] +" Index of second number : " +

indexes[1]);

}
}
