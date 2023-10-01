package ma;

public class constructoroverloading {
    void constructoroverloading(){
        System.out.println("method with no parameters ");
    }
    void constructoroverloading(int a){
        System.out.println("Method with parameters");
        System.out.println(9+ a);
    }
    void constructoroverloading(String a){
        System.out.println("method with parameters");
        System.out.println("hello"+" "+a);

    }
    public static void main(String[] args){
        constructoroverloading cd = new constructoroverloading();
        constructoroverloading cd1= new constructoroverloading();
        constructoroverloading cd2= new constructoroverloading();



        cd.constructoroverloading();
        cd1.constructoroverloading(5);
        cd2.constructoroverloading("Srinivas");
    }
}
