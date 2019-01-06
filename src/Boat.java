/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micah
 */
public class Boat 
{
    private String name;
    private boolean position;
    private float speed;
    
    /**
     * This constructor initializes a Boat 
     * object name instance variable.
     * @param newName is the boat name
     */
    public Boat (String newName)
    {
        name = newName;
        
    }
    /**
     * Increases the speed of the boat by 10 mph
     * & prints the name of the boat and the 
     * increased speed.
     */
    public void goFast(){
        position = true;
        while (speed < 110)
        {
            if (speed == 100)
            {
                System.out.println("Max speed is 100 mph!");
                break;
            }
           speed = speed +10;
           System.out.println(name+" is raising the sail at the speed of 10 mph.");
           break;
        }                       
    }
    /**
     * Reduces the speed by 5 mph and prints 
     * the name of the speed amount of reduced speed. 
     */
    public void goSlow(){
        position = false; 
        while (speed  < 110)
        {
            if (speed == 0)
            {
                System.out.println("Cannot go below 0 mph!");
                break;
            }
           speed = speed -5;
           System.out.println(name+" is lowering the sail at the speed of 5 mph.");
           break;
        } 
                
    }
    
    /**
     * prints the position of the sail.
     */
    public void whereIsTheSail()
    {
        if (position==true)
        {
            System.out.println(name+" sail is up.");
        }
        else
        {
            System.out.println(name+" sail is down.");
        }    
        
    }
}
