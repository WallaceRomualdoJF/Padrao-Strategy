import org.example.wallace.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AvaliacaoTest {

    @Test
    public void testAvaliacaoPorProvas() {
        Aluno aluno = new Aluno();
        AvaliacaoEstrategica estrategia = new AvaliacaoPorProvas();
        aluno.setEstrategia(estrategia);
        float nota = aluno.realizarAvaliacao();
        assertEquals(8.5f, nota, 0.01f); // Espera-se uma nota de 8.5 com margem de erro de 0.01
    }

    @Test
    public void testAvaliacaoPorTrabalhosEmGrupo() {
        Aluno aluno = new Aluno();
        AvaliacaoEstrategica estrategia = new AvaliacaoPorTrabalhosEmGrupo();
        aluno.setEstrategia(estrategia);
        float nota = aluno.realizarAvaliacao();
        assertEquals(9.2f, nota, 0.01f); // Espera-se uma nota de 9.2 com margem de erro de 0.01
    }

    @Test
    public void testAvaliacaoPorProjetosIndividuais() {
        Aluno aluno = new Aluno();
        AvaliacaoEstrategica estrategia = new AvaliacaoPorProjetosIndividuais();
        aluno.setEstrategia(estrategia);
        float nota = aluno.realizarAvaliacao();
        assertEquals(7.8f, nota, 0.01f); // Espera-se uma nota de 7.8 com margem de erro de 0.01
    }
}