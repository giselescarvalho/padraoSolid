package facade;

public class CrmService {
    //construtor privado - pra garantir que consome os metodos estaticos
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("\n-------------------\n");
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println("\n-------------------\n");
    }
}
