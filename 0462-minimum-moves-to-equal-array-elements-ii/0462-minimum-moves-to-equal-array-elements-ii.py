class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()
        mid = len(nums)//2
        median = nums[mid]
        moves = 0 
        for move in nums:
            moves = moves + abs(move - median)
        return moves