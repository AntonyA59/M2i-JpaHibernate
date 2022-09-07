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
@Table(name= "film_actor")
public class FilmActor {
    @EmbeddedId
    private FilmActorKey id = new FilmActorKey();

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    private Film filma;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate = new Date();

    //#region get/set
    public FilmActorKey getId() {
        return id;
    }

    public void setId(FilmActorKey id) {
        this.id = id;
    }

    public Film getFilma() {
        return filma;
    }

    public void setFilm(Film filma) {
        this.filma = filma;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    //#endregion
    
}
