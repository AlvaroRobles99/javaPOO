import java.util.ArrayList;

public class Card {
    private String title;
    private ArrayList<Review> reviewList = new ArrayList<Review>();
    private String authorName;
    private String imgSource;
    private Double fullPrice;
    private Double discountPrice;
    private String extraLabel;
    

public Card(String title,ArrayList<Review> reviewList,String author,String img,Double fullPrice,Double discountPrice,String extra){
    this.title = title;
    this.reviewList = reviewList;
    this.authorName = author;
    this.imgSource= img;
    this.fullPrice = fullPrice;
    this.discountPrice = discountPrice;
    this.extraLabel= extra;
}

public Double averageStars(){
   Double average = 0.0;
   Integer accumulator = 0;
   Integer counter = 0;
    for (Review review : this.reviewList) {accumulator += accumulator + review.getStars();  counter ++; }
   if (counter != 0) {
    return average = (double) (accumulator / counter);
   }else{
    return average;
   }
    }


public String getInformation(){
    String info =
                  "  "+ this.imgSource + "  \n "
                  + this.title + "  \n "
                  + this.authorName + "  \n "
                  + this.averageStars().toString()+ "  \n "
                  + " $ " + this.discountPrice.toString() +" $ " + this.fullPrice.toString()+ "  \n "
                  + this.extraLabel;

    return info;
}











// setters 
public void setTitle(String title){
    this.title = title;
}
public void setAuthor(String author){
    this.authorName = author;
}
public void setImgSource (String title){
    this.title = title;
}
public void fullPrice (Double fullPrice){
    this.fullPrice = fullPrice;
}
public void setReviewList(ArrayList<Review> reviewList) {
    this.reviewList = reviewList;
}

}
