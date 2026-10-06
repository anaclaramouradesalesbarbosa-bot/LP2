/**
 * Representação da rotina de descanso. Para nosso aluno, ele deve descansar 26 horas por semana, ou mais, para se considerar descansado.Considere que o aluno começa cansado, caso não tenha registrado horas de descanso ou número de semanas
 *
 * @author Ana Clara Moura de Sales Barbosa
 */


public class Descanso {

    /**
     * Horas de descanso do aluno. No formato X, em que X é a quantidade de horas.
     */

    private int horasDeDescanso;
    /**
     * Número de semanas na rotina do aluno. No formato X, em que X é a quantidade de semanas.
     */

    private int numerosDeSemana;

    /**
     * Registra as horas de descanso.
     *
     */

    public void defineHorasDescanso (int horasDeDescanso){
        this.horasDeDescanso = horasDeDescanso;
    }

    /**
     * Registra o número de semanas.
     *
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
