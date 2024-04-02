package facade;

public class Facade {
    public void migrarCliente(String nome, String cep) {

        String cidade = CepService.getInstancia().recuperaCidade(cep);
        String estado = CepService.getInstancia().recuperaCidade(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
