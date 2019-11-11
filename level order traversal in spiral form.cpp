#include<stack>
void printSpiral(Node *root)
{
    if(root==NULL)
    return;
    
    cout<<root->data<<" ";
    stack<Node*>st1;
    stack<Node*>st2;
    if(root->right!=NULL)
    st1.push(root->right);
    if(root->left!=NULL)
    st1.push(root->left);
    
    bool f=1;
    while(st1.empty()==0 || st2.empty()==0)
    {
        if(f==1)
        {
            while(st1.empty()==0)
            {
                cout<<st1.top()->data<<" ";
                if(st1.top()->left!=NULL)
                st2.push(st1.top()->left);
                if(st1.top()->right!=NULL)
                st2.push(st1.top()->right);
                st1.pop();
            }
            f=0;
        }
        else
        {
            while(st2.empty()==0)
            {
                cout<<st2.top()->data<<" ";
                if(st2.top()->right!=NULL)
                st1.push(st2.top()->right);
                if(st2.top()->left!=NULL)
                st1.push(st2.top()->left);
                st2.pop();
            }
            f=1;
        }
    }
}
