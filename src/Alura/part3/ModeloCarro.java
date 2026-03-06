package Alura.part3;

public class ModeloCarro {
    public static void main(String[] args) {
        Carro toyota = new Carro();
        toyota.setNome("Toyota");
        toyota.setModelo("Corolla");
        toyota.setAno1(2021);
        toyota.setPreco1(112.000);
        toyota.setAno2(2022);
        toyota.setPreco2(116.000);
        toyota.setAno3(2023);
        toyota.setPreco3(121.000);
        toyota.calcularMaiorPreco();
        toyota.calcularMenorPreco();

        Carro honda = new Carro();
        honda.setNome("Honda");
        honda.setModelo("Honda Civic");
        honda.setAno1(2021);
        honda.setPreco1(118.000);
        honda.setAno2(2022);
        honda.setPreco2(125.000);
        honda.setAno3(2023);
        honda.setPreco3(196.000);
        honda.calcularMaiorPreco();
        honda.calcularMenorPreco();

    }
}
