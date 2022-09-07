package M2ijpahibernate.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category" )
public class Category {
    public Category(){
        
    }
    public Category(String name){
        this.name = name;
    }

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private Date lastUpdate = new Date();

    @OneToMany(mappedBy = "category")
    private Set<FilmCategory> fCategorie = new HashSet<FilmCategory>();
    
    //#region get/set
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<FilmCategory> getfCategorie() {
        return fCategorie;
    }
    public void setfCategorie(Set<FilmCategory> fCategorie) {
        this.fCategorie = fCategorie;
    }

    //#endregion

}
