class Solution {
    static int evenlyDivides(int n) {
       
        int count=0;
        int original=n;
        while(n>0){
            int digi = n%10;
            n=n/10;
            
            if(digi!=0 && original%digi==0  )
            count++;
        }
        return count;
    }
        
        public static void main(String[]args){
            int n=1234567;
            System.out.println(evenlyDivides(n));
        }
        // code here
    }
