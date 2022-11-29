package components;

public class Calculadora {
    FuncoesUsuais f = new FuncoesUsuais();
    protected float somar (float a, float b){
        return a +b;
    }
    protected float subtrair (float a, float b){
        return a -b;
    }
    protected float multiplicar (float a, float b){
        return a *b;
    }
    protected float dividir (float a, float b){
        if (b == 0){
            b = 1;
            System.out.println("B igual a 0, trocado para 1");
        }
        return a /b;
    }
}
