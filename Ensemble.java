
import java.util.*;

public class Ensemble{
    private ArrayList<Integer> elements;
    //test
    private String name;
    private static int nbEsemble= 1; // static caract "généraleé, caract de la classe
    
    /**
     * Constructeur d'ensemble.
     * Par défaut, crée un ensemble vide.
     */
    public Ensemble(){
        nbEsemble++;
        name="E"+nbEsemble;
        elements = new ArrayList<Integer>(); // elements : objet "ArrayList" qui est vide
    }
    
    public void ajoute(int a){
        if(elements.contains(a)){
            System.out.println(a+"est déjà dedans!");
        }
        else{
        int i=0;
        if(elements.size()==0){
            elements.add(a);//ATTENTION ! ...
        }
        int pos= 0;
        while(a>elements.get(pos)&& a<elements.get(pos)){
            pos++;
        }
        //on a trouvé la place de a
        elements.add(pos,a);
    }
    System.out.println("ALED");
   }
    
    public int taille(){
        return elements.size() ;
    }
    
    public int getElement(int i){
        return elements.get(i);
    }
    
    public String toString(){
        String rep = "{ ";
        if(taille() == 0){
            rep = "{}";
        }
        else{
            for(int i = 0 ; i < taille()-1 ; i++){
                rep = rep + getElement(i) + " ; ";
            }
            rep = rep + getElement(taille()-1)+" }";
        }
        return rep;
    }
    public Ensemble union(Ensemble e){
        Ensemble union = new Ensemble();
        for(int i = 0; i<e.taille();i++){
            union.ajoute(this.getElement(i));
        }
        for(int i=0; i <e.taille(); i++){
            union.ajoute(e.getElement(i));
        }
        return union;
        }
        public Ensemble inter(Ensemble e){
        Ensemble inter = new Ensemble();
        for(int i=0; i<this.taille();i++){
            
        }
        for(int i = 0 ; i < this.taille() ; i++){
            int n = (int)this.getElement(i);
            if(e.elements.contains(n)){
                inter.ajoute(n);
            }
        }
        return inter;
    }
    public boolean equals(Ensemble e){
        if(this.taille() != e.taille()){
            return false;
        }
        else{
            for(int i=0; i<this.taille(); i++){
                if(this.getElement(i) != e.getElement(i)){
                    return false;
                }
            }
        }
        return true;
        }
    }

