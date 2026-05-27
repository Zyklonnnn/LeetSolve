class Solution {
    public boolean isPalindrome(int x) {
        int d,s=0,nc=x;
        if(x<0)
            return false;

        while(x!=0)
        {
            d=x%10;
            s=s*10+d;
            x=x/10;
        }

        return nc==s;
    }
}

/*----------------------  OR  ----------------------*/

class Solution {
    public boolean isPalindrome(int x) {
        String st = x+"";
        int p1=0,p2=st.length()-1;
        while(p1<p2)
        {
            if(st.charAt(p1++)!=st.charAt(p2--))
                return false;
        }
        return true;
    }
}