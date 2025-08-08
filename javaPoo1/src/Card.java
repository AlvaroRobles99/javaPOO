public class Card {
    private String title;
    private String imgSource;
    private Integer dayOfWeek;
    

public Card(String title,String img,Integer day){
    this.title = title;
    this.imgSource= img;
    this.dayOfWeek = day;
}
public String getInformation(){
    String info = " "+ this.imgSource + "  \n" + this.title + "  \n" + " Se estrena el dia " + this.dayOfWeek.toString();
    return info;
}
public void setTitle(String title){
    this.title = title;
}
public void setImgSource (String title){
    this.title = title;
}
public void dayOfWeek (Integer day){
    this.dayOfWeek = day;
}


}
