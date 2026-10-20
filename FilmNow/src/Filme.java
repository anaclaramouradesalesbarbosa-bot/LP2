import java.util.Objects;

public class Filme {
    private String nome;
    private int anoLancamento;
    private String local;
    private boolean statusHot;

    public Filme(String nome, int anoLancamento, String local){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.local = local;
        statusHot = false;
    }
    public String getNome(){
        return nome;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public String getLocal(){
        return local;
    }
    @Override
    public String toString(){
        return nome + "," + anoLancamento + "\n" + local;
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome, anoLancamento);
    }
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Filme filme = (Filme) o;
        return Objects.equals(nome, filme.nome) && Objects.equals(anoLancamento, filme.anoLancamento);
    }
    public void setStatusHot(boolean novoStatus){
        statusHot = novoStatus;
    }
    public boolean getStatusHot(){
        return statusHot;
    }
}
