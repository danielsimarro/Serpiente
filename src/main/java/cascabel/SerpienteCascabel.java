/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cascabel;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class SerpienteCascabel {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        //Creamos una varible donde el usuario introducira el número de
        //mediciones que tendra entre 1 y 100
        int numMediciones;
        
        do{
        System.out.println("Introduce el número de mediciones (n):");
        numMediciones= teclado.nextInt();
        }while(numMediciones<1 || numMediciones>100);
        //El usuario tendra que introducir el númeo de mediciones consecutivas
        //que aguanta la serpiente por debajo del umbrla (K)
        int medicionesConsecutivas;
        
        System.out.println("Introduce el número de mediciones consecutivas por debajo del umbral (k):");
        medicionesConsecutivas = teclado.nextInt();
        //Ahora crearemos el array donde almacenaremos las mediciones que introduzca el usuario
        //, el tamaño del array viene determinado por el numero de mediciones introducidas por el usuario
        int [] arraySerpiente = new int [numMediciones];
        
        for (int i = 0; i<arraySerpiente.length;i++){
            do{
            System.out.println("Introduce la medición " + (i + 1));
            arraySerpiente[i]=teclado.nextInt();
            }while(arraySerpiente[i]!=0 && arraySerpiente[i]!=1);
        }
        
        //Apartir de aqui vamos a desallorrar el algoritmo para que muestre el resultado que queremos
        int posicion=0; //Va almacenando la posicion 
        int longitud=0;//va almacenando la longitud del periodo
        
        for(int i =0; i < arraySerpiente.length;i++){
            
            if (arraySerpiente[i]==1){
                posicion++;
                longitud++;
            
            }
        }
    }
}
