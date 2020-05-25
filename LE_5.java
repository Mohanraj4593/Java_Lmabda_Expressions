package Lambda_Expressions;

interface right {
    default void disp()
    {
        System.out.println("Inside right");
    }
}
public class LE_5 implements right{

@Override
public void disp()
{
    System.out.println("own implementation");
}
public static void main(String[] args) {



        LE_5 l=new LE_5();

        l.disp();
}
}




