
// https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

*/
//Complete this function
private static void check(Node temp,int l,int h,int count[])
{
    if(temp==null)
        return;
        
    if(temp.data>=l && temp.data<=h)
        count[0]+=1;
        
    check(temp.left,l,h,count);
    check(temp.right,l,h,count);
}

public static int getCountOfNode(Node root,int l, int h)
{
    int count[] = new int[1];
    check(root,l,h,count);
    return count[0];
}
