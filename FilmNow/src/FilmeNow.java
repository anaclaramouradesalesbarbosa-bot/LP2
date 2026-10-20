public class FilmeNow {
    private Filme[] filmes = new Filme[100];
    private Filme[] filmesHot = new Filme[10];

    public FilmeNow(){

    }
    public String addFilme(int iFilme, String nome, int anoLancamento, String local){
        if (iFilme < 1 || iFilme > 100){
            return "POSIÇÃO INVÁLIDA";
        }
        if (nome == null || local == null || nome.equals("") || local.equals("")){
            return "FILME INVÁLIDO";
        }
        Filme novoFilme = new Filme(nome, anoLancamento, local);
        for (int i = 0; i< filmes.length; i++){
            if (filmes[i] != null){
                if (filmes[i].equals(novoFilme)){
                    return "FILME JA ADICIONADO";
                }
            }
        }
        filmes[iFilme - 1] = novoFilme;

        return "FILME ADICIONADO COM SUCESSO";
    }
}
