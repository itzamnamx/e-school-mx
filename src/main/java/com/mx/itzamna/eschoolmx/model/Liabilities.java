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
 * Liabilities generated by hbm2java
 */
@Entity
@Table(name="liabilities"
    ,catalog="villaeducativa"
)
public class Liabilities  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String description;
     private Integer amount;
     private Boolean isSolved;
     private Boolean isDeleted;
     private Date createdAt;
     private Date updatedAt;

    public Liabilities() {
    }

    public Liabilities(String title, String description, Integer amount, Boolean isSolved, Boolean isDeleted, Date createdAt, Date updatedAt) {
       this.title = title;
       this.description = description;
       this.amount = amount;
       this.isSolved = isSolved;
       this.isDeleted = isDeleted;
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

    
    @Column(name="title")
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="amount")
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    
    @Column(name="is_solved")
    public Boolean getIsSolved() {
        return this.isSolved;
    }
    
    public void setIsSolved(Boolean isSolved) {
        this.isSolved = isSolved;
    }

    
    @Column(name="is_deleted")
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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


