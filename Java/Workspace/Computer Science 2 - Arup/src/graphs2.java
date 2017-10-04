import java.util.ArrayList;
import java.util.Scanner;


public class graphs2 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Edge> edges = new ArrayList<Edge>();
		int choice = dialog();
		int nodecount = 0, edgecount = 0;
		switch(choice){
		case 1:
			// new node
			System.out.println("Pick a simple name for your node to identify it.");
			String name = getNewName();
			Node c1 = new Node(name); 
			nodes.add(c1);
			nodecount++;
			break;
		case 2:
			// new edge
			
			Node temp1 = null, temp2 = null;
			while(temp1 == null || temp2 == null){
			System.out.println("Which two nodes would you like to connect? (Hint: Type in two names)");
			String n1 = getNewName();
			String n2 = getNewName();
			for(int count = 0; count < nodes.size(); count++){
				if(nodes.get(count).iden == n1){
					temp1 = nodes.get(count);
				}
				else if(nodes.get(count).iden == n2){
					temp2 = nodes.get(count);
				}
				
			}
			if(temp1 == null || temp2 == null)
				System.out.println("Sorry, those names were not found. Please try again.");
				
			}
			int weight = getWeight();
			Edge edgetemp = new Edge(temp1, temp2, weight);
			temp1 = null; temp2 = null;
			
			edges.add(edgetemp);
			edgecount++;
			break;
		
		}
		/*Node c1 = new Node(); 
		Node c2 = new Node(); 
		Node c3 = new Node(); 
		Node c4 = new Node(); 
		Edge e1 = new Edge(c1, c2, 5);
		Edge e2 = new Edge(c2, c3, 10);
		Edge e3 = new Edge(c3, c4, 15);
		Edge e4 = new Edge(c4, c1, 20);
		*/
		
	}
	 public class Node{
		String iden;
		Node next, prev;
		public Node(String id){
			this.next = null;
			this.prev = null;
			this.iden = id;
		}
	}
	 public class Edge{
		Node c1, c2;
		int weight;
		public Edge(Node con1, Node con2, int w){
			this.c1 = con1;
			this.c2 = con2;
			this.weight = w;
		}
		
		
	}
	 public static int dialog(){
		 System.out.println("1 = New Node\n2= New Weighted Edge\n3 = Quit");
		 Scanner scanny = new Scanner(System.in);
		 int choice = scanny.nextInt();
		 scanny.close();
		 return choice;
	 }
	public static String getNewName(){
	
		 Scanner scanny = new Scanner(System.in);
		 String choice = scanny.next();
		 scanny.close();
		 return choice;
	}
	public static int getWeight(){
		 System.out.println("Please type in a number for the weight connecting this edge.");
		 Scanner scanny = new Scanner(System.in);
		 int choice = scanny.nextInt();
		 scanny.close();
		 return choice;
	}
	public static void printNodes(ArrayList<Node> list){
		if(!list.isEmpty()){
			
		}
		
	}
}
