class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        int n = cardPoints.length;
        for (int a=0; a<k ;a++){
            leftSum+=cardPoints[a];
        }
        maxSum=Math.max(leftSum,maxSum);
        for(int i =0 ; i<k ;i++){
            rightSum +=cardPoints[n-1-i];
            leftSum -= cardPoints[k-1-i];
            maxSum=Math.max(rightSum+leftSum,maxSum);
        }
        return maxSum;
    }
}