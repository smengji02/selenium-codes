package ma;

import java.util.Scanner;

public class addition {
    void a(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("list of prime numbers:");
        int n =Scanner.nextInt();
        for(int i=1;i<=n;i++){
            int temp=0;
            for(int j =2;j<i-1;j++){
                if(i%j==0){
                    temp=temp + 1;
                }
            }
            if(temp==0){
                System.out.print(" "+i+" ");
            }

        }

    }
    public static void main(String[] args){
        addition ad = new addition();
        ad.a();
        
        
    }
}
    
