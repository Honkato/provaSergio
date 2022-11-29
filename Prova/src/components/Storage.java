package components;

public class Storage {
    float[] armazenados = {0, 0, 0, 0, 0, 0};
    Storage(){
    }

    FuncoesUsuais f = new FuncoesUsuais();
    void setArmazem(float result){
        boolean s = f.simNao("Deseja armazenar o valor?");
        if (s){
            int a = f.pegarInt(0,5,
                    "Deseja Guardar em qual Slot?\n" +
                            "[0] - SlotQ\n" +
                            "[1] - SlotW\n" +
                            "[2] - SlotE\n" +
                            "[3] - SlotR\n" +
                            "[4] - SlotT\n" +
                            "[5] - SlotY\n"
            );
            armazenados[a] = result;
        }
    }
    float getArmazem(String conta){
        String q = String.valueOf(armazenados[0]);
        String w = String.valueOf(armazenados[1]);
        String e = String.valueOf(armazenados[2]);
        String r = String.valueOf(armazenados[3]);
        String t = String.valueOf(armazenados[4]);
        String y = String.valueOf(armazenados[5]);
        String[] querty = {q, w, e, r, t, y};
        String[] QUERTY = {"Q", "U", "E", "R", "T", "Y"};
        conta = conta.toUpperCase();
        for (int i = 0; i < QUERTY.length; i++) {
            conta = conta.replace(QUERTY[i], querty[i]);
        }
        return Float.parseFloat(conta);
    }
}
