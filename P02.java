import java.util.Scanner;
public class P02{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the size of the queue:");
	int n=sc.nextInt();
	new q();
	new q(n);
 }
}
class q{
	
	int front=-1,rear=-1,item;
    	int[]ar=new int[15];
   	 q(){
		System.out.println("\nOPERATIONS\n");
	}
	q(int n){
		int a;
		do {
		      Scanner sc1=new Scanner(System.in);
		      System.out.println("\n1.ENQUEUE\t2.DEQUEUE\t3.DISPLAY\n");
	          System.out.println("Enter Your Choice");
		      a=sc1.nextInt();
		       switch(a){
		         case 1:
			     enqueue(n);
			     break;
		         case 2:
			     dequeue(n);
			     break;
		         case 3:
			     display(rear);
			     break;
		         case 4:
		        	 System.exit(0);	 
		         default:
			     break;			
		       }
		}while(a<5); 	
	}
	void enqueue(int n){
		if(rear>=n-1){
			System.out.println("\nOVERFLOW!!!\n");
		}
		else{
			if(front==-1&&rear==-1){
				front++;
			}
			System.out.println("\nenter the element to be inserted:");
			Scanner sc2=new Scanner(System.in);
			item=sc2.nextInt();
			rear++;
			ar[rear]=item;
		}
	}
	void dequeue(int n){
		if(front==-1){
			System.out.println("\nUnderflow!!!");
		}
		else {
			int del=ar[front];
			System.out.printf("Deleted Element:%d",del);
			if(front==rear){
				 front=-1;
				 rear=-1;
			   }	
			  else{
				  front++;
			  }
		   }
	}
	void display(int rear){
		System.out.println("ELEMENTS:");
		for(int i=front;i<=rear;i++){	
			System.out.printf("%d\n",ar[i]);
		}
	}
}