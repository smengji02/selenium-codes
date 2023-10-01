package TestNG;

import org.testng.annotations.Test;

public class test1{
    @Test
    void c (){
        System.out.println("void c");
    }
    @Test(priority = 1)
    void b(){
        System.out.println("void b");
    }
    @Test(groups = {"sanity"})
    void d(){
        System.out.println("void d");
    }
    @Test(enabled = true)
    void a(){
        System.out.println("void a");
    }
    @Test(groups = {"regression"})
    void e (){
        System.out.println("void e");
    }
    @Test
    void f(){
        System.out.println("void f");
    }
    @Test(groups = {"regression","sanity"})
    void g(){
        System.out.println("void g");
    }
    @Test
    void h(){
        System.out.println("void h");
    }
    @Test(invocationCount = 2)
    void i(){
        System.out.println("void i");
    }
    @Test(dependsOnGroups = {"regression","sanity"})
    void j(){
        System.out.println("void j");
    }
    @Test(timeOut = 10000)
    void k(){
        System.out.println("void k");
    }
    @Test (priority = 1)
    void l(){
        System.out.println("void l");
    }
    @Test(dependsOnGroups = {"regression"})
    void m(){
        System.out.println("void m");
    }

}
