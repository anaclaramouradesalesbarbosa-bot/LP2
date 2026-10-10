/**
 * Representação da rotina de descanso. Para nosso aluno, ele deve descansar 26 horas por semana, ou mais, para se considerar descansado.Considere que o aluno começa cansado, caso não tenha registrado horas de descanso ou número de semanas
 *
 * @author Ana Clara Moura de Sales Barbosa
 */


public class Descanso {

    /**
     * Define o número de horas de descanso.
     *
     */

    private int horasDeDescanso;
    /**
     * Número de semanas na rotina do aluno. No formato X, em que X é a quantidade de semanas.
     */

    private int numerosDeSemana;

    /**
     * Define/Registra o número de horas de descanso acumuladas.
     *
     * @param horasDeDescanso a quantidade de horas descansadas a ser registrada
     */

    public void defineHorasDescanso (int horasDeDescanso){
        this.horasDeDescanso = horasDeDescanso;
    }

    /**
     * Define/Registra o número de semanas acompanhadas.
     *
     * @param numerosDeSemana o número de semanas a ser registrado
     */

    public void defineNumeroSemanas(int numerosDeSemana){
        this.numerosDeSemana = numerosDeSemana;
    }

    /**
     * Retorna a String que representa se o aluno está cansado ou descansado. A representação segue o formato "cansado"-para os alunos que tiveram menos de 26 horas de descanso por semana- e "descansado" -para os alunos que tiverem mais de 26 horas de descanso por semana_.
     *
     * @return a representação em String do descanso.
     */

    public String getStatusGeral() {
        if (numerosDeSemana != 0) {
            double estado = horasDeDescanso / numerosDeSemana;
            if(estado < 26){
                return "cansado";
            }
            else{
                return "descansado";
            }
        }
        else{
            return "cansado";
        }
    }
}
