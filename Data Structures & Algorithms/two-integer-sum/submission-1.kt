class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var sol=HashMap<Int,Int>()

        for(i in nums.indices){
            var req=target-nums[i]

            if(sol.containsKey(req)){
                return intArrayOf(sol[req]!!,i)
            }

            sol[nums[i]]=i
        }
        return intArrayOf()
    }
}
