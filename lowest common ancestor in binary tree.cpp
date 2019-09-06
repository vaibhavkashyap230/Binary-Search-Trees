bool ip(Node* temp,int x)
{
    if(temp==NULL)
    return 0;
    
    if(temp->data==x)
    return 1;
    
    return(ip(temp->left,x) | ip(temp->right,x));
}
Node * lca(Node* temp ,int n1 ,int n2 )
{
    if(temp->data==n1 || temp->data==n2)
    return temp;
    
    bool fl=ip(temp->left,n1);
    bool sl=ip(temp->left,n2);
    bool fr=ip(temp->right,n1);
    bool sr=ip(temp->right,n2);
    
    if(fl==0 && fr==0 && sl==0 && sr==0)
    return NULL;
    
    if(fl==1 && sr==1)
    return temp;
    
    if(fr==1 && sl==1)
    return temp;
    
    if(fl==1 && sl==1)
    return lca(temp->left,n1,n2);
    
    if(sr==1 && sr==1)
    return lca(temp->right,n1,n2);
}
