public class RegistroTempoOnline {

    private String nomedadisciplina;
    private int tempoinvestidoonline;
    private int tempoesperado;

    public RegistroTempoOnline (String nomeDisciplina){
        this.nomedadisciplina = nomeDisciplina;
        this.tempoesperado = 120;
    }
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado){
        this.nomedadisciplina = nomeDisciplina;
        this.tempoesperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempoinvestidoonline){
        this.tempoinvestidoonline += tempoinvestidoonline;
    }
    public boolean atingiuMetaTempoOnline (){
        if (tempoinvestidoonline >= tempoesperado){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return nomedadisciplina + " " + tempoinvestidoonline + "/" + tempoesperado;
    }
}
