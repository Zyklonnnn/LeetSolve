class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.trim().split("\\s+");
        return st[st.length-1].length();
    }
}

/*----------------------  OR  ----------------------*/

class Solution {
    public int lengthOfLastWord(String s) {
        Scanner in = new Scanner(s);
        String st="";
        while(in.hasNext())
        {
            st=in.next();
        }
        return st.length();
    }
}