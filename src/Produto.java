public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data dataAtual) {
        if(dataValidade.getAno() < dataAtual.getAno())
            return true;
        else if (dataValidade.getMes() < dataAtual.getMes())
            return true;
        else if (dataValidade.getDia() <= dataAtual.getDia())
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + "DataValidade=" + dataValidade.toString() + "]";
    }
}
