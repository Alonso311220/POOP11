/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11_actividad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author poo08alu04 clase que guarda la información de un arreglo en un archivo
 * .csv y se imprime la información en la terminal con ayuda de FileWriter y FileReader
 */
public class POOP11_Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno[] alumno = new Alumno[5];
        alumno[0] = new Alumno("Alonso","Martinez","Araujo",318184841,20,20);
        alumno[1] = new Alumno("Ruben","Suarez","Ayala",318184842,21,20);
        alumno[2] = new Alumno("Sofia","Jimenez","Vasquez",318184843,21,19);
        alumno[3] = new Alumno("Iram","Barbosa","GarduÃ±o",318184844,22,20);
        alumno[4] = new Alumno("Leonardo","Becerra","Hernandez",318184845,20,20);
        
        FileWriter fw;
        /**
          * Se escribe la información del arreglo de alumnos en el archivo alumnos.csv
          */
        try {
            fw = new FileWriter("alumnos.csv");
        
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            for(int i = 0; i < 5; i++){
                salida.println(alumno[i].getNombre()+","+alumno[i].getApPat()
                +","+alumno[i].getApMat()+","+alumno[i].getNumCuenta()+","+alumno[i].getEdad()+","+alumno[i].getAnioIngreso());
            }
            salida.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
        /**
         * Se lee la información del archivo y se imprime a pantalla
         */
        try{
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            Alumno alu = new Alumno();
            while(linea != null){
                System.out.println("Alumno: "+linea);
                StringTokenizer st = new StringTokenizer(linea,",");
                alu.setNombre(st.nextToken());
                System.out.println(alu.getNombre());
                alu.setApPat(st.nextToken());
                System.out.println(alu.getApPat());
                alu.setApMat(st.nextToken());
                System.out.println(alu.getApMat());
                alu.setNumCuenta(Integer.parseInt(st.nextToken()));
                System.out.println(alu.getNumCuenta());
                alu.setEdad(Integer.parseInt(st.nextToken()));
                System.out.println(alu.getEdad());
                alu.setAnioIngreso(Integer.parseInt(st.nextToken()));
                System.out.println(alu.getAnioIngreso());
                linea = br.readLine();
            }
            System.out.println(alu);
            br.close();
        }catch(FileNotFoundException ex){
                System.out.println(ex.getMessage());
                
        }catch(IOException ex){
                System.out.println(ex.getMessage());
        }  
        
    }
}
/*

int i = 0;
            Alumno [] alu = new Alumno[5];
            while(linea != null){
                System.out.println("Alumno: "+linea);
                StringTokenizer st = new StringTokenizer(linea,",");
                String nombre = st.nextToken();
                //st.nextToken();
                String apellidoPat = st.nextToken();
                //st.nextToken();
                String apellidoMat = st.nextToken();
                //Integer.parseInt(st.nextToken());
                String numCuenta = Integer.parseInt(st.nextToken());
                //Integer.parseInt(st.nextToken());
                String edad = Integer.parseInt(st.nextToken());
                //Integer.parseInt(st.nextToken());
                String anioIngreso = Integer.parseInt(st.nextToken());
                alu[i] = new Alumno(nombre, apellidoPat, apellidoMat, numCuenta, edad , anioIngreso);
                i++;
            }
*/
