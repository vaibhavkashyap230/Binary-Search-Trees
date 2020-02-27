// https://www.interviewbit.com/problems/partition-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution
{
    public ListNode partition(ListNode A, int x)
    {
        ListNode lh=null,lt=null,mh=null,mt=null;
        ListNode temp=A;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                if(lh==null)
                {
                    lh=temp;
                    lt=temp;
                }
                else
                {
                    lt.next=temp;
                    lt=lt.next;
                }
            }
            else
            {
                if(mh==null)
                {
                    mh=temp;
                    mt=temp;
                }
                else
                {
                    mt.next=temp;
                    mt=mt.next;
                }
            }
            temp=temp.next;
        }
        if(lh==null)
        {
            mt.next=null;
            return mh;
        }
        if(mh==null)
        {
            lt.next=null;
            return lh;
        }
        lt.next=mh;
        mt.next=null;
        return lh;
    }
}