class Solution {
public List<List<Integer>>generate(int rownbr)
{
    List<List<Integer>>pascal=new ArrayList();
    for(int i=0;i<rownbr;i++)
    {
        List<Integer>row=new ArrayList();
        for(int j=0;j<=i;j++)
        {
            if(j==0 || j==i)
            {
                row.add(1);
            }
            else
            {
                List<Integer>prevrow=pascal.get(i-1);
                row.add(prevrow.get(j)+prevrow.get(j-1));
            }
        }
        pascal.add(row);
    }
    return pascal;
}
        
    }
