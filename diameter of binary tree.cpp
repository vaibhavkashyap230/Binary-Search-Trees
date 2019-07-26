int dia(Node* root,Node* temp,int c,int &m)
{
    if(temp==NULL)
    return c+1;
    
    int l=dia(root,temp->left,c,m);
    int r=dia(root,temp->right,c,m);
    
    int t=l+r+1;
    if(temp->left!=NULL && temp->right!=NULL)
    {if(t>m)
     m=t;
    }
    
    if(temp==root)
    return max(m,max(l,r)+1);
    
    return max(l,r)+1;
}
int diameter(Node* node)
{
    int m=0;
    return dia(node,node,-1,m);
}
