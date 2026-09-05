class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        var result=mutableListOf<String>()
        for(i in words.indices){
            for(j in words.indices){
                if(i!=j && words[j].contains(words[i])){
                    result.add(words[i])
                    break
                }
            }
        }
        return result
    }
}
