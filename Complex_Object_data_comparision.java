package Lambda_Expressions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Complex_Object implements Comparator
{
private String name;
private int age;
private String designation;

Complex_Object(String name,int age,String designation)
{
    this.name=name;
    this.age=age;
    this.designation=designation;
}


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }




    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}












public class Complex_Object_data_comparision {
    public static void main(String[] args) {
        ArrayList<Complex_Object> list=new ArrayList<>();

        Complex_Object c1=new Complex_Object("Raheem", 44, "Student");
        Complex_Object c2=new Complex_Object("Dev", 25, "Student");
        Complex_Object c3=new Complex_Object("Pramod", 31, "Student");
        Complex_Object c4=new Complex_Object("Human", 22, "Student");

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);


    }}
