import java.util.*;

public class Project{

	public static void main(String[] args) throws Exception{
		TaskManager tm = new TaskManager();
		int choice=0;
		Scanner reader = new Scanner(System.in);
		String filename = "/Users/brandenklar/eclipse-workspace/TaskManager/src/taskmanagerdata.txt";
		
		//initialize the database
		tm.readFromFile(filename);
		showMenu();
		do {
				choice = reader.nextInt();
			switch(choice) {
			case 1:
				tm.showTasks();
//				tm.stop();
				break;
			case 2:
				System.out.println("Add task(s) needs implementation");
//				tm.stop();
				break;
			case 3:
				System.out.println("Remove task(s) needs implementation");
//				tm.stop();
				break;
			case 4:
				System.out.println("Recommend task order needs implementation");
//				tm.stop();
				break;
			case 5:
				System.out.println("Save needs implementation");
//				tm.stop();
				break;
			case 9:
				System.out.println("Exiting");
//				tm.stop();
				break;
			default:
				System.out.println("Not a valid input");
			}
		}
		while (choice!=9);
		return;
	}
	
	static void showMenu() {
		System.out.println("This is a simple task manager that can help you decide where to focus your attention:");
		System.out.println("Make a selection to continue");
		System.out.println();
		System.out.println("1: See current task list");
		System.out.println("2: Add task(s)");
		System.out.println("3: Remove task(s)");
		System.out.println("4: Recommend task order");
		System.out.println("5: Save progress");
		System.out.println("9: Quit");
		return;
	}

}
