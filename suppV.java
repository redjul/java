import javax.swing.*;


public class suppV
{
    static int[] tab = new int[10];
    public static void main(String[] args){
        initAuto();// ou init();
        affiche(tab);
        int v = Integer.parseInt(JOptionPane.showInputDialog(null,"v ? "));
        if(chercheEtSupprime(v)){
            JOptionPane.showMessageDialog(null,"La valeur "+v+" a été trouvée et supprimée du tableau.");
        }
        else{
            JOptionPane.showMessageDialog(null,"La valeur "+v+" n'était pas dans le tableau.");
        }
        affiche(tab);
    }
    public static void affiche(int[] t){
        for(int i = 0 ; i < t.length ; i++){
            System.out.println(i+"\t : \t"+t[i]);
        }
    }
    public static void init(){
        for(int i = 0 ; i < tab.length ; i++){
            tab[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"tab["+i+"] = ?"));
        }
    }
    
    public static void initAuto(){
        for(int i = 0 ; i < tab.length ; i++){
            tab[i] = (int)(Math.random()*50);
        }
    }
    
    public static boolean chercheEtSupprime(int v){
        int[] t = new int[tab.length];
        int j = 0;//Pour parcourir t
        boolean rep = false;
        for(int i = 0 ; i < tab.length ; i++){
            if(tab[i] != v){
                t[j] = tab[i];
                j++;
            }
            else{
                rep = true;
            }
        }
        tab = t;
        return rep;
    }
}
