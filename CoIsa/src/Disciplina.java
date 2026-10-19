import java.util.*;

/**
 * Representação de uma disciplina cursada pelo aluno, responsável por gerenciar o nome da disciplina, as horas dedicadas aos estudos, o cadastro de notas e a verificação do status de aprovação.
 *
 *
 * @author Ana Clara Moura de Sales Barbosa
 */


public class Disciplina {
    /**
     * O nome da disciplina.
     */
    private String nomedadisciplina;
    /**
     * O total acumulado de horas dedicadas ao estudo desta disciplina.
     */
    private int horasdeestudo;
    /**
     * Array que armazena as 4 notas da disciplina.
     */
    private double[] notas = {0, 0, 0, 0};
    /**
     * Array que armazena os pesos de cada nota (para média ponderada).
     */
    private int[] pesos;
    /**
     * A média calculada a partir das notas da disciplina.
     */
    private double media;

    /**
     * Constrói uma disciplina a partir de seu nome.
     * Por padrão, a disciplina inicia com zero horas de estudo e com notas Zeradas.
     *
     * @param nomedadisciplina o nome da disciplina
     */
    public Disciplina (String nomedadisciplina){
        this.nomedadisciplina = nomedadisciplina;
        this.notas = new double[4];
    }
    /**
     * Constrói uma disciplina com quantidade de notas personalizada.
     *
     * @param nomedadisciplina o nome da disciplina
     * @param numNotas a quantidade de notas
     */
    public Disciplina(String nomedadisciplina, int numNotas) {
        this.nomedadisciplina = nomedadisciplina;
        this.notas = new double[numNotas];
    }
    /**
     * Constrói uma disciplina com quantidade de notas personalizada.
     *
     * @param nomedadisciplina o nome da disciplina
     * @param numNotas a quantidade de notas
     */
    public Disciplina(String nomedadisciplina, int numNotas, int[] pesos) {
        this.nomedadisciplina = nomedadisciplina;
        this.notas = new double[numNotas];
        this.pesos = pesos;
    }
    /**
     * Cadastra e acumula horas de estudo dedicadas à disciplina.
     *
     * @param horasdeestudo a quantidade de horas a ser adicionada
     */
    public void cadastraHoras(int horasdeestudo){
        this.horasdeestudo += horasdeestudo;
    }
    /**
     * Cadastra uma nota em uma posição específica (de 1 a 4).
     *
     * @param nota a posição da nota (1, 2, 3 ou 4)
     * @param valorNota o valor numérico da nota cadastrada
     */
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }
    /**
     * Calcula a média das notas e verifica se o aluno foi aprovado.
     * O aluno é considerado aprovado se a média for maior ou igual a 7.0.
     *
     * @return true se o aluno for aprovado, ou false caso contrário
     */
    public boolean aprovado(){
        if (this.pesos == null) {
            // Média Aritmética Simples
            double soma = 0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            this.media = soma / notas.length;
        } else {
            // Média Ponderada
            double somaNotasComPeso = 0;
            int somaPesos = 0;
            for (int i = 0; i < notas.length; i++) {
                somaNotasComPeso += notas[i] * pesos[i];
                somaPesos += pesos[i];
            }
            this.media = somaNotasComPeso / somaPesos;
        }

        if (this.media >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Retorna a representação em String da disciplina.
     * A representação contém o nome da disciplina, horas de estudo, média e as notas.
     *
     * @return a representação em String da disciplina
     */
    @Override
    public String toString(){
        return nomedadisciplina + " " + horasdeestudo + " " + media + " " + Arrays.toString(notas);
    }
}
