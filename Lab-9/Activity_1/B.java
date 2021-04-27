
package Activity_1;

public class B extends A {
    private int k;
    
    public B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    // display k – this overrides show() in A
    public void show() {
    System.out.println("k: " + k);
    }

}
