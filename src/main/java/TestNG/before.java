package TestNG;

import org.testng.annotations.*;

public class before {
    @BeforeSuite
    void a(){
        int n;
        for(int i=1;i<100;i++){
            int count=0;
            for(int j=2;j<=i;i++){
                if(j%1==0){
                    count = count +1;
                }
            }
            if(count==0) {
                System.out.print(i+" ");
            }


        }
        System.out.println("before suite");
    }
    @AfterSuite
    void b(){

        System.out.println("after suite");
    }
    @BeforeClass
    void c(){
        System.out.println("beforeclass");
    }
    @AfterClass
    void d(){
        System.out.println("afterlcass");
    }
    @BeforeGroups
    void e(){
        System.out.println("before groups");
    }
    @AfterGroups
    void f(){
        System.out.println("after groups");
    }
    @BeforeMethod
    void g(){
        System.out.println("before method");
    }
    @AfterMethod
    void h(){
        System.out.println("after method");
    }
    @BeforeTest
    void i(){
        System.out.println("before test");
    }
    @AfterTest
    void j(){
        System.out.println("after test");
    }
    @Test
    void k(){
        System.out.println("test");
    }





















}
