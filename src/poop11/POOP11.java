/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * clase que escribe y lee información desde un archivo
 * @author poo08alu04
 */
public class POOP11 {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        /**
         * Verifica si el archivo existe
         */
        if(!archivo.exists()){
            try{
            System.out.println("Creando archivo...");
            boolean seCreo = archivo.createNewFile();
            System.out.println("Archivo creado: "+seCreo);
            System.out.println(archivo.exists());
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        /**
         * Se escribe información al archivo de texto alumnos.csv
         */
        try{
        System.out.println("##########FileWriter##########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe texto para agregarlo al archivo");
        String texto = br.readLine();
        System.out.println("Texto ingresado: "+texto);
        
        FileWriter fw = new FileWriter("alumnos.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter salida = new PrintWriter(bw);
        salida.println(texto);
        for(int i = 0; i < 50; i++){
            salida.println("Alumnos"+i+",Apellido"+i);
        }
        salida.close();
        
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("#########FileReader##########");
        /**
         * Se lee la información del archivo de texto "alumnos.csv" 
         * para imprimir la información a pantalla (terminal)
         */
        try{
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
        }catch(FileNotFoundException ex){
                System.out.println(ex.getMessage());
                
        }catch(IOException ex){
                System.out.println(ex.getMessage()); 
        }
        
        System.out.println("############String tokenizer##########");
        String linea = "Martìnez,Araujo,Jesùs,Alonso,3181848481,20,20";
        StringTokenizer st = new StringTokenizer(linea,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()); 
        }
        String a = "3";
        //int b = a;
        int b = Integer.parseInt(a);
        System.out.println(b);
        String c = 5+"";
      }
                
    }
