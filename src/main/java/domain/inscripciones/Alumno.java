package domain.inscripciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAprobadas;

    // constructor
    public Alumno(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    // getters
    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }
    public List<Materia> getMateriasAprobadas() { return materiasAprobadas; }

    // setters
    public void setLegajo(String legajo) { this.legajo = legajo; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    // metodos
    public boolean cumpleCorrelativas(Materia unaMateria) {
        List<Materia> correlativas = unaMateria.getCorrelativas();

        // verificar que todas las correlativas de la materia esten entre las materiasAprobadas
        for (Materia materia : correlativas) {
            // si hay alguna correlativa no aprobada, no cumple correlativas
            if (!this.materiasAprobadas.contains(materia)) {
                return false;
            }
        }

        // si todas las correlativas estan aprobadas, cumple correlativas
        return true;
    }

    public Integer cantDeMateriasAprobadas() { return this.materiasAprobadas.size(); }
}
