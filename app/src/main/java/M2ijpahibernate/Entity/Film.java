package M2ijpahibernate.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "film")
@NamedQuery(name = "Film.startFromLetter", query = 
"SELECT f "+
"FROM Film f "+
"WHERE f.title LIKE :letter")
@NamedQuery(name = "Film.FromHour", query = 
"SELECT f "+
"FROM Film f "+
"WHERE f.length = :min")
@NamedQuery(name = "Film.remplacementCost", query = 
"SELECT f.title, f.remplacementCost, l.name "+
"FROM Film f "+
"INNER JOIN Language l "+
"ON f.languageID  = l.languageId "+
"WHERE f.remplacementCost > :remplacementCost ")
public class Film {
    public Film(){

    }
    public Film(
    String title, 
    String description,  
    Language language,
    Language originalLanguage, 
    Integer rentalDuration, 
    Integer rentalRate,
    Integer length,
    Integer remplacementCost,
    String rating,
    String specialFeatures
    )
    {
        this.title = title;
        this.description = description;
        this.languageID = language;
        this.originalLanguageID = originalLanguage;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.remplacementCost = remplacementCost;
        this.length = length;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.releaseYear = 2022;
    }
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filmId;
    
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language languageID;
    
    @ManyToOne
    @JoinColumn(name = "original_language_id", nullable = true)
    private Language originalLanguageID;

    @Column(name = "rental_duration")
    private Integer rentalDuration;

    @Column(name = "rental_rate")
    private Integer rentalRate;
    
    @Column(name = "length")
    private Integer length;

    @Column(name = "replacement_cost")
    private Integer remplacementCost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate = new Date();


    @OneToMany(mappedBy = "filma")
    private Set<FilmActor> fActors = new HashSet<FilmActor>();

    @OneToMany(mappedBy = "film")
    private Set<FilmCategory> fCategory = new HashSet<FilmCategory>();



    
    //#region get/set
    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Language getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Language languageID) {
        this.languageID = languageID;
    }

    public Language getOriginalLanguageID() {
        return originalLanguageID;
    }

    public void setOriginalLanguageID(Language originalLanguageID) {
        this.originalLanguageID = originalLanguageID;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Integer getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Integer rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getRemplacementCost() {
        return remplacementCost;
    }

    public void setRemplacementCost(Integer remplacementCost) {
        this.remplacementCost = remplacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Set<FilmCategory> getfCategory() {
        return fCategory;
    }
    
    public Date getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set<FilmActor> getfActors() {
        return fActors;
    }
    public void setfActors(Set<FilmActor> fActors) {
        this.fActors = fActors;
    }
    public void setfCategory(Set<FilmCategory> fCategory) {
        this.fCategory = fCategory;
    }

    //#endregion
}
