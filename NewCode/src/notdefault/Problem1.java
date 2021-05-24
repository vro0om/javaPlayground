package notdefault;

public class Problem1 {

    public static void main(String[] args) {
        try{
            throw new Exception();

        }
        catch (Exception e)
        {
            try{
                int i = 0/5;
                throw new ArithmeticException();
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Exception");
            }
                System.out.println("Caught");
        }
    }

}


class P{
    protected int test()
    {
        System.out.println("P... ");
        return 1;
    }
}

class C extends P{
    @Override
    public int test()
    {
        System.out.println("C... ");
        return 2;
    }
}