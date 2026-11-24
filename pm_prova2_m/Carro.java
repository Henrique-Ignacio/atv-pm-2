package pm_prova2_m;

import pm_prova2_m.Aluguel;
import pm_prova2_m.Veiculo;

public class Carro extends Veiculo {
    private int QtdPortas;
    private Aluguel Aluguel;
    private int Nota;

    public Carro(int QtdPortas, bool Inspecao) {
        this.QtdPortas = 4;
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
}
