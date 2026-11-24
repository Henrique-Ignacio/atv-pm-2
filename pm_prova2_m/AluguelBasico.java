package pm_prova2_m;

import pm_prova2_m.Aluguel;
import pm_prova2_m.Veiculo;

public class AluguelBasico extends Aluguel {
    private int KmPorDia;
    private bool Seguro;
    private Veiculo veiculo;
    
    public Aluguel(int KmPorDia, bool Seguro) {
        this.KmPorDia = 100;
        this.Seguro = false;
    }
    public void exibirDetalhes()
    {
        this.veiculo.exibirDetalhes();
    };

    public boolean possuiSeguroIncluso(){
        return this.Seguro;
    };
}
