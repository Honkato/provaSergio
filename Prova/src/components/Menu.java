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
                break;
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
                            "[5] - Calculadora Cientifica\n" +
                            "[6] - Calculadora Financeira\n" +
                            "[0] - Voltar ao Menu Principal"
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
            else if (escolha == 5)
            {
                return menuCientifica();
            }
            else if (escolha == 6)
            {
                return menuFinanceira();
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
            int escolha = f.pegarInt(0, 4,
                    "SEJA BEM VINDO A CALCULADORA CIENTIFICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - \n" +
                            "[2] - \n" +
                            "[3] - \n" +
                            "[4] - \n" +
                            "[X] - Calculadora Normal\n" +
                            "[Y] - Calculadora Cientifica\n" +
                            "[0] - Voltar ao Menu Principal"
            );
            float result = 0;
            if (escolha == 1)
            {
                //funcao
            }
            else if (escolha == 2)
            {
                //funcao
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
                    "SEJA BEM VINDO A CALCULADORA CIENTIFICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - Calcular Juros Simples\n" +
                            "[2] - Calcular Juros Composto\n" +
                            "[3] - Calcular o (log, para encontrar o tempo)\n" +
                            "[4] - Calculadora Normal\n" +
                            "[5] - Calculadora Cientifica\n" +
                            "[0] - Voltar ao Menu Principal"
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
            else if (escolha == 4)
            {
                return menuNormal();
            }
            else if (escolha == 5)
            {
                return menuCientifica();
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
