package pm_prova2_m;

import pm_prova2_m.Aluguel;
import pm_prova2_m.Veiculo;

public class AluguelPremium extends Aluguel {
    private bool Seguro;
    private Veiculo veiculo;

    
    public AluguelPremium(int KmPorDia, bool Seguro) {
        this.Seguro = true;
    }
    public void exibirDetalhes()
    {
        this.veiculo.exibirDetalhes();
    };

    public boolean possuiSeguroIncluso(){
        return this.Seguro;
    };
}
