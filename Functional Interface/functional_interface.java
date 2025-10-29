interface A{
    void AA();
}

interface B{
    void sum(int x, int y);
    // void BB();        Lambdas can only implement functional interfaces(having one method only else give error )
}

public class functional_interface {
    public static void main(String[] args) {
        A a= ()-> System.out.println("Hello");
        a.AA();
        B b=(int x, int y)-> { int c=x+y;  System.out.println(c); };
        b.sum(2,3);
    }
}
