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
public class Materia {
    
    private String materia;
    private int nivel;

    public Materia(String materia, int nivel) {
        this.materia = materia;
        this.nivel = nivel;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "*" + materia + "-" +nivel + " nivel";
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
        final Materia other = (Materia) obj;
        if (this.nivel != other.nivel) {
            return false;
        }
        if (!Objects.equals(this.materia, other.materia)) {
            return false;
        }
        return true;
    }

    
  
    
    
}
