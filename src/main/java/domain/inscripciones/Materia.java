package domain.inscripciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    // constructor
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    // getters
    public String getNombre() { return nombre; }
    public List<Materia> getCorrelativas() { return correlativas; }

    // setters
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarCorrelativas(Materia ... correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }

    // metodos
    public Integer cantDeCorrelativas() { return this.correlativas.size(); }

    public boolean esUnaCorrelativa(Materia unaMateria) {
        return this.correlativas.contains(unaMateria);
    }
}
