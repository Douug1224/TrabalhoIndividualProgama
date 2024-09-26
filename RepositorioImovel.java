package testeindividual;

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
