class Solution {
    fun appendCharacters(s: String, t: String): Int {
        var i=0
        var j=0
        while(i<t.length&&j<s.length){
            if(t[i]==s[j]){
                i++
            }
            j++
        }

        if(i==0){
            return t.length
        }
        else{
             return t.length-i
        }

   
    }
}
