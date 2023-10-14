import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp 
{
	private ArrayList<Object> todoList;
	public TodoListApp() 
	{
		todoList = new ArrayList<>();
    	}
	// Function to add an element to the ArrayList
    	public void addTask(Object task) 
	{
        	todoList.add(task);
		System.out.println("The element you asked to add " + task + " is added to the list.");
   	 }
    	// Function to remove an element at a specific index
    	public void removeElementAtIndex(int taskindex) 
	{
        	if (taskindex >= 0 && taskindex <= (todoList.size()-1)) 
		{
           		todoList.remove(taskindex);
			System.out.println("The element you asked to delete at index " + "["+taskindex+"]" + " is removed from the list.");
        	} 
		else 
		{
            			System.out.println("Invalid index");
        	}
    	}

    	// Function to display the elements in the ArrayList
    	public void displayList() 
	{
		System.out.println("\n 			\n");
       		System.out.println(" 			Elements in the ArrayList are as below:");
		//lets introduce the new forloop concept "for-each loop"
        	for (Object element : todoList) 
		{
            		System.out.println(" 			"+element);
        	}
    	}

    	public static void main(String[] args) 
	{
		TodoListApp DataStorer = new TodoListApp();
        	Scanner reader = new Scanner(System.in);
		while (true) 
		{
			System.out.println("\n\n");
            		System.out.println("\nMenu:");
            		System.out.println("1. Add Integer to the list");
			System.out.println("2. Add String to the list");
     		        System.out.println("3. Remove Element at Index");
    		        System.out.println("4. Display Elements");
   		        System.out.println("5. Quit");
   		        System.out.print("Enter your choice: ");

            		int choice = reader.nextInt();
            		reader.nextLine();  // Consume the newline character

           		switch (choice) 
			{
               			case 1:
                   			System.out.print("Enter integer element to add: ");
                    			int adder = reader.nextInt();
					reader.nextLine();  // Consume the newline character
                    			DataStorer.addTask(adder);
                    			break;
				case 2:
					System.out.print("Enter String element to add: ");
                    			String addString = reader.nextLine();
                    			DataStorer.addTask(addString);
                    			break;
					
	               		case 3:
        	           		System.out.print("Enter index to remove element: ");
                	    		int removeIndex = reader.nextInt();
                    			reader.nextLine();  // Consume the newline character
                    			DataStorer.removeElementAtIndex(removeIndex);
                    			break;
          	     		case 4:
                	   		DataStorer.displayList();
                    			break;
                		case 5:
	                    		reader.close();
        	            		System.exit(0);
				default:
	                    		System.out.println("Invalid choice. Please try again.");
        	    	}
        	}
   	 }	
}
	