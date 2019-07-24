bool isIdentical(Node *r1, Node *r2)
{
    if(r1==NULL && r2==NULL)
    return 1;
    
    if(r1==NULL || r2==NULL)
    return 0;
    
    if(r1->data!=r2->data)
    return 0;
    
    bool l;
    if(isIdentical(r1->left,r2->left))
    l=1;
    else
    return 0;
    
    bool r;
    if(isIdentical(r1->right,r2->right))
    r=1;
    else
    return 0;
    
    return 1;
}
