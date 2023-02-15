/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author david
 */
public class Cliente {
    
    
   public String Nombre;
    String Direccion;
    String Correo;
    int Telefono;
    int tarjetaCredito;
    int codigoZip;

    @Override
    public String toString() {
        return Nombre + Direccion + Correo +  Telefono + " " + tarjetaCredito + " " + codigoZip;
         
    }
    
    
    
    public Cliente(String name,String address,String mail,int phone, int creditCard, int zip){
    this.Nombre = name;    
    this.Direccion = address;
    this.Correo = mail;
    this.Telefono = phone;
    this.tarjetaCredito = creditCard;
    this.codigoZip = zip;    
    
    }
    
    
        public void datosUsuario(){
        
            System.out.println("Nombre: " + Nombre + "\nDireccion: " + Direccion + "\nCorreo: " + Correo + "\nTelefono: " + Telefono + "\nTarjeta de Credito: " + tarjetaCredito + "\nCodigo Zip " + codigoZip);
            
        
        }
    
        public void inicioSesion()
    {
        System.out.println("Bienvenido " + Nombre);
    }
        public void cerrarSesion(){
            System.out.println("Hasta Pronto " + Nombre + "...");
           
        }
       public void pagoConTarjeta(){
           System.out.println("Su pago fue exitoso! " + "\nNumero de Tarjeta: " + tarjetaCredito + "\nTitular de la Tarjeta: " + Nombre );
           }
       
       public void domicilio(){
           System.out.println("Su direccion actual para envios es: " + Direccion);
               
           }
           
       }
       
       


