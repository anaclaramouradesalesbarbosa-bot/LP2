public class OS {
    private String cliente;
    private String telefone;
    private String roupa;
    private final int MAXREPAROS = 10;
    private Reparos[] reparos = new Reparos[MAXREPAROS];
    private String status;
    private double precoTotal;
    private int qtdDeReparos;

    public OS(String cliente, String telefone, String roupa) {
        this.cliente = cliente;
        this.telefone = telefone;
        this.roupa = roupa;
        this.precoTotal = 0;
        this.qtdDeReparos = 0;
        this.status = "Não inicializada";
    }

    public String getCliente() {
        return cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRoupa() {
        return roupa;
    }

    public String getStatus() {
        return status;
    }

    public Reparos[] getReparos() {
        return reparos;
    }

    public double getPrecoTotal() {
        double total = 0;
        for(int i = 0; i < qtdDeReparos; i++){
            total += reparos[i].getPreco();
        }
        return total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addReparo(Reparos novoReparo){
        if(qtdDeReparos < MAXREPAROS){
            reparos[qtdDeReparos] = novoReparo;
            qtdDeReparos += 1;
        }
    }

    public int getQtdDeReparos() {
        return qtdDeReparos;
    }

    @Override
    public String toString() {
        return "cliente: " + cliente + "; roupa: " + roupa + "; reparos: " + qtdDeReparos + "; total: R$" + getPrecoTotal();
    }

}
