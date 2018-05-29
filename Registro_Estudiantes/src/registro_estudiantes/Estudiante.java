/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_estudiantes;

import java.util.Objects;

/**
 *
 * @author ESFOT
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private Materia materias;

    public Estudiante(String nombre, int edad, Materia materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias=materias; 
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad +  ", Materias: "; 
    }

   
    
    
    
    
}
