package pm_prova2_m;

import pm_prova2_m.Veiculo;

public class AluguelExecutivo {
    private int KmPorDia;
    private bool Motorista;
    private bool Avaliavel;
    private Veiculo veiculo;
    
    public AluguelExecutivo(int KmPorDia, bool Seguro) {
        this.Seguro = true;
        this.Motorista = true;
        this.Avaliavel = true;
    }
    public void exibirDetalhes()
    {
        this.veiculo.exibirDetalhes();
    };

    public boolean possuiSeguroIncluso(){
        return this.Seguro;
    };
}
