public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    private String combustivel;
    private int ano;
    private int anoImposto = 2021;
    private double valor;

    public Veiculo(String marca, String modelo, int ano, String combustivel, String placa, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.placa = placa;
        this.valor = valor;
    }

    public double imposto() {
        anoImposto = anoImposto - ano;
        if (anoImposto > 20) {
            System.out.println("isento de imposto!");
            return -1;
        } else {
            if (combustivel.equals("gasolina") || combustivel.equals("diesel") || combustivel.equals("flex")) {
                return valor * 0.04;
            }
            return valor * 0.03;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String imprimir() {
        return "Marca do veículo: " + marca + " " + "Modelo do veículo: " + modelo + " " + "Ano do veículo: " + ano
                + " " + "Placa do veículo: " + placa + "Tipo de Combustível: " + combustivel + " "
                + "Valor de mercado: " + valor;
    }
}