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
@Table(name = "staff")
public class Staff {
    
    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;

    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address addressId;
    
    @Column(name = "email")
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store storeId;
    
    @Column(name = "active")
    private boolean active;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    
    
    //#region get/set
    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    //#endregion
}
