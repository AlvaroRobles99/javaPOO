public class Review {
    private Integer stars;
    private String comment;
    
public Review(Integer stars, String comment){
this.stars = stars;
this.comment = comment;
}

public void setComment(String comment) {
    this.comment = comment;
}
public void setStars(Integer stars) {
    this.stars = stars;
}
public Integer getStars() {
    return stars;
}
}
