class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max=0
        var s=0
        for(i in nums){
            if(i==1){
                s++
            }
            else{
                s=0
            }
            if(s>max){
                max=s
            }
        }
        return max
    }
}
