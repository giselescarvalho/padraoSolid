package facade;

public class CepService {
    private static CepService instancia = new CepService();

    private CepService(){
        super();

    }

    public static CepService getInstancia(){
        return instancia;
    }

    public String recuperaCidade(String cep){
        return "Belorizonte";
    }

    public String recuperaEstado(String cep){
        return "SP";
    }
}
