/*Complete the function below
Node is as follows
struct Node{
	int data;
	Node *left, *right;
};
*/
int sum(Node* temp,int &s)
{
    if(temp==NULL)
    return 0;
    
    int left,right;
    left=sum(temp->left,s);
    right=sum(temp->right,s);
    
    int t=left+right+temp->data;
    if(t>s)
    s=t;
    
    return max(left,right)+temp->data;
}
int maxPathSum(struct Node *root)
{
    int s=0;
    int it=sum(root,s);
    return s;
}
