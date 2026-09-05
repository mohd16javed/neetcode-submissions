class Solution {
    fun validPalindrome(s: String): Boolean {
 fun isPalindrome(left: Int, right: Int): Boolean {
        var l = left
        var r = right
        while (l < r) {
            if (s[l] != s[r]) {
                return false
            }
            l++
            r--
        }
        return true
    }

    var left = 0
    var right = s.lastIndex

    while (left < right) {

        if (s[left] != s[right]) {
            return isPalindrome(left + 1, right) ||
                   isPalindrome(left, right - 1)
        }

        left++
        right--
    }

    return true
    }
}
