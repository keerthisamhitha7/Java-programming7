import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEmployee 
{
	public static void main(String[] aa)
{
	ArrayList <Employee> EmployeeDetails = new ArrayList <Employee>();
	
	Employee e1=new Employee(101,"Tim", 25, 30000);
	Employee e2=new Employee(102,"John",26,43000);
	Employee e3=new Employee(103,"Johnny",25,50000);
	Employee e4=new Employee(104,"Jack",27,52000);
	Employee e5=new Employee(105,"Jack M",24,22000);
	
	EmployeeDetails.add(e1);
	EmployeeDetails.add(e2);
	EmployeeDetails.add(e3);
	EmployeeDetails.add(e4);
	EmployeeDetails.add(e5);
	
	for (Employee e:EmployeeDetails)
	{
	System.out.println("--------------------------------");
	System.out.println("Id Is "+e.empid);
	System.out.println("Employee Name Is "+e.empname);
	System.out.println("Employee Age Is "+e.empage);
	System.out.println("Employee Salary Is "+e.empsalary);
	System.out.println("---------------------------------");
	}
	int temp = 0;
    String temp1 = null;
	
	for(Employee e:EmployeeDetails)
	{
		if(e.empsalary>temp)
		{
			temp = e.empsalary;
			temp1 = e.empname;
		}
	}
		System.out.println("The name of the highest salary employee is : "+temp1);
		Collections.sort(EmployeeDetails);
		for(Employee e:EmployeeDetails)
		{
			System.out.println("--------------------------------");
			System.out.println("Id Is "+e.empid);
			System.out.println("Employee Name Is "+e.empname);
			System.out.println("Employee Age Is "+e.empage);
			System.out.println("Employee Salary Is "+e.empsalary);
			System.out.println("---------------------------------");
		}
}
}	
	class Employee implements Comparable <Employee>
	{
		int empid,empage,empsalary;
		String empname;
		public Employee(int id, String Name , int age, int salary)
		{
			this.empid=id;
			this.empname=Name;
			this.empage=age;
			this.empsalary=salary;
		}
		public int compareTo(Employee e)
		{
			if(empsalary>e.empsalary)
			{
				return 1;
			}
			else if (empsalary<e.empsalary)
			{
				return -1;
			}
			else 
			{
				return 0;
			}
		}
		

}

	


