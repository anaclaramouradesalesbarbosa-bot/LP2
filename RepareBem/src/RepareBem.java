public class RepareBem {

    private final int MAXTIPOSREPAROS = 100;
    private Reparos[] tiposreparos = new Reparos[MAXTIPOSREPAROS];
    private final int MAXOS = 500;
    private OS[] oss = new OS[MAXOS];
    private int qtdTiposReparos;
    private int qtdOS;

    public RepareBem() {
        qtdTiposReparos = 0;
        qtdOS = 0;
    }

    //    adastrarReparo( id:String, descricao:String, preco:double ):void;
    public void cadastrarReparo(String id, String descricao, double preco){
        if (qtdTiposReparos >= MAXTIPOSREPAROS){
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < qtdTiposReparos; i++){
            if(tiposreparos[i].getId().equals(id)){
                throw new IllegalArgumentException();
            }
        }
        Reparos novoReparo = new Reparos(id, descricao, preco);
        tiposreparos[qtdTiposReparos] = novoReparo;
        qtdTiposReparos++;
    }

//● reajustarPrecoReparo( idReparo:String, percentual:double ):void
    public void reajustarPrecoReparo(String idReparo, double percentual){
        boolean encontrado = false;

        for(int i = 0; i < qtdTiposReparos; i++){
            if(tiposreparos[i].getId().equals(idReparo)){
                double precoAtual = tiposreparos[i].getPreco();
                double novoPreco = precoAtual * (1 + (percentual / 100));
                tiposreparos[i].setPreco(novoPreco);
                encontrado = true;
                break;
            }
        }
        if(encontrado == false){
            throw new IllegalArgumentException();
        }
    }
//● cadastrarOrdemDeServico( cliente:String, telefone:String, roupa:String ):int
    public int cadastrarOrdemDeServico(String cliente, String telefone, String roupa){
        if (qtdOS >= MAXOS){
            throw new IllegalArgumentException();
        }
        OS novaOs = new OS(cliente, telefone, roupa);
        oss[qtdOS] = novaOs;
        qtdOS++;
        return qtdOS;
    }
//    ● exibirOrdemDeServico( idOS:int ):String
    public String exibirOrdemDeServico(int idOS){
        if(idOS <= 0 || idOS > qtdOS || oss[idOS - 1] == null){
            throw new IllegalArgumentException();
        }
        return "#" + idOS +  "; " + oss[idOS - 1].toString();
    }
//● incluirReparoOrdemDeServico( idOS:int, idReparo:String ): void
    public void incluirReparoOrdemDeServico(int idOS, String idReparo){
        if(idOS <= 0 || idOS > qtdOS || oss[idOS - 1] == null){
            throw new IllegalArgumentException();
        }
       Reparos reparoencontrado = null;
        for(int i = 0; i < qtdTiposReparos; i++){
            if(tiposreparos[i] != null && tiposreparos[i].getId().equals(idReparo)){
                reparoencontrado = tiposreparos[i];
                break;
            }
        }
        if(reparoencontrado == null){
            throw new IllegalArgumentException();
        }

        oss[idOS - 1].addReparo(reparoencontrado);
    }
//● mudarStatusOrdemDeServico( idOS:int, status:String ): void
    public void mudarStatusOrdemServico(int idOS, String Status){
        if(idOS <= 0 || idOS > qtdOS || oss[idOS - 1] == null){
            throw new IllegalArgumentException();
        }
        oss[idOS - 1].setStatus(Status);
    }
//● obterValorOrdemServico( idOS:int ):double
    public double obterValorOrdemServico(int idOS){
        if(idOS <= 0 || idOS > qtdOS || oss[idOS - 1] == null){
            throw new IllegalArgumentException();
        }
        return oss[idOS - 1].getPrecoTotal();
    }
//● listarOrdemDeServico( status:String ): String
    public String listarOrdemDeServico(String Status){
        boolean encontrado = false;
        String resultado = "Ordens de Serviço - " + Status;
        for(int i = 0; i < qtdOS; i++){
            if(oss[i].getStatus().equals(Status)){
                resultado +=  "\n" + "#" + (i + 1) + "; " + oss[i].toString();
                encontrado = true;
            }
        }
        if(encontrado == false){
            return "Não há ordens de serviço do tipo " + Status;
        }
        return resultado;
    }
//● listarOrdensDeServico( ):String //Serão listadas todas as OS cadastradas
    public String listarOrdensDeServico(){
        String resultado = "Ordens de serviço: ";
        for(int i = 0; i < qtdOS; i++){
            resultado +=  "\n" + "#" + (i + 1) + "; " + oss[i].toString();
        }
        return resultado;
    }

}





