package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Userfolder generated by hbm2java
 */
@Entity
@Table(name="userfolder"
    ,catalog="villaeducativa"
)
public class Userfolder  implements java.io.Serializable {


     private Integer id;
     private int uid;
     private String foldername;

    public Userfolder() {
    }

    public Userfolder(int uid, String foldername) {
       this.uid = uid;
       this.foldername = foldername;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="uid", nullable=false)
    public int getUid() {
        return this.uid;
    }
    
    public void setUid(int uid) {
        this.uid = uid;
    }

    
    @Column(name="foldername", nullable=false, length=50)
    public String getFoldername() {
        return this.foldername;
    }
    
    public void setFoldername(String foldername) {
        this.foldername = foldername;
    }




}


