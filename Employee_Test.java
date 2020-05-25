package Lambda_Expressions;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
String name;
double salary;

Employee(String name,double salary)
{
    this.name=name;
    this.salary=salary;
}

}



public class Employee_Test {
public static void main(String[]args){

        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("A",1000));
        list.add(new Employee("B",2000));
        list.add(new Employee("C",3000));
        list.add(new Employee("D",4000));
        list.add(new Employee("E",5000));
        list.add(new Employee("F",6000));
        list.add(new Employee("G",7000));
        list.add(new Employee("H",9000));

        Function<ArrayList<Employee>,Double> totsal=(ArrayList<Employee> list1)->{
             double total=0;
            for (Employee emplys:list1)
            {total+=emplys.salary;}
                return total;
        };
        System.out.println(totsal.apply(list));
        }}