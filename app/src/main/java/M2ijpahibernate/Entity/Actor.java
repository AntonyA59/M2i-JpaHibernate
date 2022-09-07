package M2ijpahibernate.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "actor")
@NamedQuery(name = "Actor.findByFirstName", query = 
"SELECT a "+
"FROM Actor a "+
"WHERE a.FirstName LIKE :firstName")
public class Actor {
    public Actor(){

    }
    
    public Actor(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.lastUpdate = new Date();
    }
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actorID;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate = new Date();

    @OneToMany(mappedBy = "actor")
    private Set<FilmActor> fActors = new HashSet<FilmActor>();

    //#region get/set
    public Integer getActorID() {
        return actorID;
    }

    public void setActorID(Integer actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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
    //#endregion
}
