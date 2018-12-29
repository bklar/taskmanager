import java.io.*;
import java.util.*;
import java.text.*;

/*author: Branden Klar
 * The idea for this came from a chapter on scheduling in "Algorithms to Live By: The Computer Science of Human Decisions" by Brian
 * Christian and Tom Griffiths. The idea of pipelining in computer science parallels scheduling in life, so this application will 
 * keep track of various tasks with lengths to complete, priority (a number representing importance of completion, assigned by the 
 * user), and a due date. The end product will ask the user which particular algorithm to use (each prioritizing different ends),
 * implement the algorithm, and output the sequence of tasks to achieve the desired end.
*/

public class TaskManager {
	
	public TaskManager(){tasks= new ArrayList<Task>();};
	public ArrayList<Task> tasks;
	
	public void readFromFile(String filename) throws Exception{
		System.out.println("Opening file...");
		File file = new File(filename); 
		BufferedReader br= new BufferedReader(new FileReader(file));
		System.out.println("File opened successfully..");
		br.readLine();
        for (String x = br.readLine(); x != null; x = br.readLine()){
            String[] tokens= x.split(",");
            Task curTask = new Task();
            curTask.name = tokens[0];
            curTask.priority = Integer.parseInt(tokens[1]);
            curTask.duration = Integer.parseInt(tokens[2]);
            Date date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(tokens[3]);
            tasks.add(curTask);
        }
        br.close();
        return;
	}
	
	public void showTasks() {
		Scanner showTasksReader = new Scanner(System.in);
		for (int i=0; i<tasks.size(); i++) {
			System.out.printf("%s with priority %d and length %d \n", tasks.get(i).name, tasks.get(i).priority, tasks.get(i).
					duration);
		}
		System.out.println("Press 1 to continue");
		int c = 0;
		while (c!=1) {
			c=showTasksReader.nextInt();
		}
		showTasksReader.close();
		return;
	}
	
	public ArrayList<Task> addTasks(ArrayList<Task> initial) {
		System.out.println("Please input task name: ");
		System.out.println("Please input task priority: ");
		System.out.println("Please input task length: ");
		System.out.println("Please input task due date: ");
		//create new Task
		//initial.push_back(newTask);
		return initial;
	}
	
	public void stop() {
		Scanner input = new Scanner(System.in);
		System.out.println("Stop sequence activated");
		System.out.println("Press 1 to continue");
		int choice = 0;
		while (choice!=1) {
			choice=input.nextInt();
		}
		input.close();
		return;
	}
	
	public void writeToFile() {
		
	}
	
	
}
