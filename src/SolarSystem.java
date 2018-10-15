

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
 * @author Yueming Meng
 */  
    @Override
        public String toString(){
            //" Perihelion:"+Perihelion+" Aphelion:"+Aphelion++" orbPeriod:"+orbPeriod+" rotationalPeriod:"+rotationalPeriod+" axialtilt:"+axialtilt+" orbinclin:"+orbinclin
            return "Name:"+Name+"   Orbit:"+Orbit+"     Mass:"+Mass+"      Diam:+"+Diam+"   Mean Distance of orbit:"+meanD+'\n';
        }
    }
    public SolarSystem()  throws FileNotFoundException{
        ArrayList<Body> system= new ArrayList<>();
     
        Scanner s = new Scanner(new BufferedReader( new FileReader("solarsystem.dat")));
        String[] Firstline=new String[9];
        for (int i = 0; i < 9; i++) {
            Firstline[i]=s.next();
        }
   
        while(s.hasNext()){
           
            String a,b;
            Double c,d,g,h,i,j,e,f;
            a= s.next();
            b= s.next();
            c=s.nextDouble();
            d=s.nextDouble();
            e=s.nextDouble();
            f=s.nextDouble();
            g=s.nextDouble();
            h=s.nextDouble();
            i=s.nextDouble();
            j=s.nextDouble();
            Body bi=new Body(a,b,c,d,e,f,g,h,i,j);
            
           
            //System.out.println(bi);
            system.add(bi);
            
        }
        
                System.out.println(system.get(0));
                System.out.println(system.get(2));
                System.out.println(system.get(3));
                System.out.println(system.get(4));    
        
        
        
        
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        new SolarSystem();
        
    }
    
}
