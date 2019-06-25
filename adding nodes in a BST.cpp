#include<stdio.h>
#include<iostream>
using namespace std;

class node
{
	public:
	int data;
	node *left;
	node *right;
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
	{
		temp->left=insert(temp->left,x);
	}
	else
	{
		temp->right=insert(temp->right,x);
	}
	return temp;
}

int main()
{
	node *root=NULL;
	root=insert(root,15);
	root=insert(root,10);
	root=insert(root,20);
	cout<<"  "<<root->data<<endl;
	cout<<root->left->data<<"  "<<root->right->data;
	return(0);
}
