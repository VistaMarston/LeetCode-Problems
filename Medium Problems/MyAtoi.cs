public class Solution {
    public int MyAtoi(string s) {
        string num = "";
        int front = 0;
        int end = s.Length;
        int finalNumber = 0;
        bool zeros = false;
        while (front < end && (s[front] == '0' || s[front] == ' ')) {// Removes all leading spaces
            if (s[front] == '0')
                zeros = true;
            if (zeros && s[front] == ' ')
                return 0;
            front++;
        }
        
        if (front >= end || (zeros && s[front] == '-')) // Reached the end
            return 0;
        
        if (s[front] == '+' || s[front] == '-') { // Grab the sign
            num += s[front]; 
            front++;
        } else if (!Char.IsDigit(s[front])) // The next char isn't digit
               return 0;
        
        for (int index = front; index < end; index++) { // Loop through until the non-digit is found
            if (Char.IsDigit(s[index]))
                num += s[index];
            else
                break;
        }
               
        if (num.Length == 0 || (num.Length == 1 && !Char.IsDigit(num[0]))) // Not a valid number
               return 0;
               
        try { // Try converting to an integer
            finalNumber = Int32.Parse(num);
        } catch (Exception e) { // To large
            if (num[0] == '-') 
                return (int) -Math.Pow(2,31);
            else
                return (int) Math.Pow(2, 31) - 1;
        }
        
        return finalNumber;  
    }
}
