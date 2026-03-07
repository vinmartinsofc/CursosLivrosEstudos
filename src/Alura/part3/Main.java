package Alura.part3;

public class Main {
    public static void main(String[] args) {
        ModeloCarro toyota = new ModeloCarro();
        toyota.setNome("Toyota");
        toyota.setModelo("Corolla");
        toyota.setAno1(2021);
        toyota.setPreco1(112.000);
        toyota.setAno2(2022);
        toyota.setPreco2(116.000);
        toyota.setAno3(2023);
        toyota.setPreco3(121.000);
        toyota.detalharModelo();

        ModeloCarro honda = new ModeloCarro();
        honda.setNome("Honda");
        honda.setModelo("Honda Civic");
        honda.setAno1(2021);
        honda.setPreco1(118.000);
        honda.setAno2(2022);
        honda.setPreco2(125.000);
        honda.setAno3(2023);
        honda.setPreco3(196.000);
        honda.detalharModelo();


    }
}
