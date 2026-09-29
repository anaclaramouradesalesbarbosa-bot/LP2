public class Descanso {

    private int horasDeDescanso;
    private int numerosDeSemana;

    public void defineHorasDescanso (int horasDeDescanso){
        this.horasDeDescanso = horasDeDescanso;
    }

    public void defineNumeroSemanas(int numerosDeSemana){
        this.numerosDeSemana = numerosDeSemana;
    }

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
