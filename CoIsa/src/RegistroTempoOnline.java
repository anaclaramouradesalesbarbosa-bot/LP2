/**
 * Representação do registo do tempo online dedicado por um aluno a uma disciplina remota.
 * Gerencia a quantidade de horas investidas online e verifica se a meta de tempo esperado foi atingida.
 *
 * @author Ana Clara Moura de Sales Barbosa
 */
public class RegistroTempoOnline {
    /**
     * O nome da disciplina remota.
     */
    private String nomedadisciplina;
    /**
     * O total acumulado de horas investidas online pelo aluno.
     */
    private int tempoinvestidoonline;
    /**
     * A quantidade de horas online esperada para a disciplina.
     */
    private int tempoesperado;
    /**
     * Constrói o registo de tempo online de uma disciplina assumindo o tempo esperado padrão de 120 horas.
     *
     * @param nomedadisciplina o nome da disciplina
     */

    public RegistroTempoOnline (String nomedadisciplina){
        this.nomedadisciplina = nomedadisciplina;
        this.tempoesperado = 120;
    }
    /**
     * Constrói o registo de tempo online de uma disciplina especificando o tempo esperado.
     *
     * @param nomedadisciplina o nome da disciplina
     * @param tempoOnlineEsperado a quantidade de horas esperada para a disciplina
     */
    public RegistroTempoOnline (String nomedadisciplina, int tempoOnlineEsperado){
        this.nomedadisciplina = nomedadisciplina;
        this.tempoesperado = tempoOnlineEsperado;
    }
    /**
     * Adiciona e acumula tempo online dedicado à disciplina.
     *
     * @param tempoinvestidoonline a quantidade de horas a ser adicionada
     */

    public void adicionaTempoOnline(int tempoinvestidoonline){
        this.tempoinvestidoonline += tempoinvestidoonline;
    }
    /**
     * Verifica se o tempo investido online atingiu ou ultrapassou a meta de tempo esperado.
     *
     * @return true se o tempo investido for maior ou igual ao tempo esperado, false caso contrário
     */
    public boolean atingiuMetaTempoOnline (){
        if (tempoinvestidoonline >= tempoesperado){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Retorna a representação em String do registo de tempo online no formato "nome - investido/esperado".
     *
     * @return a representação em String do tempo online
     */
    @Override
    public String toString(){
        return nomedadisciplina + " " + tempoinvestidoonline + "/" + tempoesperado;
    }
}
