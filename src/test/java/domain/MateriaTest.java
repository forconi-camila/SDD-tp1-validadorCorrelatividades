package domain;

import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void materiaSeLlamaFisica() {
        Materia materia = new Materia("Fisica I");

        Assert.assertEquals("Fisica I", materia.getNombre());
    }

    @Test
    public void MatematicaTieneCincoCorrelativas() {
        Materia matematicaSuperior = new Materia("Matematica Superior");

        Materia analisisI = new Materia("Analisis Matematico I");
        Materia analisisII = new Materia("Analisis Matematico II");
        Materia fisicaI = new Materia("Fisica I");
        Materia fisicaII = new Materia("Fisica II");
        Materia algebra = new Materia("Algebra");

        matematicaSuperior.agregarCorrelativas(analisisI, analisisII, fisicaI, fisicaII, algebra);

        Assert.assertEquals(5, matematicaSuperior.cantDeCorrelativas().intValue());
        Assert.assertEquals(true, matematicaSuperior.esUnaCorrelativa(fisicaI));
    }
}
