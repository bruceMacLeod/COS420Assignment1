package edu.usm.cos420.example1;

import edu.usm.cos420.example1.controller.CItemController;
import edu.usm.cos420.example1.service.CItemService;
import edu.usm.cos420.example1.view.impl.CItemView;

/**
 * Top level application class that coordinates the calls to view and Controller
 *   
 *   This serves as a starting point for your Assignment 1.
 *       I have demonstrated the flow of control for creating and list items from a 
 *       class called CItem (which is only an example class)
 *       You should examine all of the code and follow the flow of control before 
 *       making classes for Customers, Inventory items, ...
 *       
 *   Work iteratively ! Do not try to solve the assignment in one go ! So, for example, 
 *       you may want to start by defining the Customer class, then try to store and 
 *       retrieve customers (you will need to make a Data Access class for Customers). 
 *       After finishing with Customer1s, you might choose to work on inventory items.
 *       As you will learn in this course, it is often helpful to work on one use case 
 *       at a time. Step by step wins the day !
 */
public class App
{
    /**
     * Entry point for application : calls {@link #provideCItemAccess()}
     * @param args  main program arguments, currently not used
     */
	public static void main( String[] args )
    {
		CItemService service = new CItemService();
		CItemView citemView = new CItemView();
		CItemController controller = new CItemController(citemView,service);		
		controller.provideCItemAccess();
    }
}
