public class Solution {
    public int StrStr(string haystack, string needle) {
        if (needle.Length == 0)
            return 0;
        
        int end = haystack.Length - needle.Length + 1;
        int front = 0;
        
        interLoop: while (front < end) {
            if (haystack[front] == needle[0]) {
                int cursor = front;
                for(int index = 1; index < needle.Length; index++) {
                    cursor++;
                    if (haystack[cursor] != needle[index]) {
                        front++;
                        goto interLoop;
                    }
                }
                return front;
            }
            front++;
        }
        return -1;
    }
}
