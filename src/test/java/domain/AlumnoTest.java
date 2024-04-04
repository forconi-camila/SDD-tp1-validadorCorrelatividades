package domain;

import domain.inscripciones.Alumno;
import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;

public class AlumnoTest {

    @Test
    public void alumnoSeLlamaFranco() {
        Alumno alumno = new Alumno("16169744","Franco");

        Assert.assertEquals("Franco", alumno.getNombre());
    }

    @Test
    public void alumnoAproboDosMaterias() {
        Alumno alumno = new Alumno("16169744","Franco");

        Materia fisica = new Materia("Fisica I");
        Materia analisis = new Materia("Analisis MAtematico I");

        alumno.agregarMateriasAprobadas(fisica, analisis);

        Assert.assertEquals(2, alumno.cantDeMateriasAprobadas().intValue());
    }
}
