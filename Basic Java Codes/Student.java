//package student;
import java.util.Scanner;

public class Student {
    int regno;
    String name,dept,grade;
    float marks[]=new float[3],total;
    Student()
    {
        regno=0;
        name=dept=grade="";
        for(int i=0;i<3;++i)
            marks[i]=0;
        total=0;
    }
    
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Register NO.: ");
        regno=in.nextInt();
        name=in.nextLine();
        System.out.print("Enter Student Name: ");
        name=in.nextLine();
        System.out.print("Enter Department: ");
        dept=in.nextLine();
        System.out.print("Enter Marks in 3 subjects: ");
        for(int i=0;i<3;++i)
        {
            marks[i]=in.nextFloat();
        }
    }
    void calc()
    {
        for(int i=0;i<3;++i)
            total+=marks[i];
        if(total/3>90)
            grade="O";
        else if(total/3>80)
            grade="A+";
        else if(total/3>70)
            grade="A";
        else if(total/3>60)
            grade="B+";
        else if(total/3>50)
            grade="B";
        else
            grade="C";
    }
	void display1()
	{
	 System.out.println(regno+"\t"+name+"\t"+total+"\t"+grade);
	}

    void display()
    {
        System.out.println("***************");
        System.out.println("Regiser No\t\t: "+regno);
        System.out.println("Name\t\t\t: "+name);
        System.out.println("Department\t\t: "+dept);
        System.out.print("Marks in 3 subjects\t: ");
        for(int i=0;i<3;++i)
            System.out.print(marks[i]+"\t");
        System.out.println("\nTotal\t\t\t: "+total);
        System.out.println("Grade\t\t\t: "+grade);
    }
    void search(Student obj[],int n,int rno,int op)
    {
        int flag=0;        
        for(int i=0;i<n;++i)
        {
            if(obj[i].regno==rno)
            {
                if(op==3)
		{obj[i].calc();
                 obj[i].display();}
		else 
		 System.out.println("Record Found");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Record Not Found!!!");
    }
    void search(Student obj[],int n, String department)
    {
        int flag=0;
        for(int i=0;i<n;++i)
        { 
            if(obj[i].dept.equals(department))
            {
                System.out.println(obj[i].regno+"\t"+obj[i].name+"\t"+obj[i].dept);
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Record Not Found!!!");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student obj[]=new Student[10];
        Student temp=new Student();
        int n,op,i;
        char ch='y';
        System.out.println("Enter No. of Students: ");
        n=in.nextInt();
        
        do
        {
            System.out.println("********************");
            System.out.println("Menu");
            System.out.println("1.Enter student details");
            System.out.println("2.Calculate Grade and Display for all");
            System.out.println("3.Generate marksheet for a particular student");
            System.out.println("4.Search for a record using register no.");
            System.out.println("5.Search for a record using department");
            System.out.println("6.Exit");
            System.out.println("Enter your choice(1-6): ");
            op=in.nextInt();
            if(op==1)
                    {for(i=0;i<10;++i)
                      obj[i]=new Student();
                    //System.out.println("Enter No. of Students: ");
                    //n=in.nextInt();
                    for(i=0;i<n;++i)
                    {
                        obj[i].input();
                        System.out.println("*******************");
                    }
                    }
            else if(op==2)
            {
                for(i=0;i<n;++i)
                    obj[i].calc();
		System.out.println("regno\tname\ttotal\tgrade");
                for(i=0;i<n;++i)
                    obj[i].display1();
            }
            else if(op==3)
            {
                int rno;
                System.out.print("Enter Register no.: ");
                rno=in.nextInt();
                temp.search(obj, n, rno,op);
            }
            else if(op==4)
            {
                int rno;
                System.out.print("Enter Register no.: ");
                rno=in.nextInt();
                temp.search(obj, n, rno,op);
            }
            else if(op==5)
            {
                String dept;
                dept=in.nextLine();
                System.out.print("Enter department:  ");
                dept=in.nextLine();
                temp.search(obj,n,dept);
            }
            else if(op==6)
            {
                break;
            }
            //System.out.println("Do you want to continue?(y/n): ");
            //ch=in.next().charAt(0);
        }while(op!=6);

    }
    
}
