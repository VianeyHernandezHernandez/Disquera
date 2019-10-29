/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disquera;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
class CantanteFamoso {
    
    private String nombre;
    private String discoMasVendido;
     private String entradaTeclado;
    Scanner sc = new Scanner(System.in);
    
    public String AgregarCantante() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }
    public String getEntrada() {
        return entradaTeclado;}
    public CantanteFamoso() {
        nombre = "";
        discoMasVendido = "";
    }

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getDiscoConMasVentas() {
        return discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    
}
