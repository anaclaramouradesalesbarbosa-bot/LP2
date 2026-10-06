public class RegistroResumos {
    private Resumo[] resumos;
    private int cont;

    public RegistroResumos(int qtd){
        resumos = new Resumo[qtd];
    }
    public void adiciona( String tema, String conteudo){
        resumos[cont] = new Resumo(tema , conteudo);
        if (cont < resumos.length) {
            cont++;
        }
    }
    public String [] pegaResumos() {
        String [] resumosexistentes = new String[cont];
        for(int i = 0; i < cont; i++){
            resumosexistentes[i] = resumos[i].toString();
        }
        return resumosexistentes;
    }
    public String imprimeResumos() {
        String frase = "- " + cont + " resumo(s) cadastrado(s)" + "\n" + "- ";
        for (int i = 0; i < cont; i++) {
            if (i == cont -1){
                frase += resumos[i].getTema();
            }
            else{
                frase += resumos[i].getTema() + " | ";
            }
        }
        return frase;
    }
    public int conta(){
        return cont;
    }
    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
