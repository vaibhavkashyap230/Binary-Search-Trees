#include<stdio.h>
#include<iostream>
#include<vector>
using namespace std;

class Node
{
	public:
		int data;
		Node *left,*right;
};

Node* insert(Node *temp,int data)
{
	if(temp==NULL)
	{
		Node *nn=new Node();
		nn->data=data;
		nn->left=NULL;
		nn->right=NULL;
		return nn;
	}
	
	if(data<=temp->data)
	temp->left=insert(temp->left,data);
	
	else
	temp->right=insert(temp->right,data);
	
	return temp;
}

void serialise(Node *root,vector<int> &v)
{
	if(root==NULL)
	{
		v.push_back(-1);
	    return;
	}
	v.push_back(root->data);
	serialise(root->left,v);
	serialise(root->right,v);
}

int main()
{
	Node *root=NULL;	
	root=insert(root,20);
	root=insert(root,8);
	root=insert(root,4);
	root=insert(root,12);
	root=insert(root,10);
	root=insert(root,14);
	vector<int>v;
	serialise(root,v);
	while(!v.empty())
	{
		cout<<v[0]<<" ";
		v.erase(v.begin());
	}
	return(0);
}
