package testeindividual

public class Imobiliaria {
    private String imoveis;
    private String clientes;
    private String funcionarios;
}

public class Imovel {
    private String codigo;
    private String endereco;
    private double preco;
    private int numeroDeQuartos;
    private int andar;
    private float area;
}

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    
}

public class Corretor {
    private String nome;
    private String cpf;
    private float salario;
    private String setor;

}

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

}

public class Contrato {
    private String cliente;
    private String imovel;
    private String dataInicio;
    private String dataFim;
  
}

public class Pagamento {
    private double valor;
    private String data;

}

public class avaliacao {
    public int avaliacaoCliente ;
    
}

public class Venda {
    public boolean Vendadeimovel ;
    
}


public class RepositorioImovel {
    private List<Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void removerImovel(Imovel imovel) {
        imoveis.remove(imovel);
    }

    public List<Imovel> listarImoveis() {
        return imoveis;
    }
}

public class RepositorioCliente {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}

