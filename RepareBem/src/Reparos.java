import java.util.Objects;

public class Reparos {
    private String id;
    private String descricao;
    private Double preco;

    public Reparos(String id, String descricao, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reparos reparos = (Reparos) o;
        return Objects.equals(id, reparos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
