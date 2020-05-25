package Lambda_Expressions;


interface FuncInterface
{
    void mul(int num1,int num2);
}

class Main
{
    public static void main(String[] args) {

        FuncInterface fobj = (int x,int y)->System.out.println(y*x);
fobj.mul(10,10);
    }}


