
package belajar_inheritance_pakson;


public class Bola extends BangunRuang{
    double r;
    
    @Override
    double volume(){
        double volume = 4/3 * 3.14 * r * r * r;
        System.out.println("Volume bola = " + volume);
        return volume;
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = 4 * 3.14 * r * r;
        System.out.println("Luas Permukaan bola = " + luasPermukaan);
        return luasPermukaan;
    }
}
