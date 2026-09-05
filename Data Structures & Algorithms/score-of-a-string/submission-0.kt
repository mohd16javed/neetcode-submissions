class Solution {
    fun scoreOfString(s: String): Int {
        var score=0
        for(i in 0 until s.length-1){
            score=score+kotlin.math.abs(s[i+1].code-s[i].code)
        }
        return score
    }
}
