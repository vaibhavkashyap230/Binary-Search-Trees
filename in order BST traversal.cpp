#include<stdio.h>
#include<iostream>
using namespace std;

class node
{
	public:
		int data;
		node *left,*right;
};

node* insert(node *temp,int x)
{
	if(temp==NULL)
	{
		node*nn=new node();
		nn->data=x;
		nn->left=NULL;
		nn->right=NULL;
		temp=nn;
		return temp;
	}
	else if(x<=temp->data)
	{
		temp->left=insert(temp->left,x);
	}
	else if(x>temp->data)
	{
		temp->right=insert(temp->right,x);
	}
	return temp;
}

void in_order(node *temp)
{
	if(temp==NULL)
	return;
	
	if(temp->left!=NULL)
	in_order(temp->left);
	cout<<temp->data<<" ";
	if(temp->right!=NULL)
	in_order(temp->right);
}

int main()
{
	node *root=NULL;
	root=insert(root,25);
	root=insert(root,15);
	root=insert(root,50);
	root=insert(root,10);
	root=insert(root,22);
	root=insert(root,35);
	root=insert(root,70);
	root=insert(root,66);
	root=insert(root,90);
	root=insert(root,4);
	root=insert(root,12);
	root=insert(root,31);
	root=insert(root,44);
	root=insert(root,18);
	root=insert(root,24);
	cout<<endl<<"The in-order traversal of the tree is : ";
	in_order(root);
	cout<<endl;
	return 0;
}
