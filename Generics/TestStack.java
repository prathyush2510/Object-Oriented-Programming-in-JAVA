class Stack<T>{
	int top;
	T a[];
	int capacity;
	Stack(int n,T arr[]){
		top = -1;
		capacity = n;	
		a = arr;
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == capacity - 1;
	}
	
	void push(T x){
		if(isFull())
			System.out.println("Stack full!");
		else
			a[++top]=x;

	}
	T pop(){
		if(isEmpty()){
			System.out.println("\nStack Empty!");

		}
	
		return a[top--];

	}
        public void clear(){
          top=-1;
        }
	void display(){
		int i;
		if(isEmpty()){
			System.out.println("\nStack Empty!");
			return;
		}	
		System.out.println("\nThe Elements present in the stack are:");
		for(i=top;i>=0;i--)
			System.out.println(a[i] + " ");
	}		
}


class TestStack{
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
	
		
		int stop = 0;
		int opt;
		int ch=0;
                      
		while(stop!=-1){
                        System.out.println("1 - String Stack");
			System.out.println("2 - Double Stack");
			System.out.println("3 - Integer Stack");
			System.out.println("4 - Exit");
			System.out.print("Enter the option to be performed: ");
			opt = input.nextInt();
			
			
			switch(opt){
				case 3: {
							int temp;
							Integer arr[] = new Integer[5];
							Stack<Integer> intStack = new Stack<Integer>(5,arr);
					
							        System.out.println("1 - Push the element to the stack");
								System.out.println("2 - Pop the elemnt from the stack");
								System.out.println("3 - Display the stack");
                                                                System.out.println("4 - The stack is Empty");
                                                                System.out.println("5 - The stack is Full");
                                                                System.out.println("6 - clear");
								System.out.println("7 - Back");
								System.out.println("Enter the choice to be performed: ");
								ch = input.nextInt();

                                                         while(ch != 7){
								
								switch(ch){
									case 1: {
											 System.out.print("Enter the value to push: ");
											 temp = input.nextInt();
											 intStack.push(temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 2: {
											 temp = intStack.pop();
											 System.out.println("Popped Value: " + temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 3: {
												intStack.display();
												System.out.println("----------------------------");
											}
											break;
 								        case 4:{
                                                                                        if(intStack.isEmpty()){
                                                                                            System.out.println("Stack is Empty");
											    System.out.println("********************************");}
                                                                                        else{
                                                                                            System.out.println("Stack is not Empty");
 											    System.out.println("********************************");}
                                                                                       }
                                                                                       	break;
                                                                        case 5:{
                                                                                        if(intStack.isFull()){
                                                                                            System.out.println("Stack is Full");
                                                                                            System.out.println("********************************");}
                                                                                        else{
                                                                                            System.out.println("Stack is not Full");
                                                                                            System.out.println("********************************");}
                                                                                       }
                                                                                       	break;
                                                                        case 6:{
                                                                                  intStack.clear();
                                                                                  System.out.println("The Stack is Cleared");
                                                                                  System.out.println("********************************");
                                                                                }
                                                                                break;
																																															
											
								}
 								System.out.println("1 - Push the element to the stack");
								System.out.println("2 - Pop the elemnt from the stack");
								System.out.println("3 - Display the stack");
                                                                System.out.println("4 - The stack is Empty");
                                                                System.out.println("5 - The stack is Full");
                                                                System.out.println("6 - Clear the stack");
								System.out.println("7 - Back");
								System.out.println("Enter the choice to be performed: ");
								ch = input.nextInt();
							}
						}
						break;
				case 2: {
							double temp;
							Double arr[] = new Double[5];
							Stack<Double> dStack = new Stack<Double>(5,arr);
                                                                System.out.println("1 - Push the element to the stack");
								System.out.println("2 - Pop the elemnt from the stack");
								System.out.println("3 - Display the stack");
                                                                System.out.println("4 - The stack is Empty");
                                                                System.out.println("5 - The stack is Full");
                                                                System.out.println("6 - Clear the stack");
								System.out.println("7 - Back");
								System.out.println("Enter the choice to be performed: ");
								ch = input.nextInt();
					
							while(ch != 7){
								
						
								switch(ch){
									case 1: {
											 System.out.print("Enter the value to push: ");
											 temp = input.nextDouble();
											 dStack.push(temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 2: {
											 temp = dStack.pop();
											 System.out.println("Popped Value: " + temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 3: {
												dStack.display();
												System.out.println("----------------------------");
											}
											break;
									case 4:{
                                                                                        if(dStack.isEmpty()){
                                                                                            System.out.println("Stack is Empty");
 											    System.out.println("********************************");}
                                                                                        else{
                                                                                            System.out.println("Stack is not Empty");
                                                                                            System.out.println("********************************");}
                                                                                       }
                                                                                       	break;
                                                                        case 5:{
                                                                                        if(dStack.isFull()){
                                                                                            System.out.println("Stack is Full");
											    System.out.println("********************************");}
                                                                                        else{
                                                                                            System.out.println("Stack is not Full");
                                                                                            System.out.println("********************************");}
                                                                                       }
                                                                                       	break;
                                                                        case 6:{
                                                                                  dStack.clear();
                                                                                  System.out.println("The Stack is Cleared");
                                                                                  System.out.println("********************************");
                                                                                }
                                                                                break;
												
								}
                                                                System.out.println("1 - Push the element to the stack");
								System.out.println("2 - Pop the elemnt from the stack");
								System.out.println("3 - Display the stack");
                                                                System.out.println("4 - The stack is Empty");
                                                                System.out.println("5 - The stack is Full");
                                                                System.out.println("6 - clear the stack");
								System.out.println("7 - Back");
								System.out.println("Enter the choice to be performed: ");
								ch = input.nextInt();
							}
						}
						break;
				case 1: {
							String temp;
							String arr[] = new String[5];
							Stack<String> sStack = new Stack<String>(5,arr);
                                                                 System.out.println("1 - Push the element to the stack");
								System.out.println("2 - Pop the elemnt from the stack");
								System.out.println("3 - Display the stack");
                                                                System.out.println("4 - The stack is Empty");
                                                                System.out.println("5 - The stack is Full");
                                                                System.out.println("6 - clear the stack");
								System.out.println("7 - Back");
								System.out.println("Enter the choice to be performed: ");
								ch = input.nextInt();				 

							while(ch != 7){
						
								switch(ch){
									case 1: {
											 System.out.print("Enter the value to push: ");
											 temp = input.next();
											 sStack.push(temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 2: {
											 temp = sStack.pop();
											 System.out.println("Popped String: " + temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 3: {
												sStack.display();
												System.out.println("----------------------------");
											}
											break;
                                                                        case 4:{
                                                                                        if(sStack.isEmpty()){
                                                                                            System.out.println("Stack is Empty");
                                                                                            System.out.println("********************************");}
								
                                                                                        else{
                                                                                            System.out.println("Stack is not Empty"); 
                                                                                            System.out.println("********************************");}

                                                                                       }
                                                                                       	break;
                                                                        case 5:{
                                                                                        if(sStack.isFull()){
                                                                                            System.out.println("Stack is Full");
                                                                                            System.out.println("********************************");}
                                                                                        else{
                                                                                            System.out.println("Stack is not Full");
                                                                                            System.out.println("********************************");}
				
                                                                                       }
                                                                                       	break;
                                                                       case 6:{
                                                                                  sStack.clear();
                                                                                  System.out.println("The Stack is Cleared");
                                                                                  System.out.println("********************************");
                                                                                }
                                                                                break;
												
											
								}
                                                               System.out.println("1 - Push the element to the stack");
								System.out.println("2 - Pop the elemnt from the stack");
								System.out.println("3 - Display the stack");
                                                                System.out.println("4 - The stack is Empty");
                                                                System.out.println("5 - The stack is Full");
                                                                System.out.println("6 - clear the stack");
								System.out.println("7 - Back");
								System.out.println("Enter the choice to be performed: ");
								ch = input.nextInt();

							}
						}
						break;
					case 4: {
							System.out.println("Thankyou!!!!");
							stop=-1;
						}
						break;
                      }
		}
	}
}
