/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Alina
 */
public class LList
{
    Link head;   
    
    
    public void push(int add)
    {
        Link add_num = new Link(add);
        add_num.next = head;
        head = add_num;
    }
    
    public boolean ListSearch(Link head, int search)
    {
        if (head==null)
        {return false;
        }
        if (head.number==search)
        {return true;
        }
        return ListSearch(head.next, search);
    }
}
