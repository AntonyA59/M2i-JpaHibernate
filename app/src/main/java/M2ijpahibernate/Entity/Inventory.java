package M2ijpahibernate.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "inventory")
public class Inventory {
    
    @Id
    @Column(name = "inventory_id")
    private int inventoryId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "film_id")
    private Film filmId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id")
    private Store storeId;
    
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    //#region get/set
    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Film getFilmId() {
        return filmId;
    }

    public void setFilmId(Film filmId) {
        this.filmId = filmId;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    //#endregion
}
