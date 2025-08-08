import java.util.ArrayList;

public class Section {
    private String sectionName;
    private ArrayList<Card> cardList = new ArrayList<Card>();
    
 public Section(String nombre,ArrayList<Card> list){
   this.sectionName = nombre;
   this.cardList = list;
   
 }
public void setSectionName(String name){
  this.sectionName= name;
 
}
public void printList(){
    for (Card card : this.cardList) {
            System.out.println(card.getInformation());
        }
}



}
