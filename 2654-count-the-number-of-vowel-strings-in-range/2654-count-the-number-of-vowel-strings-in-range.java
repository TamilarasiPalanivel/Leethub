class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int i;
        int c=0;
    for(i=left;i<=right;i++)
        {

            String word=words[i];
            if(isvowel(word.charAt(0))&&isvowel(word.charAt(word.length()-1)))
            {
                c++;
            }
        }

        return c;
    }
        private boolean isvowel(char c)
        {
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        }

        
        
    }
