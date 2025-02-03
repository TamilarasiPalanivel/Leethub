class Solution {
    public String reverseWords(String s) {
        int n=s.length(),i;
        String[] words=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(i=words.length-1;i>=0;i--)
        {
            res.append(words[i]);
            if(i!=0) res.append(" ");
        
             }

        
    return res.toString();
    }
}