bool isBST(Node* root)
{
    bool result=isBSTUtil(root,INT_MIN,INT_MAX);
	return result;
}

int isBSTUtil(struct Node* node, int min, int max)
{
    if(node==NULL)
	return 1;
	
	if(node->data>=min & node->data<max)
	{
		bool l=isBSTUtil(node->left,min,node->data);
		bool r=isBSTUtil(node->right,node->data,max);
		return l&r;
	}
	else
	return 0;
}
