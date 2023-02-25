class Solution {
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String r="";
        while(i>=0||j>=0)
        {
      int ival=(i>=0)?num1.charAt(i)-'0':0;
        
        int jval=(j>=0)?num2.charAt(j)-'0':0;
        int sum=ival+jval+carry;
        r=sum%10+r;
        carry=sum/10;
        i--;
        j--;
        }
        if(carry==1)
        {
            r=carry+r;
        }
        return r;  
    }
}