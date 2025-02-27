
package aula1exe2;

import java.util.Scanner;

public class Aula1exe2 {


    public static void main(String[] args) {
        String nome,sobrenome, ambos;
        Scanner leia= new Scanner(System.in);
        System.out.print("digite seu nome  ");
         nome=leia.nextLine();
        System.out.print("digite seu sobrenome  ");
        sobrenome=leia.nextLine();
        ambos=(nome + sobrenome);
        System.out.print("nome e sobre  "+ ambos );
         }
    
}
