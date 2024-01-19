
package belajar_inheritance_pakson;

public class Kubus extends BangunRuang{
    double s;
    
    @Override
    double volume(){
        double volume = s * s * s;
        System.out.println("Volume kubus = " + volume);
        return volume;
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = 6 * s * s;
        System.out.println("Luas permukaan = " + luasPermukaan);
        return luasPermukaan;
    }
}
