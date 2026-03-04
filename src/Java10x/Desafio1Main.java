package Java10x;

public class Desafio1Main {
    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1("Naruto", 13, "se tornar Hokage e conquistar reconhecimento.", "C", true);
        Desafio1 desafio2 = new Desafio1("Saske", 13, "vingar o clã Uchiha e depois reformar o sistema ninja à sua maneira.", "D", true);
        Desafio1 desafio3 = new Desafio1("Sakura", 12, "se tornar forte o suficiente para proteger seus companheiros.", "C", false);
        Desafio1 desafio4 = new Desafio1("Kakashi",27,"formar a nova geração e proteger Konoha.", "A",true);
        Desafio1 desafio5 = new Desafio1("Itachi", 17, "Objetivo: proteger Konoha nas sombras, mesmo sendo visto como traidor","A", false);
        Desafio1 desafio6 = new Desafio1("Pain", 35, "impor paz mundial através da dor.", "A", true);

        desafio1.showNinjaStatus();
        desafio2.showNinjaStatus();
        desafio3.showNinjaStatus();
        desafio4.showNinjaStatus();
        desafio5.showNinjaStatus();
        desafio6.showNinjaStatus();


    }
}
