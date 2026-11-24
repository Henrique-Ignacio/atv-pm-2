package pm_prova2_m;

import pm_prova2_m.Aluguel;

public class Van {
    private int qtdPassageiros;
    private bool Inspecao;
    private Aluguel Aluguel;
    private int Nota;

    public Moto(int qtdPassageiros, bool Inspecao) {
        this.qtdPassageiros = 4;
    }
    public void exibirDetalhes()
    {
        this.exibirDetalhes();
    };

    public boolean possuiSeguroEspecial(){
        return this.Aluguel.possuiSeguroIncluso();
    };
    public void avaliar(int nota){
        this.Nota = nota;
    }
        public void realizarInspecao(){
        this.Inspecao = true;
    }
}
