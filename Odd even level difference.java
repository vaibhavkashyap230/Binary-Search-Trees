// https://practice.geeksforgeeks.org/problems/odd-even-level-difference/1/

class Tree
{
    int difference(Node temp,int dif,int level)
    {
        if(temp==null)
            return dif;
        
        if(level%2==1)
            dif+=temp.data;
        else
            dif-=temp.data;
        
        dif = difference(temp.left,dif,level+1);
        dif = difference(temp.right,dif,level+1);
        return dif;
    }

    int getLevelDiff(Node root)
    {
        return difference(root,0,1);
    }
}
