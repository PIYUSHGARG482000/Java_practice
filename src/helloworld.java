import java.util.*;
class employee{
    int employee_id;
    String employee_name;
    char sex;
    int employee_salary;
    
    public employee(int employee_id, String employee_name, char sex, int employee_salary){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.sex = sex;
        this.employee_salary = employee_salary;
    }
}


public class helloworld {
    
    public static void printdata(employee e){
        System.out.print("\nEmployee Name : " + e.employee_name);
        System.out.print("\nEmployee ID : " + e.employee_id);
        System.out.print("\nEmployee Salary : " + e.employee_salary);
        System.out.print("\nEmployee Gender : " + e.sex);
        
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select the Options Given below.");
        System.out.print("\n1.Add Employee\n2.Terminate Employee\n3.Increase Gross Salary\n4.Search Employee\n5.Display All Employee\n6.Exit\n");
        
        ArrayList<employee> dataset = new ArrayList<>();
        while(true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Employee Id: ");
                    int eid = sc.nextInt();                   
                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();
                    System.out.print("Enter Employee Gender: ");
                    char sex = sc.next().charAt(0);
                    System.out.print("Enter Employee Gross Salary: ");
                    int salary = sc.nextInt();
                    
                    for(employee e : dataset) {
                    	if(e.employee_id == eid) {
                    		System.out.print("\nEmployee Already Exist.");
                    		continue;
                    	}
                    }
                    
                    employee e1 = new employee(eid,name,sex,salary);
                    dataset.add(e1);
                    continue;
                case 2:
                    System.out.print("\nEnter Employee Id: ");
                    int emid = sc.nextInt();
                    for(employee e : dataset){
                        if(e.employee_id == emid){
                            dataset.remove(e);
                            System.out.print("\nEmployee having id " + emid + " issued a Termination letter.");
                            continue;
                        }
                    }
                    
                case 3:
                    System.out.print("\nEnter Employee Id: ");
                    int empid = sc.nextInt();
                    for(employee e : dataset){
                        if(e.employee_id == empid){
                            System.out.print("\nCurrent Gross Salary of Employee : " + e.employee_salary);
                            System.out.print("\nEnter the Updated Gross Salary of Employee : ");
                            int updatedsalary = sc.nextInt();
                            e.employee_salary = updatedsalary;
                            printdata(e);
                            continue;
                        }
                    }
                case 4:
                    System.out.print("\nEnter Employee Id: ");
                    int employid = sc.nextInt();
                    for(employee e : dataset){
                        if(e.employee_id == employid){
                            System.out.print("\nEmploye data Found ");
                            printdata(e);
                            continue;
                        }
                    }
                case 5:
                    System.out.print("\nList of All Employee in a database ");
                    if(dataset.size() == 0) {
                    	System.out.print("Hire Employee we need Workforce.");
                    	continue;
                    }else {
	                    for(employee e : dataset){
	                       printdata(e);
	                       System.out.println("\n");
	                    }
	                    continue;
                    }
                case 6:
                    System.out.println("Programme Terminated.");
                    break;
                default:
                    System.out.print("\nEnter a Valid Option from the Choice.");
                    continue;
            }
        }
    }
}