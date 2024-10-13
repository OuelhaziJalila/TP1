package td2_ex2;

public class MotDico {
    private int num;
    private String mot;
    private String definition;
    private static int compteur = 0;

public MotDico(String mot, String definition) {
	this.num = ++compteur;
    this.mot = mot;
    this.definition = definition;
}
public String getMot() {
    return mot;
}
public String getDefinition() {
    return definition;
}

public void setDefinition(String s) {
    this.definition = s;
}
public void setMot(String s) {
    this.mot = s;
}

public boolean synonyme(MotDico m) {
    return this.definition.equalsIgnoreCase(m.getDefinition());
    }
}