// class Solution {
//         ArrayList<String>sol=new ArrayList<>();
//         HashSet<String> hs=new HashSet<>();
//     public boolean checkInclusion(String s1, String s2) {
//         findpermutation(s1);
//         for(String val:sol)
//         {
//             if(s2.contains(val))
//             {
//                 return true;
//             }
            
//         }
//                 return false;
//             }

        
//         public void findpermutation(String s1)
//         {
//             permutation(s1,"");
//             for(String val:hs)
//             {
//                 sol.add(val);
//             }
//             Collections.sort(sol);
//            // return sol;
           
//         }
//         public void permutation(String qns,String ans)
//         {
//             if(qns.length()==0)
//             {
//                 hs.add(ans);
//                 return;
//             }
        
//         for(int i=0;i<qns.length();i++)
//         {
//             char ch=qns.charAt(i);
//             String restofqns=qns.substring(0,i)+qns.substring(i+1);
//             permutation(restofqns,ans+ch);
//         }
        
//     }
// }
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if (n > m) return false; 
        
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        
        for (int i = 0; i < m; i++) {
            s2Count[s2.charAt(i) - 'a']++;
            
            if (i >= n) {
                s2Count[s2.charAt(i - n) - 'a']--;
            }
            
            if (matches(s1Count, s2Count)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
