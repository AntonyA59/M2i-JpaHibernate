package M2ijpahibernate.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FilmActorKey implements Serializable {
    
    @Column(name ="actor_id")
    private Integer actorId;

    @Column(name = "film_id")
    private Integer filmId;

    //#region get /set
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }   
    //#endregion
}

