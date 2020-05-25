package Lambda_Expressions;

@FunctionalInterface
interface i4
{
    void display();

    default void show() {

        System.out.println("Inside show() method");
                        }

}


public class LE_3 implements i4{
    @Override
    public void display()
    {
        System.out.println("inside display() ");
    }

    public static void main(String[] args) {
       i4 i=new LE_3();
        i.show();
        i.display();

    }
}

