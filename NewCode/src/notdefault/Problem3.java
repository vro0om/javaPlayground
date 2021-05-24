package notdefault;

class Foo
{
    Foo(String s)
    {
        System.out.println(s);
    }
}

public   class Problem3 {

    public static void main(String[] args) {
        new Problem3();
    }
    Foo f = new Foo("hi");
    static Foo f1 = new Foo("hey");



}
