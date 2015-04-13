package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Roomrequest generated by hbm2java
 */
@Entity
@Table(name="roomrequest"
    ,catalog="villaeducativa"
)
public class Roomrequest  implements java.io.Serializable {


     private Integer id;
     private String studentId;
     private String allotId;
     private String status;
     private String createdAt;

    public Roomrequest() {
    }

    public Roomrequest(String studentId, String allotId, String status, String createdAt) {
       this.studentId = studentId;
       this.allotId = allotId;
       this.status = status;
       this.createdAt = createdAt;
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

    
    @Column(name="allot_id", length=120)
    public String getAllotId() {
        return this.allotId;
    }
    
    public void setAllotId(String allotId) {
        this.allotId = allotId;
    }

    
    @Column(name="status", length=120)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="created_at", length=120)
    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }




}

