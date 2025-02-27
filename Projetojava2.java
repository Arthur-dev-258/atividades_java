
package projetojava2;

import java.util.Scanner;


public class Projetojava2 {

   
    public static void main(String[] args) {
     float num1, num2, num3, media;
     Scanner leia = new Scanner(System.in); 
     System.out.print("digite numero 1:   ");
     num1 = leia.nextFloat();
     System.out.print("digite numero 2:  ");
     num2= leia.nextFloat();
     System.out.print("digite numeoro 3:  ");
     num3= leia.nextFloat();
     media= (num1+num2+num3) /3;
     System.out.print("media dos valores  "+ media);
         if (media >=6){
         System.out.println("aluno aprovado");
     }
     else{
         System.out.println("aluno reprovado");
     }
     
     
     
     
    }
    
}

