/* A binary tree node structure
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
    
    Node(int x)
    {
        data = x;
        left = right = NULL;
    }
};
 */
int check(Node* root)
{
    if(root==NULL)
    {
        return 0;
    }
    
    int left,right;
    left=check(root->left);
    right=check(root->right);
    
    if(left==-1 || right==-1)
    {
        return -1;
    }
    
    if(abs(left-right)>1)
    {
        return -1;
    }
    return max(left,right)+1;
}
bool isBalanced(Node *root)
{
    if(root==NULL)
    return 1;
    
    if(check(root)==-1)
    return 0;
    
    return 1;
}
