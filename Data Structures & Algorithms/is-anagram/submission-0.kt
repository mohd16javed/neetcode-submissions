class Solution {
    fun isAnagram(s: String, t: String): Boolean {

    if(s.length!=t.length){
        return false
    }
    var count=HashMap<Char,Int>()
    for(char in s){
       count[char]=count.getOrDefault(char,0)+1
    }
    for(char in t){
    count[char]=count.getOrDefault(char,0)-1
    if(count[char]!!<0){
        return false
    }
    }
    return true
}
}
