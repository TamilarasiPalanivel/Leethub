/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElements(int* nums, int numsSize, int* returnSize) {
    int i,j;
    int *res=(int*)malloc(sizeof(int)*numsSize);
    *returnSize=numsSize;
    for(i=0;i<numsSize;i++)
    {
        res[i]=-1;
        for(j=1;j<numsSize;j++)
        {
            if(nums[(i+j)%numsSize]>nums[i])
            {
                res[i]=nums[(i+j)%numsSize];
                break;
            }
        }
    }
    return res;
}