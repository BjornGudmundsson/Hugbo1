package is.hi.byrjun.model;

import java.util.Date;

/**
 *
 * @author Sindri Pétur Ingimundarson, Ketill Guðmundsson, Björn Guðmundsson, Ævar Aðalsteinsson
 * @date september 2017 HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Review klasinn inniheldur, nafn, námskeiðsnúmer og langt námskeiðsnúmer
 */

public class Review {

    private String langtNumer;
    private Integer rating;
    private String author;
    private Date createdOn;
    private String mainText;


    public Review(String langtNumer, Integer rating, String author, Date createdOn, String mainText) {
        this.setLangtNumer(langtNumer);
        this.setRating(rating);
        this.setAuthor(author);
        this.setCreatedOn(createdOn);
        this.setMainText(mainText);
    }

    @Override
    public String toString() {
        return String.format("Aðaltexti:" + mainText);
    }

    public String getLangtNumer() {
        return langtNumer;
    }

    public void setLangtNumer(String langtNumer) {
        this.langtNumer = langtNumer;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }
}