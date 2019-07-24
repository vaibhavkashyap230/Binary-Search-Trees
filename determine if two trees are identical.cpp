#include<vector>
void ser(Node *temp,vector<int>&v)
{
    if(temp==NULL)
    return;
    
    v.push_back(temp->data);
        ser(temp->left,v);
        ser(temp->right,v);
}
bool isIdentical(Node *r1, Node *r2)
{
    vector<int>v1;
    ser(r1,v1);
    vector<int>v2;
    ser(r2,v2);
    if(v1==v2)
    return 1;
    else
    return 0;
}
