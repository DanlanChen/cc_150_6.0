class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        dp = [1]*(n+1)
        if n < 2:
            return dp[n]
        for i in range(2, len(dp)):
            dp[i] = dp[i - 1] + dp[i -2]
        
        return dp[n]
