package Basic;

import java.util.Scanner;

public class contandoEuros {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce euros: ");
        int eurosTotal = sc.nextInt();
        
        int b500=eurosTotal/500;
        eurosTotal%=500;
        int b200=eurosTotal/200;
        eurosTotal%=200;
        int b100=eurosTotal/100;
        eurosTotal%=100;
        int b50 = eurosTotal/50;
        eurosTotal%=50;
        int b20 =eurosTotal/20;
        eurosTotal%=20;
        int b10= eurosTotal/10;
        eurosTotal%=10;
        int b5= eurosTotal/5;
        eurosTotal%=5;
        int m2=eurosTotal/2;
        eurosTotal%=2;
        int m1=eurosTotal;
        
        System.out.println("El desglose es...");
        if (b500!=0) {
            System.out.println(b500 + " billetes de 500€");
            
        }if (b200!=0) {
            System.out.println(b200 + " billetes de 200€");
            
        }if (b100!=0) {
            System.out.println(b100 + " billetes de 100");
            
        }if (b50!=0) {
            System.out.println(b50 + " billetes de 50");
            
        }if (b20!=0) {
            System.out.println(b20 + " billetes de 20");
            
        }if (b10!=0) {
            System.out.println(b10 + " billetes de 10");
            
        }if (b5!=0) {
            System.out.println(b5 + " billetes de 5");
            
        }if(m2!=0){
            System.out.println(m2 + " monedas de 2");
        
        }if(m1!=0){
            System.out.println(m1 + " monedas de 1");
        }
        sc.close();
    }
}
