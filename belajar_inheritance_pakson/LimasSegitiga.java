
package belajar_inheritance_pakson;


public class LimasSegitiga extends BangunRuang{
    double a,t,tLimas,sTegak;
    
    @Override
    double volume(){
        double volume = 1/3 * 1/2 * (a * t) * tLimas;
        System.out.println("Volume limas segitiga = " + volume);
        return volume;
    }

    double luasPermukaan(){
        double luasPermukaan = (1/2 * a * t) + (3 * sTegak);
        System.out.println("Luas permukaan limas segitiga = " + luasPermukaan);
        return luasPermukaan;
    }
}
