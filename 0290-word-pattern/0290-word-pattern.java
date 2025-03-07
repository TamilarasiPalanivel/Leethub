class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> m=new HashMap<>();
        String str[]=s.split(" ");

        if(pattern.length()!=str.length) {return false;}
      

        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(m.containsKey(ch))
            {
                String res=m.get(ch);
                if(!res.equals(str[i]))
                {
                    return false;
                }
            }
            //check if the values are repeating ie a-->dog b-->dog should not b repeated 
            else
            {
                if(m.containsValue(str[i]))
                {
                    return false;
                }
            }

            m.put(ch,str[i]);
        }
        return true;
    }
}