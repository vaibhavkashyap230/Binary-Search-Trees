#include<stdio.h>
#include<iostream>
#include<queue>
using namespace std;

class node
{
	public:
		int data;
		node *left,*right;
};

node* new_node(int x)
{
	node *temp=new node();
	temp->data=x;
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}

node* insert(node* temp,int x)
{
	if(temp==NULL)
	{
		temp=new_node(x);
	}
	else if(x<=temp->data)
	temp->left=insert(temp->left,x);
	else
	temp->right=insert(temp->right,x);
	return temp;
}

void level_order(node* root)
{
	if(root==NULL)
	{
		cout<<"The tree is empty"<<endl;
		return;
	}
	
	queue<node*>q;
	q.push(root);
	node *temp;
	while(!q.empty())
	{
		temp=q.front();
		cout<<temp->data<<" ";
		if(temp->left!=NULL)
		{q.push(temp->left);}
		if(temp->right!=NULL)
		{q.push(temp->right);}
		q.pop();
	}
	cout<<endl;
}

int main()
{
	node *root=NULL;
	root=insert(root,15);
	root=insert(root,10);
	root=insert(root,20);
	root=insert(root,5);
	root=insert(root,12);
	root=insert(root,18);
	root=insert(root,20);
	root=insert(root,30);
	level_order(root);
	return(0);
}
