import java.util.Arrays;
import java.util.*;
/**
 * Responsável por gerir um conjunto limitado de resumos de estudos[cite: 6, 7].
 * Permite adicionar, consultar, contar e imprimir os resumos registados[cite: 6, 7].
 *
 * @author Ana Clara Moura de Sales Barbosa
 */
public class RegistroResumos {
    /**
     * Array que armazena os objetos do tipo Resumo.
     */
    private Resumo[] resumos;
    /**
     * Quantidade atual de resumos cadastrados.
     */
    private int cont;
    /**
     * Constrói o registor de resumos definindo a quantidade máxima suportada[cite: 6].
     *
     * @param qtd limite máximo de resumos que podem ser armazenados
     */

    public RegistroResumos(int qtd){
        resumos = new Resumo[qtd];
    }
    /**
     * Adiciona um novo resumo informando o tema e o conteúdo[cite: 6, 7].
     * Caso atinja o limite, substitui o resumo mais antigo sequencialmente[cite: 6].
     *
     * @param tema o tema do resumo a ser adicionado
     * @param conteudo o conteúdo do resumo a ser adicionado
     */
    public void adiciona( String tema, String conteudo){
        resumos[cont] = new Resumo(tema , conteudo);
        if (cont < resumos.length) {
            cont++;
        }
    }
    /**
     * Retorna um array de Strings com a representação textual de todos os resumos cadastrados[cite: 7].
     *
     * @return array de Strings contendo a representação de cada resumo
     */
    public String [] pegaResumos() {
        String [] resumosexistentes = new String[cont];
        for(int i = 0; i < cont; i++){
            resumosexistentes[i] = resumos[i].toString();
        }
        return resumosexistentes;
    }
    /**
     * Gera uma representação formatada com a quantidade e os temas de todos os resumos cadastrados[cite: 7].
     *
     * @return String contendo a lista formatada com os temas dos resumos
     */
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
    /**
     * Retorna a quantidade total de resumos cadastrados no momento[cite: 6, 7].
     *
     * @return o número total de resumos armazenados
     */
    public int conta(){
        return cont;
    }
    /**
     * Verifica se existe algum resumo cadastrado com determinado tema[cite: 6, 7].
     *
     * @param tema o tema a ser pesquisado
     * @return true se o resumo com o tema existir, false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Busca os temas dos resumos que contêm a chave de busca no seu conteúdo.
     * Os temas encontrados são ordenados em ordem alfabética.
     *
     * @param chaveDeBusca o termo a ser pesquisado
     * @return array de Strings com os temas em ordem alfabética
     */
    public String[] busca(String chaveDeBusca) {
        int acumulador = 0;
        String chaveMinuscula = chaveDeBusca.toLowerCase();
        String [] ArrayTemporario = new String[cont];
        for (int i = 0; i < cont; i++) {
            Resumo novoResumo = resumos[i];
            if (novoResumo.getConteudo().toLowerCase().contains(chaveMinuscula)) {
                ArrayTemporario[acumulador] = novoResumo.getTema();
                acumulador++;
            }
        }
        String[] resultado = Arrays.copyOf(ArrayTemporario, acumulador);
        Arrays.sort(resultado);

        return resultado;
    }
}
