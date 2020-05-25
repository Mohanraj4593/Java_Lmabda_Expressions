
package Lambda_Expressions;

@FunctionalInterface
interface i1
{
    void sum();
}

class demo implements i1
{
    public void sum()
    {
        int a=10;
        int b=20;
        int result=a+b;
        System.out.println("Sum is:"+result);
    }

}

public class LE_1{

    public static void main(String[] args) {
        new demo().sum();
    }
}
