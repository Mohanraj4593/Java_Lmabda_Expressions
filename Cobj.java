package Lambda_Expressions;

import java.util.function.Predicate;

class Cricket
{
    private String name;
    private String designation;
    private int score;

    Cricket(String name,String designation,int score)
    {
        this.name=name;
        this.designation=designation;
        this.score=score;
    }

    @Override
    public String toString()
    {
        return name+" "+designation+" "+score;
    }


@Override
    public boolean equals(Object obj)
{
Cricket c=(Cricket) obj;
if(name.equals("Dhoni")==c.name.equals("Dhoni")&&designation.equals("Cap")==c.designation.equals("Captain")&&score==c.score)
{return true;}
else
    {return false;}

}}
public class Cobj {
    public static void main(String[] args) {


        Predicate<Cricket> scorecheck=Predicate.isEqual(new Cricket("Dhoni","Captain",70));

        Cricket c1=new Cricket("Dhoni","Captain",70);

        Cricket c2=new Cricket("Virat","Captain",80);

        System.out.println(scorecheck.equals(c1));

        System.out.println(scorecheck.equals(c2));

        String s="ABCD\b\bE";
        System.out.print(s);

        }
    }























/*
package Lambda_Expressions;

import java.util.function.Predicate;

public class Cobj {

    public static void main(String[] args) {

        Predicate<Cricketer1>checkcap=Predicate.isEqual(new Cricketer1 ("dhoni","captain",50000,"csk"));

        Cricketer1 c1=new Cricketer1("dhoni","captain",50000,"csk");
        Cricketer1 c2=new Cricketer1("warner","batsman",35000,"csk");

        System.out.println(checkcap.equals(c1));
        System.out.println(checkcap.equals(c2));

    }





}

class Cricketer1
{
    String name;
    String designation;
    double salary;
    String teamname;

    Cricketer1(String name,String designation,double salary,String teamname)
    {
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.teamname=teamname;

    }
    @Override
    public String toString() {
        String result=String.format("(%s, %s,%.2f,%s)",name,designation,salary,teamname);

        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        Cricketer1 cobj=(Cricketer1)obj;
        if(cobj.name.equalsIgnoreCase("dhoni")==name.equalsIgnoreCase("dhoni")&&
                cobj.designation.equalsIgnoreCase("captain")==designation.equalsIgnoreCase("captain")&&
                cobj.salary==salary&&cobj.teamname.equalsIgnoreCase("csk")==teamname.equalsIgnoreCase("csk"))

        {
            return true;
        }
        else
        {
            return false;

        }




    }
}
*/