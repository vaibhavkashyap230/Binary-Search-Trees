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

void min(node *temp)
{
	if(temp->left==NULL)
	{
		cout<<temp->data<<endl;
		return;
	}
	min(temp->left);
}

int max(node *temp)
{
	while(temp->right!=NULL)
	{
		temp=temp->right;
	}
	return temp->data;
}

int main()
{
	node *root=NULL;
	root=insert(root,15);
	root=insert(root,10);
	root=insert(root,20);
	root=insert(root,20);
	root=insert(root,30);
	root=insert(root,5);
	root=insert(root,12);
	root=insert(root,3);
	root=insert(root,52);
	cout<<"Max element is : ";
	min(root);
	cout<<"Min element is : "<<max(root);
	return(0);
}
