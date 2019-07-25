#include<vector>
#include<algorithm>
void fillv(Node* temp,vector<int>&v)
{
    if(temp==NULL)
    return;
    
    if(temp->left!=NULL)
    fillv(temp->left,v);
    
    v.push_back(temp->data);
    
    if(temp->right!=NULL)
    fillv(temp->right,v);
}
void printCommon(Node *root1, Node *root2)
{
    vector<int>v1;
    vector<int>v2;
    fillv(root1,v1);
    fillv(root2,v2);
    for(int i=0;i<v1.size();i++)
    {
        for(int j=0;j<v2.size();j++)
        {
            if(v1[i]==v2[j])
            {
                cout<<v1[i]<<" ";
                break;
            }
        }
    }
}
