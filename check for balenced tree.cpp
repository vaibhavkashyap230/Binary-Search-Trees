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
// This function should return tree if passed  tree 
// is balanced, else false.
struct ret
{
    bool b;
    int lh,rh;
};
ret check(Node* root)
{
    if(root==NULL)
    {
        ret temp;
        temp.b=1;
        temp.lh=0;
        temp.rh=0;
        return temp;
    }
    
    ret left,right,ans;
    left=check(root->left);
    right=check(root->right);
    
    if(left.b==0 || right.b==0)
    {
        ret temp;
        temp.b=0;
        temp.lh=max(left.lh,left.rh)+1;
        temp.rh=max(right.lh,right.rh)+1;
        return temp;
    }
    
    int lh=max(left.lh,left.rh)+1;
    int rh=max(right.lh,right.rh)+1;
    if(abs(lh-rh)>1)
    {
        ret ans;
        ans.b=0;
        ans.lh=max(left.lh,left.rh)+1;
        ans.rh=max(right.lh,right.rh)+1;
        return ans;
    }
    ret temp;
    temp.b=1;
    temp.lh=lh;
    temp.rh=rh;
    return temp;
}
bool isBalanced(Node *root)
{
    if(root==NULL)
    return 1;
    
    ret ans=check(root);
    return ans.b;
}
