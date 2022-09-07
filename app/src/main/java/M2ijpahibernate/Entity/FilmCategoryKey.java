package M2ijpahibernate.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FilmCategoryKey implements Serializable {
    
    @Column(name ="category_id")
    private Integer categoryId;

    @Column(name = "film_id")
    private Integer filmId;

    //#region get /set
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }   
    //#endregion
}

