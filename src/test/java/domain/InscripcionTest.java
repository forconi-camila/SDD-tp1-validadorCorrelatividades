package domain;

import domain.inscripciones.Alumno;
import domain.inscripciones.Inscripcion;
import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void inscripcionDeTresMaterias() {
        Alumno alumno = new Alumno("16169744", "Franco");

        Materia analisisI = new Materia("Analisis Matematico I");
        Materia analisisII = new Materia("Analisis Matematico II");
        Materia fisicaI = new Materia("Fisica I");

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(analisisI, analisisII, fisicaI);

        Assert.assertEquals(3, inscripcion.cantDeMateriasInscriptas().intValue());
    }

    @Test
    public void inscripcionAprobada() {
        Alumno alumno = new Alumno("16169744", "Franco");

        Materia analisisI = new Materia("Analisis Matematico I");
        Materia dibujo = new Materia("Dibujo Tecnico");
        Materia fisicaI = new Materia("Fisica I");

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(analisisI, dibujo, fisicaI);

        Assert.assertEquals(true, inscripcion.aprobada());
    }

    @Test
    public void inscripcionDesaprobada() {
        Alumno alumno = new Alumno("16169744", "Franco");

        Materia analisisI = new Materia("Analisis Matematico I");
        Materia analisisII = new Materia("Analisis Matematico II");
        Materia fisicaI = new Materia("Fisica I");

        analisisII.agregarCorrelativas(analisisI);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(analisisI, analisisII, fisicaI);

        Assert.assertEquals(false, inscripcion.aprobada());
    }
}
