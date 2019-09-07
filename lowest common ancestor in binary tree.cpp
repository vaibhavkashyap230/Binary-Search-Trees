bool ip(TreeNode* temp,int x)
{
    if(temp==NULL)
    return 0;
    
    if(temp->val==x)
    return 1;
    
    return(ip(temp->left,x) | ip(temp->right,x));
}
int Solution::lca(TreeNode* temp, int n1, int n2)
{
    if(n1==n2)
    {
        bool p=ip(temp,n1);
        
        if(p)
        return n1;
        
        else
        return -1;
    }
    bool fl=ip(temp->left,n1);
    bool sl=ip(temp->left,n2);
    bool fr=ip(temp->right,n1);
    bool sr=ip(temp->right,n2);
    
    if((temp->val==n1) && (sl==1 || sr==1))
    return temp->val;
    
    if((temp->val==n2) && (fl==1 || fr==1))
    return temp->val;
    
    if(fl==0 && fr==0)
    return -1;
    
    if(sl==0 && sr==0)
    return -1;
    
    if(fl==1 && sr==1)
    return temp->val;
    
    if(fr==1 && sl==1)
    return temp->val;
    
    if(fl==1 && sl==1)
    return lca(temp->left,n1,n2);
    
    if(fr==1 && sr==1)
    return lca(temp->right,n1,n2);
}
