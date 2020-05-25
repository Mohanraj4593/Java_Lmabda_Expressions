package Lambda_Expressions;



public class LE_2 {
    public static void main(String[] args) {
        new Thread(()->
        {
            for (int i=0;i<5;i++)
            {
                System.out.println("Child Thread");
            }
        }).start();


        for (int j=0;j<5;j++)
        {
            System.out.println("Main Thread");
        }


    }}
