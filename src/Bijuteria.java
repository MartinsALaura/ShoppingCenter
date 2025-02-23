public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria [nome=" + nome + ", metaVendas=" + metaVendas + ", quantidadeFuncionarios="
                + quantidadeFuncionarios + ", salarioBaseFuncionario=" + salarioBaseFuncionario + ", endereco="
                + endereco.toString() + ", dataFundacao=" + dataFundacao.toString() + "]";
    }

    
}
