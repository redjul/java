import java.util.ArrayList;

public class NoteBook{
    private ArrayList notes;
    
    public NoteBook(){
     notes = new ArrayList();
    }
    public void storeNote(String note){
        notes.add(note);
    }
    public void storeNote(int note){
        notes.add(note);
    }
    public int numberOfNotes(){
        return notes.size();
    }
    public void showNote (int noteNumber){
        if(noteNumber < numberOfNotes()){
            
        }
        else{
            if (noteNumber < numberOfNotes()){
                System.out.println(notes.get(noteNumber));
            }
        else{
        }
        }
    }
    public void addNote(){
        storeNote("Supprimer abonnement");
        storeNote("Etudier programmation");
        storeNote("Avancer dans le tfe");
        storeNote("aller courir");
        storeNote("acheter du pain");
    }
}
