import java.util.ArrayList;

public class GerenVeiculo {
    private ArrayList<Veiculo> veiculos;

    public GerenVeiculo() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public String listar() {
        String saida = "";

        for (Veiculo veiculo : veiculos) {
            saida += veiculo.getMarca() + veiculo.getPlaca() + veiculo.getCombustivel() + veiculo.getAno() + veiculo.getValor();
        }

        return saida;
    }

    public Veiculo buscarPlaca(String placa) {
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public boolean removerVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public String buscar(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo.imprimir();
            }
        }
        return "Veículo não encontrado";
    }
    

    public String listarPorCombustivel(String combustivel) {
               for (Veiculo veiculo : veiculos) {
            if (veiculo.getCombustivel().equals(combustivel)) {
                return veiculo.imprimir();
            }
        }
        return "Não há nenhum veículo cadastrado com este tipo de combustível";
    } 

}

