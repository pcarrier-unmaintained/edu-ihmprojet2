package ihmprojet2.Simulation.Plante;

import ihmprojet2.Simulation.DegresLumiere;
import java.beans.PropertyChangeListener;


public class Cacai extends Plante implements PropertyChangeListener {
    private Fruit fruit=null;
    
    public static void updateEtats() throws Exception{
         DegresLumiere vraieLumiere=Tomatito.environnement.getClimat().getLumiere();
         //Si on a tomatito comme voisin
        if(Cacai.environnement.containsTomatito()){
            Cacai.environnement.getClimat().reduitLumiere();
            Cacai.environnement.updateQualiteCroissance();
        }

        etats[0]=jour1();
        etats[1]=jour2();
        etats[2]=jour3();
        etats[3]=jour4();
        etats[4]=jour5();
        etats[5]=jour6();
        etats[6]=jour7();


         if(Tomatito.environnement.containsTomatito()){
             Tomatito.environnement.getClimat().setVraieLumiere(vraieLumiere);
         }
    }

    public static Plante[] getEtats() throws Exception{
        Cacai.updateEtats();
        return etats;
    }
    private static Cacai jour1()
   {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if(qtCroiss>35){
            p.setGermee(true);
        }
        return p;
    }


    private static Cacai jour2()
   {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if(qtCroiss>20){
            p.setGermee(true);
        }
        if(qtCroiss>60){
            p.setTaille(0.5);
        }
        return p;
    }

    private static Cacai jour3()
   {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if(qtCroiss>20){
            p.setGermee(true);
        }
        if(qtCroiss>35){
            p.setTaille(0.5);
        }
        return p;
    }

     private static Cacai jour4() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss =Tomatito.environnement.getQualiteCroissance();
        if(qtCroiss>20){
            p.setGermee(true);
            p.setTaille(0.5);
        }
        if(qtCroiss>35){
            p.setTaille(1);
        }
        if(qtCroiss>60){
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(0.3);
        }
        return p;
    }

       private static Cacai jour5() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if((qtCroiss>20)&&(qtCroiss>35)){
            p.setGermee(true);
            p.setTaille(1);
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(0.5);
        }
        if((qtCroiss>35)&&(qtCroiss>60)){
             p.setTaille(2);
             p.getFruit().setDiametre(1);
        }
        if(qtCroiss>60){
           p.getFruit().setDiametre(0.2);
        }
        return p;
    }

        private static Cacai jour6() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if((qtCroiss>20)&&(qtCroiss>35)){
            p.setGermee(true);
            p.setTaille(2);
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(1);
        }
        if((qtCroiss>35)&&(qtCroiss>60)){
             p.setTaille(2.5);
             p.getFruit().setGout(Gout.SUCRE);
             p.getFruit().setDiametre(1);
        }
        if(qtCroiss>60){
            p.setVivante(false);
            p.getFruit().setGout(Gout.AUCUN);
           p.getFruit().setDiametre(0);
        }
        return p;
    }



  private static Cacai jour7() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if((qtCroiss>20)&&(qtCroiss>35)){
            p.setGermee(true);
            p.setTaille(2.5);
            p.getFruit().setGout(Gout.SUCRE);
            p.getFruit().setDiametre(1);
        }
        if((qtCroiss>35)&&(qtCroiss>60)){
             p.setTaille(3);
             p.getFruit().setGout(Gout.SUCRE);
             p.getFruit().setDiametre(1.5);
        }
        if(qtCroiss>60){
            p.setVivante(false);
            p.getFruit().setGout(Gout.AUCUN);
           p.getFruit().setDiametre(0);
        }
        return p;
    }

  
    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt){
        try{
         Cacai.updateEtats();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
   }
        
        
    public Cacai () {
        fruit = new Fruit();

    }

    @Override
    public Cacai.Fruit getFruit(){
        return this.fruit;
        }

    public class Fruit extends ihmprojet2.Simulation.Plante.Fruit {

        private double diametre = 0;

        public Fruit () {
        }

        public double getDiametre () {
            return diametre;
        }

        public void setDiametre (double val) {
            diametre=val;
        }

        
        @Override
        public void setGout(Gout val) throws Exception {
            switch (val) {
                case FADE:
                case AMER:
                case ACIDULE:
                    super.setGout(val);
                    break;
                default:
                    throw new Exception("Le gout " + Gout.getGoutName(val) + "n'est " +
                            "pas autorisé pour Cacai.");
            }

        }

         public String getDescription() {
            String retour;

            retour=""+Gout.getGoutName(gout)+"\n"+diametre+"mm";
            return retour;
        }

         /*
         @Override
         public java.util.Hashtable getInfos(){
                java.util.Hashtable retour = new java.util.Hashtable();
                retour.put("GOUT", this.gout);
                retour.put("DIAM", ""+this.diametre);

             return retour;
        }*/
    }

  
 
}
