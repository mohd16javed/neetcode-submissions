class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len=s.length-1
        while(len>=0 && s[len]==' '){
            len--
        }
        var lastword=0
        while(len>=0 && s[len]!=' '){
            lastword++
            len--
        }
        return lastword
    }
}
