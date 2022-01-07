public class Solution {
    public bool IsPowerOfTwo(int n) {
        double power = 0;
        double check = Math.Pow(2.0, power);
        Console.WriteLine(check);
        while(check <= n){
            if((int) check == n)
                return true;
            check = Math.Pow(2.0, ++power);
        }
        return false;
    }
}
