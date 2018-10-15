

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Haipinhg Zhu
 */
public class SolarSystem {
    class Body {
        private String Name;
        private String Orbit;
        private Double Mass;
        private Double Diam;
        private Double Perihelion;
        private Double Aphelion;
        private Double orbPeriod;
        private Double rotationalPeriod;
        private Double axialtilt;
        private Double orbinclin;
        private Double meanD;
                             
        public Body(String n, String orbit, Double mass, Double diam, Double Perihelion,
                Double Aphelion,Double orbPeriod,Double rotationalPeriod, Double axialtilt,Double orbinclin)
        {
            Name=n;
            Orbit=orbit;
            Mass=mass;
            Diam=diam;
            this.Perihelion=Perihelion;
            this.Aphelion=Aphelion;
            this.orbPeriod=orbPeriod;
            this.rotationalPeriod=rotationalPeriod;
            this.axialtilt=axialtilt;
            this.orbinclin=orbinclin;
            meanD=(this.Perihelion+this.Aphelion)/2;
            
                }
       
/**
 *
 * @author 
 */  
        
        
        
        
        
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        new SolarSystem();
        
    }
    
}
