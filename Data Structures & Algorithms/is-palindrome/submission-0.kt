class Solution {
    fun isPalindrome(s: String): Boolean {
var left = 0
    var right = s.lastIndex

    while (left < right) {

        // Skip non-alphanumeric characters from left
        while (left < right && !s[left].isLetterOrDigit()) {
            left++
        }

        // Skip non-alphanumeric characters from right
        while (left < right && !s[right].isLetterOrDigit()) {
            right--
        }

        // Compare characters ignoring case
        if (!s[left].equals(s[right], ignoreCase = true)) {
            return false
        }

        left++
        right--
    }

    return true
    }
}
