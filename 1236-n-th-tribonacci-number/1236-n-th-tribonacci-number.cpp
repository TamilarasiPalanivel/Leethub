class Solution {
public:
    int solve(int n) {

        if(n==0 ||n==1)return n;
        if(n==2) return 1;
        
           int p1=0,p2=1,p3=1,c=0;        
        for(int i=3;i<=n;i++)
        {
             c=p1+p2+p3;
            p1=p2;
            p2=p3;
            p3=c;
        }
        return c;
        
        
        
    }
    int tribonacci(int n)
    {
        return solve(n);
    }

        
    
};