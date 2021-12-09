package classe;

public class Data {
    int dia = 1;
    int mes = 1;
    int ano = 1970;

    Data(){}

    Data(int diaInicial, int mesInicial, int anoInicial){
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
