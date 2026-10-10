/**
 * Representação de um resumo individual contendo um tema e o seu conteúdo associado[cite: 6].
 *
 * @author Ana Clara Moura de Sales Barbosa
 */
public class Resumo {
    /**
     * O tema do resumo[cite: 6].
     */
    private String tema;
    /**
     * O texto ou conteúdo detalhado do resumo[cite: 6].
     */
    private String conteudo;
    /**
     * Constrói um resumo a partir do seu tema e conteúdo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo detalhado do resumo
     */

    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }
    /**
     * Retorna a representação em String do resumo no formato "tema: conteudo"[cite: 6].
     *
     * @return a representação em String do resumo
     */
    @Override
    public String toString(){
        return tema + ": " + conteudo;
    }
    /**
     * Retorna o tema do resumo[cite: 6].
     *
     * @return o tema em String
     */
    public String getTema(){
         return tema;
    }
    /**
     * Retorna o conteúdo do resumo.
     *
     * @return o texto do conteúdo
     */
    public String getConteudo (){
        return conteudo;
    }
}
