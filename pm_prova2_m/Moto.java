package pm_prova2_m;

import pm_prova2_m.Aluguel;

public class Moto extends veiculo {
    private int Cilindradas;
    private bool Inspecao;
    private Aluguel Aluguel;
    
    public Moto(int QtdPortas, bool Inspecao) {
        this.QtdPortas = 4;
    }
    public void exibirDetalhes()
    {
        this.exibirDetalhes();
    };

    public boolean possuiSeguroEspecial(){
        return this.Aluguel.possuiSeguroIncluso();
    };
        public void realizarInspecao(){
        this.Inspecao = true;
    }
}
