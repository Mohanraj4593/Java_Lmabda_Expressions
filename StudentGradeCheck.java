package Lambda_Expressions;

import java.util.function.Function;

    class Student{
    String name;
    int marks;
    Student(int marks,String name)
    {
        this.marks=marks;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return name;
    }


}


public class StudentGradeCheck
{
    public static void main(String[] args) {
Student student[]={
        new Student(75,"Rohan"),

        new Student(40,"Pavan"),
        new Student(52,"Prakash"),
        new Student(62,"Krishna")
};
        Function<Integer,String> studentgrade=marks->{
            String a="";
            if (marks>70) {a="Grade A:distinction";}
            else if (marks>60&&marks<69) {a="Grade B:First Class"; }
            else if (marks>50&&marks<59){a="Grade C:Second Class"; }
            else{a="Grade D:Fail";}
            return a;
        };

        for (Student stu:student) {
            System.out.println("Student Name:"+stu.toString()+" "+studentgrade.apply(stu.marks));

        }

    }
}
