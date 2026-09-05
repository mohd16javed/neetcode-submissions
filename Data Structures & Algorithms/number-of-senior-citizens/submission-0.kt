class Solution {
    fun countSeniors(details: Array<String>): Int {
        var count=0
        for(person in details){
            var k=person.substring(11,13).toInt()
            if(k>60){
                count++
            }
        }
        return count
    }
}
