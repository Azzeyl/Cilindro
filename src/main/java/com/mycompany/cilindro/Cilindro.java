

package com.mycompany.cilindro; //ubicacion de los paquetes, carpetas con clases

import java.util.Scanner;

public class Cilindro {

    Scanner teclado = new Scanner(System.in);
    
    char respuesta = ' ';
    float altura = 0;
    float diametro = 0;
    float radio = 0;
    float cuadrado = 0;
    float operacion = 0;
    
    //metodos
    
    public Cilindro(){
        this.altura = 0;
        this.diametro = 0;
    }
    
    public Cilindro(float altura, float diametro){
        this.altura = altura;
        this.diametro = diametro;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setDiametro(float diametro){
        this.diametro = diametro;
    }
    
    public float getAltura(){
        return altura;
    }
    public float getDiametro(){
        return diametro;
    }
    
    public float calcularVolumen(){
        
    radio = diametro / 2;
    cuadrado = radio * radio;
    operacion = (float) (3.1416 * altura * cuadrado);
    
     
    return (operacion);
    }
        //normal 
        public void capturarDatos(){
        
            System.out.println("<<Bienvenido>>");
            System.out.println("¿Señor usuario desea calcular el volumen de un cilindro?: ");
            respuesta = teclado.next().charAt(0);
            
            while((respuesta == 's')||(respuesta == 'S')){
            
            altura = 0;
            diametro = 0;
            radio = 0;
            cuadrado = 0;
            operacion = 0;
            
            System.out.println("Señor usuario ingrese la altura:");
            altura = teclado.nextFloat();
            
            System.out.println("Señor usuario ingrese el diametro:");
            diametro = teclado.nextFloat();
            
            radio = diametro / 2;
            cuadrado = radio * radio;
            operacion = (float) (3.1416 * altura * cuadrado); // lo pide
            
            System.out.println("El volumen del cilindro es: " + " " + operacion);
            
            System.out.println("¿Señor usuario desea ingresar otros datos?:");
            respuesta = teclado.next().charAt(0);
            }
        
        }
        //metodo principal 
    public static void main (String[] args){
        Cilindro unCilindro;
        unCilindro = new Cilindro();
        unCilindro.capturarDatos();
    }
    
}
