
package belajar_inheritance_pakson;


public class Tabung extends BangunRuang{
    double r,t;
    
    @Override
    double volume(){
        double volume = 3.14 * r * r * t;
        System.out.println("Volume tabung = " + volume);
        return volume;
    }
    @Override
    double luasPermukaan(){
            double luasPermukaan = 2 * 3.14 * r * (r + t);
            System.out.println("Luas Permukaan = " + luasPermukaan);
            return luasPermukaan;
    } 
}
