public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
           System.out.println("Data inválida. Definindo a data como padrão 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    public boolean validarData(int dia, int mes, int ano){
        // Verificar se o mês está dentro do intervalo válido (1 a 12)
        if (mes < 1 || mes > 12) {
            return false;
        }

        //verificar se o dia está dentro do mês de acordo com o mês(Se tem 30, 31 ou em fevereiro se bissexto ou não)
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return (dia >= 1 && dia <= 31);
            case 4: 
            case 6: 
            case 9: 
            case 11:
                return (dia >= 1 && dia <= 30);
            case 2:
                if (verificaAnoBissexto()) {
                    return (dia >= 1 && dia <= 29);
                } else {
                    return (dia >= 1 && dia <= 28);
                }
            default:
                return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public boolean verificaAnoBissexto(){
        if (ano % 4 != 0) {
            return false;
        } else if (ano % 400 == 0) {
            return true;
        } else return ano % 100 != 0;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
