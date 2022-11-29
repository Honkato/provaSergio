package components;

public class Menu {
    FuncoesUsuais f = new FuncoesUsuais();
    Storage s = new Storage();

    public void iniciar() {
        while (true) {
            int escolha = f.pegarInt(0, 3,
                    "O QUE DESEJA FAZER?\n" +
                            "[1] - Calculadora Normal\n" +
                            "[2] - Calculadora Cientifica\n" +
                            "[3] - Calculadora Financeira\n" +
                            "[0] - Sair");
            if (escolha == 1) {
                menuNormal();
            } else if (escolha == 2) {
                menuCientifica();
            } else if (escolha == 3) {
                menuFinanceira();
            }else {
                break;
            }
        }
    }

    private float veriStor(){
        return s.getArmazem(f.strComLimite(1));
    }
    private void menuNormal(){
        Calculadora c = new Calculadora();
        while (true) {
            int escolha = f.pegarInt(0, 4,
                    "SEJA BEM VINDO A CALCULADORA BÁSICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - Somar\n" +
                            "[2] - Subtrair\n" +
                            "[3] - Multiplicar\n" +
                            "[4] - Dividir\n" +
                            "[0] - Voltar"
            );
            float result = 0;
            if (escolha == 1) {
                System.out.println("Digite 2 numeros para [somar]");
                result = c.somar(veriStor(), veriStor());
            } else if (escolha == 2) {
                System.out.println("Digite 2 numeros para [subtrair]");
                result = c.subtrair(veriStor(), veriStor());
            } else if (escolha == 3) {
                System.out.println("Digite 2 numeros para [multiplicar]");
                result = c.multiplicar(veriStor(), veriStor());
            } else if (escolha == 4) {
                System.out.println("Digite 2 numeros para [dividir]");
                result = c.dividir(veriStor(), veriStor());
            } else{
                break;
            }
            System.out.println("O resultado foi de: "+ result);
            if (result != 0) {
                s.setArmazem(result);
            }
        }
    }
    private void menuCientifica(){
        Cientifica c = new Cientifica();
        while (true) {
            int escolha = f.pegarInt(0, 4,
                    "SEJA BEM VINDO A CALCULADORA CIENTIFICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - \n" +
                            "[2] - \n" +
                            "[3] - \n" +
                            "[4] - \n" +
                            "[0] - Voltar"
            );
            float result = 0;
            if (escolha == 1){

            } else if (escolha == 2) {

            } else{
                break;
            }
        }
    }

    private void menuFinanceira(){
        Financeira c = new Financeira();
        while (true) {
            int escolha = f.pegarInt(0, 4,
                    "SEJA BEM VINDO A CALCULADORA CIENTIFICA\n" +
                            "O QUE DESEJA FAZER?\n" +
                            "[1] - \n" +
                            "[2] - \n" +
                            "[3] - \n" +
                            "[4] - \n" +
                            "[0] - Voltar"
            );
            float result = 0;
            if (escolha == 1){

            } else if (escolha == 2) {

            } else {
                break;
            }
        }
    }

}
