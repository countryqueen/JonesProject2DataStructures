/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 */
public class LinkList 
{
    //here are the private instance variables
    private int value;
    
    private LinkList nextLink;  
    
    //this is my getter
    public int getValue()
    {
        
        return value;

    }
    
    //this is my getter
    public LinkList getLinkList()
    {
        return nextLink;
        
    }
    
    //create a setter
    public void setValue(int value)
    {
        this.value = value;
    }
    
    //create another setter
    public void setLinkList(LinkList nextLink)
    {
        this.nextLink = nextLink;
    }

}

