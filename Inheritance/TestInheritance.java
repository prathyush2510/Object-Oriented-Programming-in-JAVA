import java.util.*;
import java.lang.*;
class Person {
    private long aadhar;
    private String name,address;
    private char gender;
    
    public Person(long aadhar,String name,String address,char gender) {
        this.aadhar=aadhar;
        this.name=name;
        this.address=address;
        this.gender=gender;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    public long getAadhar() {
        return aadhar;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public char getGender() {
        return gender;
    }
}

class Student extends Person {
    private String program;
    private int year;
    private float totalmark;
    
    public Student( long aadhar, String name, String address, char gender, String program, int year, float total) {
        super(aadhar, name, address, gender);
        this.program = program;
        this.year = year;
        this.totalmark = total;
    }
    
    public String getProgram() {
        return program;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public float getTotal() {
        return totalmark;
    }
    
    public void setTotal(float tot) {
        this.totalmark = tot;
    }
    
    public float calGPA() {
        if(totalmark == 100)
            return 10.0f;
        else if(totalmark >= 90)
            return 9.0f;
        else if(totalmark >= 80)
            return 8.0f;
        else if(totalmark >= 70)
            return 7.0f;
        else if(totalmark >= 60)
            return 6.0f;
	else 
            return 5.0f;
    }
}

class Faculty extends Person {
    private String designation;
    private String department;
    private float basicpay;
    
    public Faculty(long aadhar, String name, String address, char gender, String designation, String dept, float pay ) {
        super(aadhar, name, address, gender);
        this.designation = designation;
        this.department = department;
        this.basicpay = pay;
    }
    
    public String getDesig() {
        return designation;
    }
    
    public void setDesig(String desig) {
        this.designation = desig;
    }
    
    public void setBasic(float basic) {
        this.basicpay = basic;
    }
    
    public float getBasic() {
        return basicpay;
    }
    
    public float calSalary() {
        float gross,ded;
        gross = basicpay + 0.6f*basicpay + 0.1f*basicpay;
        ded = 0.085f*basicpay + 0.08f*basicpay;
        return gross-ded;
    }
}

public class TestInheritance {
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        String name, address, program, designation, department;
        int year,ch,c;
	long aadhar;
        char gender;
        float totalmark, basicpay;
        Student S = null;
        Faculty F = null;
	do{
        System.out.println("\nEnter the choice\n1.Enter Student Details\n2.Enter Faculty details\n3.Exit");
        ch=in.nextInt();
        if(ch==1) {
            System.out.println("Testing Sub-Class :\tStudent ");
            System.out.print("Enter Student Name: ");
            name = in.next();
            System.out.print("Enter Student Address: ");
            address = in.next();
            System.out.print("Enter Student Gender ( M / F ): ");
            gender = in.next().charAt(0);
            System.out.print("Enter Student Aadhar: ");
            aadhar = in.nextLong();
            System.out.print("Enter Student Program: ");
            program = in.next();
            System.out.print("Enter Student Year: ");
            year = in.nextInt();
            System.out.print("Enter Total Mark: ");
            totalmark = in.nextInt();
            S = new Student(aadhar, name, address, gender, program, year, totalmark);
        }
        else if(ch==2){
            System.out.println("Testing Sub-CLass :\tFaculty ");
            System.out.print("Enter Faculty Name: ");
            name = in.next();
            System.out.print("Enter Faculty Address: ");
            address = in.next();
            System.out.print("Enter Faculty Gender ( M / F ): ");
            gender = in.next().charAt(0);
            System.out.print("Enter Faculty Aadhar: ");
            aadhar = in.nextLong();
            System.out.print("Enter Faculty Designation: ");
            designation = in.next();
            System.out.print("Enter Faculty Department: ");
            department = in.next();
            System.out.print("Enter Faculty Basic Pay: ");
            basicpay = in.nextFloat();
            F = new Faculty(aadhar, name, address, gender, designation, department, basicpay);
        }
	else if(ch==3){
	break;
	}
        System.out.println("\nEnter your Choice \n1.Print the Details\t(or)\t2.Continue Execution");
        c=in.nextInt();
        if(c==1) {
            if(ch==1) {
                System.out.println("Student Details ");
                System.out.println("**********************************");
                System.out.println(" Name :"+ S.getName());
                System.out.println(" Address :"+ S.getAddress());
                System.out.println(" Aadhar :"+ S.getAadhar());
                System.out.println(" Gender :"+ S.getGender());
                System.out.println(" Program :"+ S.getProgram());
                System.out.println(" Year :"+ S.getYear());
                System.out.println(" Total Mark :"+ S.getTotal());
                System.out.println(" GPA :"+ S.calGPA());
                System.out.println("**********************************");
            }
            else if(ch==2) {
                System.out.println("Faculty Details ");
                System.out.println("**********************************");
                System.out.println(" Name :"+ F.getName());
                System.out.println(" Address :"+ F.getAddress());
                System.out.println(" Aadhar :"+ S.getAadhar());
                System.out.println(" Gender :"+ F.getGender());
                System.out.println(" Designation :"+ F.getDesig());
                System.out.println(" Basic Pay :"+ F.getBasic());
                System.out.println(" Salary :"+ F.calSalary());
                System.out.println("**********************************");
            }
            else
                System.out.println("\n!!! There is no record !!!\n");
        }
        System.out.println("\nChoose\n1.Change the Details\t(or)\t2.Exit");
        c=in.nextInt();
        if(c==1) {
            if(ch==1) {
		System.out.println("\n**********Testing student class public methods**********\n ");
                do {
                    System.out.println("\nChoose\n1.Change the year\n2.Change Total\n3.Change the Address\n4.Exit");
                    c=in.nextInt();
                    if(c==1) {
                        System.out.println("Testing setYear() ");
                        System.out.println("Enter Student's new academic year : ");
                        year = in.nextInt();
                        S.setYear(year);
                        System.out.println("Student Year Changed to "+ S.getYear());
                    }
                    else if(c==2) {
                        System.out.println("Testing setTotal() ");
                        System.out.println("Enter new Student total: ");
                        totalmark = in.nextFloat();
                        S.setTotal(totalmark);
                        System.out.println("Student New Total "+ S.getTotal() + " and New GPA "+ S.calGPA());
                    }
                    else if(c==3) {
                        System.out.println("Testing setAddress() ");
                        System.out.println("Enter new Student Address ");
                        address = in.next();
                        S.setAddress(address);
                        System.out.println("Student new Address :"+ S.getAddress());
			}
                }while(c!=4);
            }
            else if(ch==2) {
		System.out.println("\n**********Testing Faculty class public methods**********\n ");
                do {
                    System.out.println("\nChoose\n1.Change Designation\n2.Change Basicpay\n3.Change the Address\n4.Exit");
                    c=in.nextInt();
                    if(c==1) {
                        System.out.println("Testing setDesig() ");
                        System.out.println("Enter New Designation :");
                        designation = in.next();
                        F.setDesig(designation);
                        System.out.println("Faculty New Designation :"+ F.getDesig());
                    }
                    else if(c==2) {
                        System.out.println("Testing setBasic()");
                        System.out.println("Enter new basic pay: ");
                        basicpay = in.nextInt();
                        F.setBasic(basicpay);
                        System.out.println("Faculty New Basic Pay :"+ F.getBasic() +"and Salary :"+ F.calSalary());
                    }
                    else if(c==3) {
                        System.out.println("Testing setAddress() ");
                        System.out.println("Enter new Faculty Address ");
                        address = in.next();
                        F.setAddress(address);
                        System.out.println("Faculty new Address :"+ F.getAddress());
                    }
		    
                }while(c!=4);
            }
            else
                System.out.println("\n**********There is no record**********\n");
        }
	}while(ch!=3);
        
    }
}
