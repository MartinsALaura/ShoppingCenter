public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            boolean produtosImportados, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario [nome=" + nome + ", produtosImportados=" + produtosImportados + ", quantidadeFuncionarios="
                + quantidadeFuncionarios + ", salarioBaseFuncionario=" + salarioBaseFuncionario + ", endereco="
                + endereco.toString() + ", dataFundacao=" + dataFundacao.toString() + "]";
    }
}
