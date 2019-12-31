// https://www.interviewbit.com/problems/2sum-binary-tree/

#include<vector>
void fill(TreeNode *temp,vector<int> &v)
{
    if(temp==NULL)
    return;
    
    fill(temp->left,v);
    v.push_back(temp->val);
    fill(temp->right,v);
}
int Solution::t2Sum(TreeNode* head, int t)
{
    if(head==NULL)
    return 0;
    
    vector<int>v;
    fill(head,v);
    
    int s=0,e=v.size()-1;
    while(s<e)
    {
        if(v[s]+v[e]==t)
        return 1;
        
        if(v[s]+v[e]>t)
        e-=1;
        
        if(v[s]+v[e]<t)
        s+=1;
    }
    
    return 0;
}
