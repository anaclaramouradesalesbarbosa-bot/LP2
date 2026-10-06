import java.util.*;

public class Disciplina {
    private String nomedadisciplina;
    private int horasdeestudo;
    private double[] notas = {0, 0, 0, 0};
    private double media;

    public Disciplina (String nomeDisciplina){
        this.nomedadisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horasdeestudo){
        this.horasdeestudo += horasdeestudo;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }
    public boolean aprovado(){
        this.media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        if (media >= 7){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return nomedadisciplina + " " + horasdeestudo + " " + media + " " + Arrays.toString(notas);
    }
}
