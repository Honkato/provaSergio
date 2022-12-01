package components;

public class Menu {
    FuncoesUsuais f = new FuncoesUsuais();
    Storage s = new Storage();

    public void iniciar() {
        char fim;
        while (true) {
            int escolha = f.pegarInt(0, 3,
                    "O QUE DESEJA FAZER?\n" +
                            "[1] - Calculadora Normal\n" +
                            "[2] - Calculadora Cientifica\n" +
                            "[3] - Calculadora Financeira\n" +
                            "[0] - Sair");
            if (escolha == 1)
            {
                fim = menuNormal();
            }
            else if (escolha == 2)
            {
                fim = menuCientifica();
            }
            else if (escolha == 3)
            {
                fim = menuFinanceira();
            }
            else
            {
                if (f.simNao("Deseja mesmo Sair?")) {
                    break;
                }
                continue;
            }

            for (int i = 0; i <15; i++)
            {
                System.out.print(fim);
            }
            System.out.println();

        }
    }

    private float veriStor(){
        return s.getArmazem(f.pegarStr("Digite um numero: ").replace(",","."));
    }
    private float veriStor(String pergunta){
        return s.getArmazem(f.pegarStr(pergunta));
    }
    private char menuNormal(){
        Calculadora c = new Calculadora();
        while (true) {
            int escolha = f.pegarInt(0, 6,
                    "SEJA BEM VINDO A CALCULADORA BÁSICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - Somar\n" +
                            "[2] - Subtrair\n" +
                            "[3] - Multiplicar\n" +
                            "[4] - Dividir\n" +
                            "[0] - Trocar calculadora"
            );
            float result = 0;
            if (escolha == 1)
            {
                System.out.println("Digite 2 numeros para [somar]");
                result = c.somar(veriStor(), veriStor());
            }
            else if (escolha == 2)
            {
                System.out.println("Digite 2 numeros para [subtrair]");
                result = c.subtrair(veriStor(), veriStor());
            }
            else if (escolha == 3)
            {
                System.out.println("Digite 2 numeros para [multiplicar]");
                result = c.multiplicar(veriStor(), veriStor());
            }
            else if (escolha == 4)
            {
                System.out.println("Digite 2 numeros para [dividir]");
                result = c.dividir(veriStor(), veriStor());
            }
            else
            {
                break;
            }

            System.out.println("O resultado foi: "+ result);
            if (result != 0) {
                s.setArmazem(result);
            }
        }
        return '-';
    }
    private char menuCientifica(){
        Cientifica cc = new Cientifica();
        while (true) {
            int escolha = f.pegarInt(0, 10,
                    "SEJA BEM VINDO A CALCULADORA CIENTIFICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - Potenciacao\n" +
                            "[2] - Raiz Quadrada\n" +
                            "[3] - Raiz de X\n" +
                            "[4] - Seno\n" +
                            "[5] - Cosseno\n" +
                            "[6] - Tangente\n" +
                            "[7] - Secante\n" +
                            "[8] - Cossecante\n" +
                            "[9] - Cotangente\n" +
                            "[10] - Log de base 10\n" +
                            "[0] - Trocar calculadora"
            );
            float result = 0;
            //float graus = 0;
            if (escolha == 1)
            {
                System.out.println("Digite os valores da base e expoente: ");
               result = cc.potenciacao(
                        veriStor("Digite a base: "),
                        veriStor("digite o expoente: "));
            }
            else if (escolha == 2)
            {
                System.out.println("Digite 2 valores para calcular a [raiz quadrada]");
                    result = cc.raiz(veriStor("Digite o radicando: "));
            }else if (escolha == 3)
            {
                System.out.println("Digite 2 valores para calcular a [raiz de X]");
                    result = cc.raiz(
                            veriStor("Digite o radicando: "),
                            veriStor("Digite o indice da raiz: "));
            }
            else if (escolha == 4)
            {
                System.out.println("Digite o grau para calcular o [seno]: ");
                        result = cc.seno(
                                veriStor("Insira o numero em graus: "));
            }
            else if (escolha == 5)
            {
                System.out.println("Digite o grau para calcular o [cosseno]: ");
                result = cc.cosseno(
                        veriStor("Insira o numero em graus: "));
            }
            else if (escolha == 6)
            {
                System.out.println("Digite o grau para calcular a [tangente]: ");
                result = cc.tangente(
                        veriStor("Insira o numero em graus: "));
            }
            else if (escolha == 7)
            {
                System.out.println("Digite o grau para calcular o [secante]: ");
                result = cc.secante(
                        veriStor("Insira o numero em graus: "));
            }
            else if (escolha == 8)
            {
                System.out.println("Digite o grau para calcular o [cosecante]: ");
                result = cc.cosecante(
                        veriStor("Insira o numero em graus: "));
            }
            else if (escolha == 9)
            {
                System.out.println("Digite o grau para calcular a [cotangente]: ");
                result = cc.cotangente(
                        veriStor("Insira o numero em graus: "));
            }
            else if (escolha == 10)
            {
                System.out.println("Digite o numero para calcular o [logaritmo base 10]: ");
                result = cc.logaritmo(
                        veriStor("Digite o numero: "));
            }
            else
            {
                break;
            }
            System.out.println("O resultado foi: "+ result);
            if (result != 0)
            {
                s.setArmazem(result);
            }
        }
        return '-';

    }

    private char menuFinanceira(){
        Financeira cf = new Financeira();
        while (true) {
            int escolha = f.pegarInt(0, 5,
                    "SEJA BEM VINDO A CALCULADORA FINANCEIRA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - Calcular Juros Simples\n" +
                            "[2] - Calcular Juros Composto\n" +
                            "[3] - Calcular o (log, para encontrar o tempo)\n" +
                            "[0] - Trocar calculadora"
            );
            float result = 0;
            float capitalInicial = 0;
            if (escolha == 1)
            {
                System.out.println("Digite 3 valores para calcular [Juros Simples]");
                capitalInicial = veriStor("Digite o Capital Inicial: ");
                result = cf.jurosSimples(
                        capitalInicial,
                        veriStor("Digite a Taxa de Juros (ex: 30):"),
                        veriStor("Digite o tempo em X:"));
                System.out.println("Valor Total: "+(capitalInicial+result));
            }
            else if (escolha == 2)
            {
                System.out.println("Digite 3 valores para calcular [Juros Composto]");
                capitalInicial = veriStor("Digite o Capital Inicial: ");
                result = cf.jurosCompostos(
                        capitalInicial,
                        veriStor("Digite a Taxa de Juros (ex: 30% -> 30):"),
                        veriStor("Digite o tempo em X:"));
                System.out.println("Valor Total: "+(result-capitalInicial));
            }
            else if (escolha == 3)
            {
                System.out.println("Digite 3 valores para calcular [Tempo]");
                result = cf.logJuros(
                        veriStor("Digite o Capital Inicial: "),
                        veriStor("Digite a Taxa de Juros: "),
                        veriStor("Digite o Montante: "));
            }
            else
            {
                break;
            }
            System.out.println("Valor foi de: "+ result);
            if (result != 0)
            {
                s.setArmazem(result);
            }
        }
        return '-';
    }

}
