
package belajar_inheritance_pakson;


public class Balok extends BangunRuang{
    double p,l,t;
    
    @Override
    double volume(){
        double volume = p * l * t;
        System.out.println("Volume balok = " + volume);
        return volume;
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = 2 * (p * l) + (p * t) + (l * t);
        System.out.println("Luas Permukaan balok " + luasPermukaan);
        return luasPermukaan;
    }
}
