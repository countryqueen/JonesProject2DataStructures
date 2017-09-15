/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/*‘***Class Name: TheStack
‘*** Class Author: Angelica Jones
‘*** Purpose of the class: I wrote this class to create the stack.
‘*** Date: 9/09/17
‘*** List of changes with dates. 
‘*** Look at this!‘*** List all the places in the code where you did something interesting,‘*** clever or elegant.  If you did good work in this program and you want‘*** me to consider it in your grade, point it out here.‘*******************************************************/
public class TheStack 
{
    

    //references the first and last of the stack.
    //private variables
    private LinkList head;
    private LinkList tail;
    
    
    public TheStack()
      //constructor
    {
        head = null;
        tail = null;
    }
/***  Method Name: push
 * Method Author: Angelica
 ‘*** Purpose: to push integers on the stack
 ‘***Method Inputs:‘*** integer value
 * Return value:void.
 * Date* 9/11/17 */
    public void push(int value)

    {
        try
        {
        

        //if the head of the link is null aka empty, then make a new one
        if(head==null)

        {
            LinkList box = new LinkList();
            //create a new object
            //store value from the parameter into the box from the LinkList class.
        
             //we are setting the box to value.
            box.setValue(value);
            head = box;
            //the head is the box now
        
            tail = box;
            //the tail is the box too! it's the only link we have    
        }
               else
        {
            LinkList newBox = new LinkList();
            
            //new object has a value of the previous list from
            newBox.setValue(value);
            newBox.setLinkList(head);
            head = newBox;
            //tail = newBox.getLinkList();
 
        }
        }
        
      
        catch(NumberFormatException e)
        {
            System.out.println("Can only enter numbers! Try again!");
        }//this ensures that the program will not crash if user enters anything other than numbers

    }
/***  Method Name: pop
 * Method Author: Angelica
 ‘*** Purpose: to pop integers off of the stack
 ‘***Method Inputs:‘*** no parameters
 * Return value:
 * Date* 9/11/17 */


    public void pop()

    {
        //if the head doesn't equal an empty list then this code will run
        if(head!=null)
        {
            //LinkList temp = head;
            head = head.getLinkList();
            //int value;
           // temp =  getValue();
            
        }
        else
        {
          JOptionPane.showMessageDialog(null, "The list is empty.");
        }
        
        //return getValue();



    }

}
    
