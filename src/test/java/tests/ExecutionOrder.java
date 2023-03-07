package tests;

import org.testng.annotations.Test;

public class ExecutionOrder {


    @Test (priority = 2, enabled = false )
    public void a(){
        System.out.println("A");
    }
    @Test
    public void b(){
        System.out.println("B");
    }
    @Test (priority = 32443)
    public void c(){
        System.out.println("C");
    }
    @Test (priority = -5451)
    public void z(){
        System.out.println("Z");
    }

    @Test (priority = 0)
    public void x(){
        System.out.println("X");
    }
}
