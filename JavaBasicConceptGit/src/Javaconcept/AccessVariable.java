
package Javaconcept;

class OuterClass{
    int x = 10;
    static int y = 20;
    class InnerClass{
        int x = 30 ;
        static final int y = 40;
        void methodInner(){
            System.out.println(x); // =30
            System.out.println(y); // =40
            System.out.println(OuterClass.this.x); //= 10
            System.out.println(OuterClass.this.y); //= 20
            //or
            System.out.println(OuterClass.y); // =20//vi y la static
                                                    // khong the truy cap toi x x
                                                     // vi x la non-static
        }
    }
}
    
    
public class AccessVariable {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        // tao mot doi tuong inner 
        OuterClass.InnerClass in = out.new InnerClass();
        in.methodInner();
    }
    
}
