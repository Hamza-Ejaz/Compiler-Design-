// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int c =10;
    int b;
    A a = new A(5);
    HelloWorld() {
        this.b = 11;
        a.b = 5;
    }

    int res;
    public static void main(String[] args) {
        
        B v = new B(3);
        A a = new A(5);
        v.printer();
        B b = new B(4);
        
        int res = a.b * b.b + a.b;
      

    }

 
}
class B{
    int b;

    B(int c) {
        this.b = c;
    }
    
    void printer(){
        System.out.println("class me hn bhai");
        System.out.println(this.b);
    }
  
}

class A extends B{
    int b;
    int ds = 78 ;
    A(int d) {
        super(d);
        this.b = d;
    }

    void a() {
        
    }
}
