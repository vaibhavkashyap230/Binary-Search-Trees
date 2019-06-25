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

bool find(node *temp,int x)
{
	if(temp==NULL)
	return 0;
	if(temp->data==x)
	return 1;
	if(x<=temp->data)
	{
	    find(temp->left,x);
	}
	else
	{
		find(temp->right,x);
	}
	}

int main()
{
	node *root=NULL;
	root=insert(root,15);
	root=insert(root,10);
	root=insert(root,20);
	cout<<"Enter the element to search : ";
	int x;
	cin>>x;
	if(find(root,x))
	cout<<"It is present.";
	else
	cout<<"It is not present.";
	return(0);
}
