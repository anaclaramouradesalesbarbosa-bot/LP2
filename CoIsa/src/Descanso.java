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
        double estado = horasDeDescanso / numerosDeSemana;
        if (estado >= 26){
            return "descansado";
        }
        else{
            return "cansado";
        }
    }
}
