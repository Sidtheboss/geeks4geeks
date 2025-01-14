class Solution {
    static int getLastDigit(String a, String b) {
        // Get the last digit of a
        int lastDigitA = a.charAt(a.length() - 1) - '0';
        
        // If b is "0", the result is always 1
        if (b.equals("0")) {
            return 1;
        }
        
        // Calculate b % 4
        int modB = 0;
        for (int i = 0; i < b.length(); i++) {
            modB = (modB * 10 + (b.charAt(i) - '0')) % 4;
        }
        
        // If b % 4 == 0, use 4 (as the cycle length is 4)
        if (modB == 0) {
            modB = 4;
        }
        
        // Compute the last digit of a^b
        int result = (int) Math.pow(lastDigitA, modB) % 10;
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(getLastDigit("3", "10")); // Output: 9
        System.out.println(getLastDigit("6", "2"));  // Output: 6
    }
}
