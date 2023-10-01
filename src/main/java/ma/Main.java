package ma;

public class Main {
    void a(){
        System.out.println("hello Srinivas");
    }
    void a(int a){
        System.out.println("method a with parameter");
        System.out.println(a+2);
    }
    void a(int a, int b ){
        System.out.println("methdo with 2 paraments ");
        System.out.println(a+b);

        }
       void a (String a){
        System.out.println("method with String paramter");
        System.out.println("hello"+" " +a);

       }


    public static void main(String[] args) {
        Main m =  new Main();
        m.a();
        m.a(4);
        m.a("Srinivas");
        m.a(3,5);


    }
}