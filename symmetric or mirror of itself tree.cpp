bool check(Node* left,Node* right)
{
    if(left==NULL && right==NULL)
    return 1;
    
    if(left==NULL || right==NULL)
    return 0;
    
    if(left->key!=right->key)
    return 0;
    
    return check(left->right,right->left);
}

bool isSymmetric(struct Node* root)
{
    if(root==NULL)
    return 1;
    
    return check(root->left,root->right);
}
