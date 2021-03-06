package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Electives generated by hbm2java
 */
@Entity
@Table(name="electives"
    ,catalog="villaeducativa"
)
public class Electives  implements java.io.Serializable {


     private Integer id;
     private Integer electiveGroupId;
     private Date createdAt;
     private Date updatedAt;

    public Electives() {
    }

    public Electives(Integer electiveGroupId, Date createdAt, Date updatedAt) {
       this.electiveGroupId = electiveGroupId;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="elective_group_id")
    public Integer getElectiveGroupId() {
        return this.electiveGroupId;
    }
    
    public void setElectiveGroupId(Integer electiveGroupId) {
        this.electiveGroupId = electiveGroupId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at", length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }




}


