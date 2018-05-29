/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_estudiantes;
import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class Registro_Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        Estudiante [] lista_est=new Estudiante[5];
        Materia [] lista_mat=new Materia[2];
        int d=0; 
        
        System.out.println("###Registro de estudiantes###");
        System.out.println("Presione enter para iniciar");
        for(int i=0; i<5; i++){
            
            scan.nextLine(); 
            System.out.println("Ingrese datos estudiante " + (i+1) + ": ");
            System.out.println("Nombre: ");
            String nombre= scan.nextLine();
            System.out.println("Edad: ");
            int edad= scan.nextInt();
            
            System.out.println("###Materias###");
            for(int j=0; j<2; j++){
                System.out.println("##Materia" + (j+1) + " ");
                scan.nextLine(); 
                System.out.println("Nombre: ");
                String nombre_mat= scan.nextLine();
                System.out.println("Nivel: ");
                int nivel=scan.nextInt(); 
                lista_mat[j]=new Materia(nombre_mat,nivel); 
                lista_est[i]=new Estudiante(nombre,edad,lista_mat[j]);
                
            }
            
            System.out.println("Se ha ingresado el estudiante " + (i+1) + "con los siguientes datos: ");
            System.out.println(lista_est[i]); 
            for(int m=0; m<2; m++){
             System.out.println(lista_mat[m]);
            }
            System.out.println(" ");
         
    
}
        for(int a=0; a<5; a++){
        
            if(a>0){
            
            for(int b=0; b<5; b++){    
                
            if(lista_est[a].equals(lista_est[b])){; 
                d=1;
                if(d==1){
                System.out.println("Duplcado en: " + a);  
                }else{
                    System.out.println("No existen duplicados");
                
                }
            }else{
                System.out.println("No existen duplicados");
            }
                }
            }
        
        
        }
        
    
}
    
}
