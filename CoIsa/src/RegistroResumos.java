public class RegistroResumos {
    private Resumo[] resumos;
    private int cont;

    public RegistroResumos(int qtd){
        resumos = new Resumo[qtd];
    }
    public void adiciona( String tema, String conteudo){
        resumos[cont] = new Resumo(tema , conteudo);
        cont++;
    }
    public String [] pegaResumos() {
        String [] resumosexistentes = new String[cont];
        for(int i = 0; i < cont; i++){
            resumosexistentes[i] = resumos[i].toString();
        }
    }
    public String imprimeResumos() {
        return "-" + cont + "resumo(s) cadastrado(s)" + "\n" +
    }
    public int conta(){
        return ;
    }
    public boolean temResumo(String tema){

    }
}
