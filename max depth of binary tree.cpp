int Solution::maxDepth(TreeNode* A)
{
    if(A==NULL)
    return 0;
    
    int l=maxDepth(A->left);
    int r=maxDepth(A->right);
    
    return max(l,r)+1;
}
