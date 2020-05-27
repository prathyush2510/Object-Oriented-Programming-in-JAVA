import java.util.*;
import Mini.*;
import java.io.*; 

class AccountNotFoundException extends Exception
	{
	public String toString()
		{
		return "Account Not Found! !";
		}
	}
class PasswordMismatchException extends Exception
{
	public String toString()
	{
		return "password do not match !";
	}
}

class User extends Person {
String email,address;
String phn;
public User( String name ,String pass,String secq, String secans,int id,String email,String address, String phn) {
super(name,pass,secq,secans,id);
this.email=email;
this.address=address;
this.phn=phn;
}
public String toString(){
 return "\nName        :"+name +"\nID          :"+id +"\nE-Mail      :"+email +"\nAddress     :" +address +"\nPhone       :"+phn;
}
public String display(){
 return "\nName              : " +name +"\nPassword          : " +super.getPass() +"\nSecurity question : " +secq +"\nSecurity Answer   : " +super.getSA() +"\nID                : " +id +"\nE-Mail            : " +email +"\nAddress           : " +address +"\nPhone             : " +phn;
}
public String write(){
	return  name +"\n" +super.getPass() +"\n" +secq +"\n" +super.getSA() +"\n" +id +"\n" +email +"\n" +address +"\n" +phn +"\n\n";
}

void check(int i) throws AccountNotFoundException 
{
	if (i!=1) 
	{
		throw new AccountNotFoundException();
	}
}
void checkpassword ( int j) throws PasswordMismatchException 
{
	if (j!=1) 
	{
		throw new PasswordMismatchException();
	}
}	
}
public class NewMini1{


public static void main(String args[]) throws Exception
{	
	int cho;
	Scanner scan= new Scanner(System.in);
	do{
	System.out.println("****************************************");
 	System.out.println();
	System.out.println("\nEnter the choice:\n---1---Signup\n---2---Login\n---3---Exit");
	System.out.println();	
	System.out.println("****************************************");
 	cho=scan.nextInt(); 
	String fileName ="user.txt"; 
	//User u[]=new User[30];
	ArrayList<User> al=new ArrayList<User>();
        File file = new File (fileName);
	if(cho==1){
		System.out.println("Enter username");
        	String user=scan.next();
		System.out.println("-----");
		String pass,pass1;
		do{
		System.out.println("Enter your new password");
                pass=scan.next();
		System.out.println("-----");
		System.out.println("Re-Enter your new password");
                pass1=scan.next();
		System.out.println("-----");
		if(!pass1.equals(pass)){
			System.out.println("Passwords doesnot match.Try again");		
		}
		}while(!pass1.equals(pass));
		System.out.println("Enter the Security question in case you forgot your password");
		String sq=scan.nextLine();
		sq=scan.nextLine();
		System.out.println("-----");
		System.out.println("Enter Answer for the Security question");
		String sa=scan.nextLine();
		System.out.println("-----");
		System.out.println("Enter ID Number");
		int idno=scan.nextInt();
		System.out.println("-----");
		System.out.println("Enter Your E-Mail");
		String email=scan.nextLine();
		email=scan.nextLine();
		System.out.println("-----");
		System.out.println("Enter Your Address");
		String addr=scan.nextLine();
		System.out.println("-----");
		System.out.println("Enter Your Phone Number");
		String phone=scan.nextLine();
		System.out.println("-----");
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true) ); 
                writer.write(user+"\n"+pass+"\n"+sq+"\n"+sa+"\n"+idno+"\n"+email+"\n"+addr+ "\n"+phone+"\n\n");
                writer.close();
	}
	if(cho==2){
	int count=0;
	String temp;
	Scanner myReader = new Scanner (file);
	while(myReader.hasNextLine()){    
		al.add(new User(myReader.nextLine(), myReader.nextLine(), myReader.nextLine(), myReader.nextLine(), Integer.parseInt(myReader.nextLine()), myReader.nextLine(), myReader.nextLine(), myReader.nextLine()));
String stemp=myReader.nextLine();
	}
        myReader.close();
	int abort=2;
	String sans;
            int flag=0,flag1=0;
	    int index=0,index1=0,sel;
            do{
                flag=0;
		flag1=0;
                System.out.println("Enter sign in details...");
		System.out.println("-----");
                System.out.println("Enter User name");
                String user1=scan.next();
		System.out.println("-----");
		for(int i=0;i<count;i++){
		if((user1.equals(al.get(i).name)==true)){
		index1=i;
		flag1=1;
                System.out.println("Enter Your Password");
                String pass1=scan.next();
		System.out.println("-----");
                    if((pass1.equals(al.get(i).getPass())==true)){
			index=i;
                        flag=1;
                    }
                }
		}
try {
 al.get(index1).check(flag1);
 al.get(index).checkpassword(flag);}
 catch (Exception e) {
System.out.println("Exception "+e);
}
		if(flag1==0){
			continue;
		}
                if(flag==1){
                    System.out.println("Login successfull..");
		    System.out.println("-----");
                }
                else{
		    System.out.println("****************************************");
		    System.out.println("Password Incorrect");
                    System.out.println("Enter 0 to abort...\nEnter 1 if you forgot password \nEnter 2 to try again ");
		    System.out.println("****************************************");
                    abort=scan.nextInt();
                    if(abort==0){
                        break;
		    }
		    else if(abort ==1)
		    {
			System.out.println("Answer security question : " +al.get(index1).secq);
			sans=scan.nextLine();
			sans=scan.nextLine();
                        System.out.println("-----");
			if(sans.equals(al.get(index1).getSA())==true){
				String passtemp2,passtemp3;
					do{
						System.out.println("Enter your new password");
                				passtemp2=scan.nextLine();
                                                System.out.println("-----");
						System.out.println("Re-Enter your new password");
               					passtemp3=scan.nextLine();
						System.out.println("-----");
						if(!passtemp3.equals(passtemp2)){
						System.out.println("Passwords doesnot match.Try again");		
						}
					}while(!passtemp3.equals(passtemp2));
					al.get(index1).setPass(passtemp2);
					BufferedWriter writer1 = new BufferedWriter(new FileWriter(fileName, false)  );
			for(int i=0;i<count;i++)
			{
				writer1.write(al.get(i).write());
			}
                        writer1.close();	
		    }
			else{System.out.println("Answer is incorrect");
			abort=0;			
			break;}
                    }
		}
            }while(flag==0);
	    if (abort==0){
	    continue;
	    }
	    int sel1;
	    do{
		System.out.println("****************************************");
 		System.out.println();
		System.out.println("Enter Choice \n---1--- Display non-sensitive details \n---2--- Display all details \n---3---Edit Details \n---4---Exit");
		System.out.println();
		System.out.println("****************************************");
		sel=scan.nextInt();
		Person p=al.get(index);
		if(sel==1)
			System.out.println(p);
		else if(sel==2)
			System.out.println(p.display());
		else if(sel==3){
			do{
			System.out.println("Enter the detail to be edited \n---1---Name \n---2---Password \n---3---Security question \n---4---Security answer \n---5---ID \n---6---Email \n---7---Address \n---8---Phone number \n---9---Exit");
			sel1=scan.nextInt();
			switch(sel1)
			{
				case 1: String nametemp;
					System.out.println("\nEnter the new name");
					nametemp=scan.nextLine();
					nametemp=scan.nextLine();
					al.get(index).name=nametemp;
					break;
				case 2: String passtemp,passtemp1;
					System.out.println("\nEnter the new password");
					do{
						System.out.println("Enter your new password");
                				passtemp=scan.nextLine();
						passtemp=scan.nextLine();
						System.out.println("Re-Enter your new password");
               					passtemp1=scan.nextLine();
						if(!passtemp1.equals(passtemp)){
						System.out.println("Passwords doesnot match.Try again");		
						}
					}while(!passtemp1.equals(passtemp));
					al.get(index).setPass(passtemp);
					break;
				case 3: String seq;
					System.out.println("\nEnter the new Security question");
					seq=scan.nextLine();
					seq=scan.nextLine();
					al.get(index).secq=seq;
					break;
				case 4: String seca;
					System.out.println("\nEnter the new Security answer");
					seca=scan.nextLine();
					seca=scan.nextLine();
					al.get(index).setSA(seca);
					break;
				case 5:	int idt;
					System.out.println("\nEnter the new ID");
					idt=scan.nextInt();
					//nametemp=scan.nextLine();
					al.get(index).id=idt;
					break;
				case 6: String gmail;
					System.out.println("\nEnter the new email");
					gmail=scan.nextLine();
					gmail=scan.nextLine();
					al.get(index).email=gmail;
					break;
				case 7: String adr;
					System.out.println("\nEnter the new address");
					adr=scan.nextLine();
					adr=scan.nextLine();
					al.get(index).address=adr;
					break;
				case 8: String pho;
					System.out.println("\nEnter the new name");
					pho=scan.nextLine();
					pho=scan.nextLine();
					al.get(index).phn=pho;
					break;
				case 9: System.out.println("Exit edit");
					break;
				default: System.out.println("Invalid choice. Try again");


			}
			}while(sel1!=9);
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false)  );
			for(int i=0;i<count;i++)
			{
				writer.write(al.get(i).write());
			}
                        writer.close();
		}


	    }while(sel<4);
	}
	}while(cho!=3);	

}
}
