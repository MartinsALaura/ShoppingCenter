public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao [nome=" + nome + ", dataAlvara=" + dataAlvara + ", quantidadeFuncionarios="
                + quantidadeFuncionarios + ", salarioBaseFuncionario=" + salarioBaseFuncionario + ", endereco="
                + endereco.toString() + ", dataFundacao=" + dataFundacao.toString() + "]";
    }
}
