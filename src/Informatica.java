public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            double seguroEletronicos, int quantidadeMaxFuncionarios) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaxFuncionarios);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica [nome=" + nome + ", seguroEletronicos=" + seguroEletronicos + ", quantidadeFuncionarios="
                + quantidadeFuncionarios + ", salarioBaseFuncionario=" + salarioBaseFuncionario + ", endereco="
                + endereco.toString() + ", dataFundacao=" + dataFundacao.toString() + "]";
    }
}
