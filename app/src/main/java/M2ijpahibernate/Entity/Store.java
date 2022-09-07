package M2ijpahibernate.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "store")
public class Store {
    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storeID;

    @ManyToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff managerStaffId;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address addressId;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    
    
    //#region get/set
    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public Staff getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Staff managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    //#endregion
}
