package Lambda_Expressions;

import java.util.Arrays;
import java.util.function.Predicate;

class Person {
    String name;
    int age;
    int salary;

    Person(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString()
    {
        return name+" "+age;
    }

}



public class Test
{
    public static void main(String[] args)
    {
    Person[] persondetails={new Person("Dhoni",35,50000),
                            new Person("Rahul",20,10000),
                            new Person("Dinesh",25,30000),
                            new Person("Dhanush",50,20000),
                            new Person("Virat",42,45000),
                            new Person("Raina",28,28000),
                            new Person("Rohit",34,36000)};

        Predicate<Person> validate=details->details.age>25&&details.salary>30000;
       System.out.println("Person with age >25 and salary>30000 are");
        for (Person p:persondetails) {
            if (validate.test(p))
            {
                System.out.println(p);
            }

        }

    }


}