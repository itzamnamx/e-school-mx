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
 * MessManage generated by hbm2java
 */
@Entity
@Table(name="mess_manage"
    ,catalog="villaeducativa"
)
public class MessManage  implements java.io.Serializable {


     private Integer id;
     private String studentId;
     private String foodPreference;
     private String amount;
     private String status;
     private Date created;

    public MessManage() {
    }

    public MessManage(String studentId, String foodPreference, String amount, String status, Date created) {
       this.studentId = studentId;
       this.foodPreference = foodPreference;
       this.amount = amount;
       this.status = status;
       this.created = created;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="student_id", length=120)
    public String getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    @Column(name="food_preference", length=120)
    public String getFoodPreference() {
        return this.foodPreference;
    }
    
    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    
    @Column(name="amount", length=120)
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    
    @Column(name="status", length=120)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="created", length=10)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }




}


