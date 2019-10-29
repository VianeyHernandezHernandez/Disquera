/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disquera;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Disquera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();
        CantanteFamoso entrada = new CantanteFamoso();

       
        

        String continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("La lista contiene los siguientes datos: ");
            listacantate.listarCantanteFamoso();
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        
        
         System.out.println("La lista contiene los siguientes datos: ");
                
        listacantate.listarCantanteFamoso();
    }
    
}
