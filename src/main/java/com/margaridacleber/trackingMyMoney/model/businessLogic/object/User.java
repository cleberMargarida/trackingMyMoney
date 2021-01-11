package com.margaridacleber.trackingMyMoney.model.businessLogic.object;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USER_PROFILE")
public class User {

    @Id
    @GeneratedValue( generator = "uuid2" )
    @GenericGenerator( name = "uuid2", strategy = "uuid2" )
    @Column( name = "id", columnDefinition = "CHAR(32)" )
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID Id;

    @Column(name = "USERNAME")
    private String Username;

    @Column(name = "PASSWORD")
    private String Password;

    public UUID getId() { return Id; }

    public void setId(UUID id) { Id = id; }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
