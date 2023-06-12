package org.example.wallace;

public class Aluno {
    private AvaliacaoEstrategica estrategia;

    public void setEstrategia(AvaliacaoEstrategica estrategia) {
        this.estrategia = estrategia;
    }

    public float realizarAvaliacao() {
        return estrategia.realizarAvaliacao();
    }
}
