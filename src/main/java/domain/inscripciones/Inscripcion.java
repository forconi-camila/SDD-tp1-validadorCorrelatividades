package domain.inscripciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    // constructor
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<Materia>();
    }

    // getters
    public Alumno getAlumno() { return alumno; }
    public List<Materia> getMaterias() { return materias; }

    // setters
    public void setAlumno(Alumno alumno) { this.alumno = alumno; }

    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }

    // metodos
    public boolean aprobada() {
        for(Materia materia : materias) {
            if (!alumno.cumpleCorrelativas(materia)) {
                return false;
            }
        }

        return true;
    }

    public Integer cantDeMateriasInscriptas() { return this.materias.size(); }

}
