// https://classroom.codingninjas.com/app/classroom/me/1108/content/43107/offering/486606/problem/2248

import java.util.*;

public class solution
{
    static void fill(BinaryTreeNode<Integer> temp,ArrayList<Integer> a)
    {
        if(temp==null)
            return;
        fill(temp.left,a);
        a.add(temp.data);
        fill(temp.right,a);
    }
    
    static void print(BinaryTreeNode<Integer> temp)
    {
        if(temp==null)
            return;
        
        print(temp.left);
        System.out.print(temp.data+" ");
        print(temp.right);
    }
    
    static BinaryTreeNode<Integer> to_bst(ArrayList<Integer> a)
    {
        if(a.size()==0)
            return null;
        
        int mid = a.size()/2;
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(a.get(mid));
        ArrayList<Integer> left = new ArrayList<Integer>();
        for(int i=0;i<mid;i++)
        {
            left.add(a.get(i));
        }
        ArrayList<Integer> right = new ArrayList<Integer>();
        for(int i=mid+1;i<a.size();i++)
        {
            right.add(a.get(i));
        }
        temp.left = to_bst(left);
        temp.right = to_bst(right);
        return temp;
    }
    
	static void printMergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2)
    {
        BinaryTreeNode<Integer> temp = root1;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        fill(temp,a);
        temp = root2;
        fill(temp,b);
        int i=0,j=0;
        ArrayList<Integer> r = new ArrayList<Integer>();
        while(i<a.size() && j<b.size())
        {
            if(a.get(i)<b.get(j))
            {
                r.add(a.get(i));
                i+=1;
            }
            else
            {
                r.add(b.get(j));
                j+=1;
            }
        }
        while(i<a.size())
        {
            r.add(a.get(i));
            i+=1;
        }
        while(j<b.size())
        {
            r.add(b.get(j));
            j+=1;
        }
        BinaryTreeNode<Integer> root = to_bst(r);
        print(root);
	}
}