package tp6_ex1;
public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee,double rayon) {
        super(annee);
        this.rayon = rayon; 
    }

    public double getRayon() {
        return rayon;
    }
    public double calculerSurface() {
        return 3.14* rayon*rayon;
    }
  
}