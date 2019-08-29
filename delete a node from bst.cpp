#include<stdio.h>
#include<iostream>
using namespace std;
class node
{
	public:
		int data;
		node *left,*right;
};

node* insert(node* temp,int x)
{
	if(temp==NULL)
	{
		node *nn=new node();
		nn->data=x;
		nn->left=NULL;
		nn->right=NULL;
		return nn;
	}
	
	if(temp->data>=x)
	{
		temp->left=insert(temp->left,x);
	}
	else
	{
		temp->right=insert(temp->right,x);
	}
	
	return temp;
}

void print(node *root)
{
	if(root==NULL)
	return;
	
	cout<<root->data<<" ";
	print(root->left);
	print(root->right);
}

node* del(node* temp,int x)
{
	if(temp==NULL)
	{
		return NULL;
	}
	
	else if(x<temp->data)
	{
		temp->left=del(temp->left,x);
	}
	
	else if(x>temp->data)
	{
		temp->right=del(temp->right,x);
	}
	
	else
	{
		// no children
		if(temp->left==NULL && temp->right==NULL)
		{
			node *d=temp;
			temp=NULL;
			delete d;
		}
		
		// 1 child
		
		// right child is not NULL
		else if(temp->left==NULL && temp->right!=NULL)
		{
			node *d=temp;
			temp=temp->right;
			delete d;
		}
		
		// left child is not empty
		else if(temp->left!=NULL && temp->right==NULL)
		{
			node *d=temp;
			temp=temp->left;
			delete d;
		}
		
		// 2 children
		else
		{
			node *m=temp->left;
			while(m->right!=NULL)
			{
				m=m->right;
			}
			temp->data=m->data;
			temp->left=del(temp->left,m->data);
		}
	}
	
	return temp;
}

int main()
{
	node *root=NULL;
	root=insert(root,50);
	root=insert(root,25);
	root=insert(root,75);
	root=insert(root,60);
	root=insert(root,83);
	root=insert(root,55);
	root=insert(root,70);
	root=insert(root,78);
	root=insert(root,79);
	root=insert(root,80);
	root=insert(root,82);
	root=insert(root,77);
	root=insert(root,76);
	root=insert(root,85);
	root=insert(root,90);
	root=insert(root,95);
	root=insert(root,109);
	root=insert(root,20);
	root=insert(root,40);
	root=insert(root,10);
	root=insert(root,21);
	root=insert(root,35);
	root=insert(root,15);
	root=insert(root,22);
	print(root);
	cout<<endl<<"Enter the no. to delete : ";
	int n;
	cin>>n;
	root=del(root,n);
	cout<<endl;
	print(root);
	return(0);
}
