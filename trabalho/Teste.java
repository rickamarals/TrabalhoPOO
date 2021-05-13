import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano, menu;
        String placa;
        String modelo;
        String marca;
        String combustivel;
        double valor;
        GerenVeiculo veiculos = new GerenVeiculo();

        do {
            System.out.println("1-Adicionar Veículo");
            System.out.println("2-Remover Veículo");
            System.out.println("3-Buscar Veículo");
            System.out.println("4-Listar todos os veículos");
            System.out.println("5-Listar veículo por combustível");
            System.out.println("6-Sair");
            menu = Integer.parseInt(in.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Modelo:");
                    modelo = in.nextLine();
                                        System.out.println("Placa:");
                    placa = in.nextLine();
                                        System.out.println("Marca:");
                    marca = in.nextLine();
                                        System.out.println("Combustível:");
                    combustivel = in.nextLine();
                                        System.out.println("Ano:");
                    ano = Integer.parseInt(in.nextLine());
                                        System.out.println("Valor:");
                    valor = in.nextDouble();
                    veiculos.adicionarVeiculo(new Veiculo (marca,  modelo,  ano,  combustivel,  placa,  valor));
                    break;

                case 2:
                    System.out.println("Informe a placa:");
                    placa = in.nextLine();
                    veiculos.removerVeiculo(placa);
                    break;
                case 3:
 
                    break;

                case 4:
                    System.out.println(veiculos.listar());
                    break;

                case 5:

                    break;

                case 6:
                    break;

                default:
                    System.err.println("Opção inválida.");
                    break;
            }

        } while (menu != 6);

        in.close();
    }
}
