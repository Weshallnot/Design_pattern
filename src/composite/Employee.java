
package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
       private String name;
       private String dept;
       private int salary; 
       private List<Employee> subordinate;   // can hold employee class object

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinate = new ArrayList<Employee>();  
    }
       public void add(Employee e){
       subordinate.add(e);   
       }
       public void remove(Employee e){
       subordinate.remove(e);
       }
       public List<Employee> getsubordinate(){
       return subordinate;    // return the subordinate list
       }
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + '}';
    }
       
}
