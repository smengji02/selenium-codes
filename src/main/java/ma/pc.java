package ma;

import java.util.Scanner;

public class pc {

    void d(){
        System.out.println("fact of 9");

        int a =9, i,j, result =0;
        for(i=1;i<=a;i++){
            for( j=1;j<=i;j++){


            }result=i*j;



        }System.out.print(result);


    }


    void b(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int b= sc.nextInt();
        int result = 0 ;
        for(int i=1;i<11;i++){
            result=b*i;
            System.out.println(result);

        }

    }
      void a(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the age");
        int a = sc.nextInt();
       if(a>=18){
          System.out.println("Eligible to vote");
       }else{
           System.out.println("not eligilbe to vote");
      }
       System.out.println(a);


}

    public static void main(String[] args){
        pc c = new pc();
        c.a();
        c.b();
        c.d();
    }
}
