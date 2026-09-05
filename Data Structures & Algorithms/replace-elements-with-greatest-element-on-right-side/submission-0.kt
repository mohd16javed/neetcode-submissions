class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxright=-1
        for(i in arr.lastIndex downTo 0){
            var current=arr[i]
            arr[i]=maxright
            if(maxright<current){
                maxright=current
            }
        }
        return arr
    }
}
