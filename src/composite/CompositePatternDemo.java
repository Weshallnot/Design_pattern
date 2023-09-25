
package composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO=new Employee("Ganesh", "CEO",300000);
        Employee headSales=new Employee("Suresh", "Head Sales",200000);
        Employee headMarketing=new Employee("Dinesh", "Head Marketing",200000);
        Employee clerk1=new Employee("Rajesh", "Marketing",100000);
        Employee clerk2=new Employee("Dipesh", "Marketing",100000);
        Employee salesExecutive1=new Employee("Mahesh", "Sales",100000);
        Employee salesExecutive2=new Employee("Yogesh", "Sales",100000);
        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        // print all employees of the organization
        System.out.println(CEO);
//        System.out.println(headSales);
//        System.out.println(headMarketing);
//        System.out.println(clerk1);
//        System.out.println(clerk2);
//        System.out.println(salesExecutive1);
 //       System.out.println(salesExecutive2);
        // in the hierarchical manner print 
        for (Employee headEmployee : CEO.getsubordinate()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getsubordinate()) {
                System.out.println(employee);
            }
        }
    }
}
