package oo.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velAtual = 0;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if(velAtual + delta > VELOCIDADE_MAXIMA){
            velAtual = VELOCIDADE_MAXIMA;    
        } else{
            this.velAtual += delta;
        }        
    }

    void frear(){
        if(this.velAtual >= 5){
            this.velAtual -= 5;
        } else {
            this.velAtual = 0;
        }
    }
}
