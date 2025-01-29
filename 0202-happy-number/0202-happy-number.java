
import java.util.HashSet;
import java.util.*;
class Solution
{
    public boolean isHappy(int n) {
       
       Set<Integer>used=new HashSet<>();
       while(n!=1 && !used.contains(n)){
        used.add(n);

       
       int s=0;
       while(n!=0)
       {
       int digit=n%10;
        s+=digit*digit;
        n=n/10;
       
       }
        n=s;
       }
       return n==1;
       }


    }
