// 3.14

public class Employee {
		
	private String firstName;
	private String lastName;
	private Double monthlySalary;

	public Employee() {
		
		// im just going to put the default values in for the variables,
		// Since i wont be calling them out unitl the test app

		firstName = null;
		lastName= null;
		monthlySalary= 0.0;
		}	
	
	public String getfirstName(){
		return firstName;
		}

	public String getlastName(){
		return lastName;
		}
	
	public Double getmonthlySalary(){
		return monthlySalary;
		}
	//this needs void because im using set and no value needs to get returned 

	public void setfirstName(String first){
		firstName= first;
		}

	public void setlastName(String last){
		lastName= last; 
		}
	public void setmonthlySalary(Double salary){
		monthlySalary = salary;
		}

}