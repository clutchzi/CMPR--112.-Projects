//3.15

import java.util.Scanner;

public class EmployeeTest{
	
	private static Scanner input;

	public static void main(String[] args){

		input = new Scanner( System.in);
		
			Employee employee1= new Employee();
			Employee employee2= new Employee();

			String first;
			String last;
			Double salary;

			//FIRST EMPLOYEE
			System.out.println("Enter the name of the 1st employee: ");
			first = input.next();
			employee1.setfirstName( first);

			System.out.println("Enter the last of the 1st employee: ");
			last = input.next();
			employee1.setlastName( last);

			System.out.println("What is the monthly salary of the 1st employee? ");
			salary = input.nextDouble();
			employee1.setmonthlySalary( salary);

			//SECOND EMPLOYEE
			System.out.println("Enter the name of the 2nd employee: ");
			first = input.next();
			employee2.setfirstName( first);

			System.out.println("Enter the last of the 2nd employee: ");
			last = input.next();
			employee2.setlastName( last);

			System.out.println("What is the monthly salary of the 2nd employee? ");
			salary = input.nextDouble();
			employee2.setmonthlySalary( salary);

			System.out.println("The yearly salary of "+  employee1.getfirstName()+  " "+ 
					   employee1.getlastName()+  " is " +  employee1.getmonthlySalary() *12 );

			System.out.println("The yearly salary of "+  employee2.getfirstName()+  " "+ 
					   employee2.getlastName()+  " is "+  employee2.getmonthlySalary() *12 );

			double employee1YearlySalary = employee1.getmonthlySalary() *12 ;
			double employee2YearlySalary = employee2.getmonthlySalary() *12 ;

			double employee1Raise = employee1YearlySalary * 0.1 ;
			double employee2Raise = employee2YearlySalary * 0.2 ;

			double employee1NewSalary = employee1YearlySalary + employee1Raise; 
			double employee2NewSalary = employee2YearlySalary + employee2Raise; 		

			System.out.println("The yearly salary of "+  employee1.getfirstName()+  " "+ 
					   employee1.getlastName()+  " with a 10 percent raise, is: "+  employee1NewSalary  );
			
			
			System.out.println("The yearly salary of "+  employee2.getfirstName()+  " "+ 
					   employee2.getlastName()+  " with a 10 percent raise, is: "+  employee2NewSalary  );	
	}
} //Good
