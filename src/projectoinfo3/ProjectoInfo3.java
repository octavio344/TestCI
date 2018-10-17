/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoinfo3;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectoinfo3.Lectura.lectura;

/**
 *
 * @author octavio
 */
public class ProjectoInfo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //------------Declaracion de variables--------------//
        String a[] = null,aux[],txt="es.txt",au;
        lectura l=new lectura();
        Scanner in=new Scanner(System.in);
        long startTime,finishTime;
        //-------------------------------------------------//
        
        //--------------------Levantar txt----------------//
       try {
            startTime = System.currentTimeMillis();
            a=l.LevantarTxt(txt);
            finishTime = System.currentTimeMillis();
            System.out.println("//El archivo se levanto en "+(finishTime-startTime)+" MilisSeg//\n");
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo: "+txt+"\n\nFin del Programa");
            System.exit(1);
            
        }
        //-----------------------------------------------//
        System.out.println("Encriptacion de archivos v1.021\n");
        
        System.out.println("");
        System.out.println("Ingrese una oración:");
        au=in.nextLine();
        
        aux=Rstring(au);
        
    }
    
    private static String[] Rstring(String aux){
        String a[]=aux.split("\\s");
        return a;
    }
    
}
