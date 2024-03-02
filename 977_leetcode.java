
977. Squares of a Sorted Array
  publis int[] sortedSquares(int nums[]){
  for(int i=0i<nums.length;i++){
    nums[i] = nums[i]*nums[i];
  }
  Arrays.sort(nums);
  return nums;}
  
