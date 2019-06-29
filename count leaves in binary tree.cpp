int rfc(Node *temp,int c)
{
    if(temp==NULL)
    return c+1;
    
    c=rfc(temp->left,c);
    c=rfc(temp->right,c);
    
    return c;
}

int countLeaves(Node* root)
{
  return rfc(root,0)/2;
}
