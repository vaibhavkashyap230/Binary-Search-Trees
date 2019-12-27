#include<queue>
void connect(Node *p)
{
    if(p==NULL)
    return;
    
    queue<Node*>q1;
    queue<Node*>q2;
    
    p->nextRight=NULL;
    if(p->left!=NULL)
    q1.push(p->left);
    if(p->right!=NULL)
    q1.push(p->right);
    bool f=1;
    
    while(q1.empty()==0 || q2.empty()==0 )
    {
        if(f==1)
        {
            while(q1.empty()==0)
            {
                Node *temp=q1.front();
                q1.pop();
                if(temp->left!=NULL)
                q2.push(temp->left);
                if(temp->right!=NULL)
                q2.push(temp->right);
                if(q1.empty()==0)
                temp->nextRight=q1.front();
                else
                temp->nextRight=NULL;
            }
            f=0;
        }
        else
        {
            while(q2.empty()==0)
            {
                Node *temp=q2.front();
                q2.pop();
                if(temp->left!=NULL)
                q1.push(temp->left);
                if(temp->right!=NULL)
                q1.push(temp->right);
                if(q2.empty()==0)
                temp->nextRight=q2.front();
                else
                temp->nextRight=NULL;
            }
            f=1;
        }
    }
}
