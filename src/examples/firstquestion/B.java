package examples.firstquestion;

public class B extends A{

    public  String mA(){
        return "mB()";
    }

    public static void main(String[] args) {


        // What is the output/
        // a) This is an example of method overloading
        // b) This is an example overriding
        // c) compile and print mB()
        // d) none of the above

        A a=new B();
        System.out.println(a.mA());
    }
}
