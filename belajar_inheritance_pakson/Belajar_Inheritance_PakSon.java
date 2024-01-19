package belajar_inheritance_pakson;

public class Belajar_Inheritance_PakSon {

    public static void main(String[] args) {
        //membuat objek bangun datar
        BangunRuang bangunRuang = new BangunRuang();

        //membuat objek kubus dan mengisi properti
        Kubus kubus = new Kubus();
        kubus.s = 2;

        //membuat objek balok dan mengisi nilai properti
        Balok balok = new Balok();
        balok.p = 22;
        balok.l = 10;
        balok.t = 11;

        //membuat objek bola dan mengisi nilai properti
        Bola bola = new Bola();
        bola.r = 8;

        //membuat objek limas dan mengisi nilai properti
        LimasSegitiga lSegitiga = new LimasSegitiga();
        lSegitiga.a = 12;
        lSegitiga.t = 8;
        lSegitiga.tLimas = 10;
        lSegitiga.sTegak = 5;

        //membuat objek tabung dan mengisi nilai properti
        Tabung tabung = new Tabung();
        tabung.r = 12;
        tabung.t = 10;

        //memanggil method luas dan keliling
        bangunRuang.volume();
        bangunRuang.luasPermukaan();

        kubus.volume();
        kubus.luasPermukaan();

        balok.volume();
        balok.luasPermukaan();

        bola.volume();
        bola.luasPermukaan();

        lSegitiga.volume();
        lSegitiga.luasPermukaan();

        tabung.volume();
        tabung.luasPermukaan();

    }

}
