package Alura.part3;

public class Carro {
    private String nome;
    private String modelo;
    private int ano1;
    private int ano2;
    private int ano3;
    private double preco1;
    private double preco2;
    private double preco3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno1() {
        return ano1;
    }

    public void setAno1(int ano1) {
        this.ano1 = ano1;
    }

    public int getAno2() {
        return ano2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public int getAno3() {
        return ano3;
    }

    public void setAno3(int ano3) {
        this.ano3 = ano3;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    public void calcularMaiorPreco() {
        if (preco1 > preco2 && preco2 > preco3) {
            System.out.println("Ano " + ano1 + " maior preco");
        } else if (preco2 > preco1 && preco2 > preco3 ) {
            System.out.println("Ano " + ano2 + " maior preco");
        } else {
            System.out.println("Ano " + ano3 + " maior preco");
        }
    }

    public void calcularMenorPreco() {
        if (preco1 < preco2 && preco2 < preco3) {
            System.out.println("Ano " + ano1 + " menor preco");
        } else if (preco2 < preco1 && preco2 < preco3 ) {
            System.out.println("Ano " + ano2 + " menor preco");
        } else {
            System.out.println("Ano " + ano3 + " menor preco");
        }
    }

    public void mostrarCarro() {
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano " + ano1);
        System.out.println("Preço em " + ano1 + ":" + preco1);
        System.out.println("Ano " + ano2);
        System.out.println("Preço em " + ano2 + ":" + preco2);
        System.out.println("Ano " + ano3);
        System.out.println("Preço em " + ano3 + ":" + preco3);
        System.out.print("Maior preço: ");
        calcularMenorPreco();
    }






}
