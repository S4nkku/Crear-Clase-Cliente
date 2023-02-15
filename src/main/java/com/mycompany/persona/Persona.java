/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Persona {

    public static void main(String[] args) throws IOException {
        InputStreamReader lectorTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(lectorTeclado);
        
        
        Cliente Cliente1 = new Cliente("Juan ", "Cr 46 #80-94 ", "david@gmail.com ", 320345895, 1045958, 111095);
        
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Opcion 1: Ccnoce tus Datos");
            System.out.println("2. Opcion 2: Pago con Tarjeta");
            System.out.println("3. Opcion 3: Inicio Sesion");
            System.out.println("4. Opcion 4: Cierre Sesion");
            System.out.println("5. Opcion 5: Domicilio Actual");
            System.out.println("5. Opcion 6: Salir del programa");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    
                    case 1:
                        System.out.println("Has seleccionado la opcion 1: " + "\nDatos del usuario: ");
                        Cliente1.datosUsuario();
                        
                        break;
                        
                    case 2:
                        System.out.println("Has seleccionado la opcion 2: Pago con tarjeta: ");
                            System.out.println("Ingrese su valor a pagar"); 
                            String pago = reader.readLine();
                            System.out.println("Su pago fue de: " + pago + "$");
                            Cliente1.pagoConTarjeta();   
                        break;
                        
                        case 3:
                            System.out.println("Has seleccionado la opcion 3:" + "\nInicio Sesion: ");
                            Cliente1.inicioSesion();
                        break;
                            
                       case 4:
                        System.out.println("Has seleccionado la opcion 4:" + "\nCierre Sesion: ");
                            Cliente1.cerrarSesion();
                       break;
                       
                        case 5:
                        System.out.println("Has seleccionado la opcion 5:" + "\nDomicilio: ");
                            Cliente1.domicilio();
                       break;
                       
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
}
        
     
        
        
