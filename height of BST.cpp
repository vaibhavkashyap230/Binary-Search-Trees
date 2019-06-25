#include<stdio.h>
#include<iostream>
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
node* insert(node *temp,int x)
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
int height(node *temp)
{
	if(temp==NULL)
	return -1;
	int lh=height(temp->left);
	int rh=height(temp->right);
	return max(lh,rh)+1;
	
}
int main()
{
	node *root=NULL;
	root=insert(root,15);
	root=insert(root,10);
	root=insert(root,20);
	root=insert(root,30);
	root=insert(root,5);
	root=insert(root,12);
	root=insert(root,18);
	root=insert(root,20);
	cout<<"Height of the BST is : ";
	cout<<height(root)<<endl;
	return(0);
}
