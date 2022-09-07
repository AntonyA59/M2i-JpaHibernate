package M2ijpahibernate.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "film_category")
public class FilmCategory {
    public FilmCategory(){

    }
    @EmbeddedId
    private FilmCategoryKey id= new FilmCategoryKey();

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate = new Date();

    
    
    //#region get/set
    public FilmCategoryKey getId() {
        return id;
    }

    public void setId(FilmCategoryKey id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    //#endregion
}
