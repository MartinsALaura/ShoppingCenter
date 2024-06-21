import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    public Shopping(String nome, Endereco endereco, int qtdMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaxLojas];
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja l){
        for(int i = 0;  i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = l;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0;  i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome() == nomeLoja){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;

        switch (tipo) {
            case "Cosmético":
                for (Loja loja : lojas)
                    if(loja!= null && loja instanceof Cosmetico)
                        count++;
                break;
            case "Vestuário":
                for (Loja loja : lojas)
                    if(loja!= null && loja instanceof Vestuario)
                        count++;
                break;
            case "Bijuteria":
                for (Loja loja : lojas)
                    if(loja!= null && loja instanceof Bijuteria)
                        count++;
                break;
            case "Alimentação":
            for (Loja loja : lojas)
                if(loja!= null && loja instanceof Alimentacao)
                    count++;
            break;
            case "Informática":
                for (Loja loja : lojas)
                    if(loja!= null && loja instanceof Informatica)
                        count++;
                break;
            default:
                count = -1;
                break;
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaSeguroMaisCaro = null;
        for(Loja loja : lojas){
            if(loja != null && loja instanceof Informatica){
                if(lojaSeguroMaisCaro == null || ((Informatica)loja).getSeguroEletronicos() > ((Informatica)lojaSeguroMaisCaro).getSeguroEletronicos())
                    lojaSeguroMaisCaro = (Informatica)loja;
            }
        }
        return lojaSeguroMaisCaro;
    }
    
    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }
}
