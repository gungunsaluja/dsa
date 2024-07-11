https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// in this problem we have to find the max sum we can obtain from a array by taking elements from either front or end but the condition is that elements should be consecutive 
// so to do this we will take two variable one is leftsum =0 and rightsum  =0 maxsum =0
// now we will run a loop fron 0 to k-1 where k is the no of elements that you can select we will store the sum from 0 to k-1 to the leftsum variable now we will store the value of
// leftsum to the maxsum varibale and run another loop to mainly take elements from the end of the array to do so we will take index ri and initialize with n-1 meanin cardspoint.l-1
// we will run  a loop from k-1 to 0 and we will do some operations leftsum-=cardspoint[i] because we want to select items from the last as well and rightsum+=cardspoint[ri];
// then ri-- and maxsum = max(maxsum,leftsum+rightsum);
1423. Maximum Points You Can Obtain from Cards
  class solution{
  public int maxScore(int cardsPoints[],int k)
  {
    int leftsum = 0;
    int rightsum = 0;
    int maxsum  = 0;
    for(int i=0;i<=k-1;i++){
      leftsum+=cardsPoints[i];
      maxsum = leftsum;
    }
    int ri = cardsPoints.length-1;
    for(int i=k-1;i>=0;i--)
      {
        leftsum-=cardsPoints[i];
        rightsum+=cardsPoint[ri];
        ri--;
        maxsum=Math.max(maxsum,leftsum,rightsum);
      }
    return maxsum;

    
  }
