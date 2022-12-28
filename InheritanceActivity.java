package thursdayLAb;

import java.util.Scanner;

class Employee
{   long employeeid,employeephone;
	String employeename,employeeaddress;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	double ta;
	Employee(Long id,String name,String address,Long phone,Long Salary)   //Constructor
	{
		this.employeeid=id;
		this.employeename=name;
		this.employeeaddress=address;
		this.employeephone=phone;
		this.basicSalary=Salary;
	}
	void calculateTravelAllowance(double basicSalary)
	{
		double bs=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Basic Salary is:"+bs);
	}
	
	
	
}
class Manager extends Employee
{

	Manager(Long id, String name, String address, Long phone, Long Salary) {
		super(id, name, address, phone, Salary);
		// TODO Auto-generated constructor stub
	}
	
	double calculateSalary()              //calculating travel allowance
	{
		basicSalary=(basicSalary*15/100);
		return basicSalary;
	}
	void display()                        //display method for manager
	{
		System.out.println("Name: "+employeename+"\nEmployee id:"+employeeid+"\nEmployee address "+employeeaddress);
	}
    

	
}
class Trainee extends Employee{

	Trainee(Long id, String name, String address, Long phone, Long Salary) {
		super(id, name, address, phone, Salary);
		// TODO Auto-generated constructor stub
	}
	
	double calculateSalary()              //calculating travel allowance
	{
		
		basicSalary=(basicSalary*10/100);
		return basicSalary;
	}
	void display()                         //display method
	{
		System.out.println("Name: "+employeename+"\nEmployee id:"+employeeid+"\nEmployee address "+employeeaddress);
	}
	
}
public class InheritanceActivity{

	static long employeeid,employeephone,basicSalary;
	static String employeename,employeeaddress;
	public void input()                                            //input method
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id: \nName: \nAddress: \nPhone no. \nSalary:");
		employeeid=sc.nextLong();
		sc.next();
		employeename=sc.nextLine();
		employeeaddress=sc.nextLine();
		employeephone=sc.nextLong();
		basicSalary=sc.nextLong();
	}
	static InheritanceActivity jk=new InheritanceActivity();
	public static void main(String[] args)                         //Main Function
	{
		jk.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1:manager or 2:trainee");
		int s=sc.nextInt();
		if(s==1)
		{
			Manager ip=new Manager(employeeid,employeename,employeeaddress,employeephone,basicSalary);    //value passing to constructor
			double j=ip.calculateSalary();   //calculating Basic salary
			ip.calculateTravelAllowance(basicSalary);  //calculating travel allowance
			ip.display();         //calling display function
			System.out.println("Travel allowance is:"+j);
		}
		else
		{
			Trainee ip=new Trainee(employeeid,employeename,employeeaddress,employeephone,basicSalary);     //value passing to constructor
			ip.calculateTravelAllowance(basicSalary);   //calculating Basic salary
			double j=ip.calculateSalary();    //calculating travel allowance
			ip.display();    //calling display function
			System.out.println("Travel allowance is:"+j);
		}	
		
		// TODO Auto-generated method stub

	}

}
