package components;

public class Cientifica extends Calculadora {
    // Calc científica é raiz quadrada x raiz y, x elevado y, sen, cos, tan, cotan, log,
    // fazer polimorfismo na raiz

     protected float potenciacao (float BasePot,float Expoente) {  //X elevado a Y
        double ValorPotenciacao = Math.pow(BasePot, Expoente);
         if (Expoente == 0)
             ValorPotenciacao = 1;
         System.out.println("Todo valor elevado a zero o resultado e 1\n");
         return (float) ValorPotenciacao;
    }

    protected float raiz (float radicando,float indice) {    // X raiz Y
         return (float) Math.pow(radicando, (1 / indice));
    }
    protected float raiz (float radicando) {    //
        return (float) Math.pow(radicando, (1 / 2.0));    //
    }
    protected float seno(float graus) {        //  valor em graus
         double radianos = Math.toRadians(graus);    //converter para radianos
         double ValorSeno = Math.sin(radianos);      //math.sin so funciona em radianos
         return (float) ValorSeno;      // devolve valor do seno
    }
    protected float cosseno(float graus) {
        double radianos = Math.toRadians(graus);
        double ValorCosseno = Math.cos(radianos);
        return (float) ValorCosseno;
    }
    protected float tangente(float graus) {
        double radianos = Math.toRadians(graus);
        double ValorTangente = Math.tan(radianos);
        return (float) ValorTangente;
    }
    protected float cosecante(float graus) {        //  valor em graus
        double radianos = Math.toRadians(graus);    //converter para radianos
        double ValorSeno = Math.pow(Math.sin(radianos), -1);      //math.sin so funciona em radianos
        return (float) ValorSeno;      // devolve valor do seno
    }
    protected float secante(float graus) { //TODO: while para diminuir ate um numero menor que 360 e dai calcular
        double radianos = Math.toRadians(graus);
        double ValorCosseno = Math.pow(Math.cos(radianos), -1);
        return (float) ValorCosseno;
    }
    protected float cotangente(float graus){
        double radianos = Math.toRadians(graus);
        double ValorCotangente = Math.pow(Math.tan(radianos), -1);
        return (float) ValorCotangente;
    }

    protected float logaritmo(double logaritmando) {
        double ResultadoLog = Math.log10(logaritmando);
        return (float) ResultadoLog;
    }
}
