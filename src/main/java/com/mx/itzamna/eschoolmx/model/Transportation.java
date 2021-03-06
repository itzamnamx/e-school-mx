package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Transportation generated by hbm2java
 */
@Entity
@Table(name="transportation"
    ,catalog="villaeducativa"
)
public class Transportation  implements java.io.Serializable {


     private Integer id;
     private String studentId;
     private String stopId;
     private int isPaid;

    public Transportation() {
    }

	
    public Transportation(int isPaid) {
        this.isPaid = isPaid;
    }
    public Transportation(String studentId, String stopId, int isPaid) {
       this.studentId = studentId;
       this.stopId = stopId;
       this.isPaid = isPaid;
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

    
    @Column(name="stop_id", length=120)
    public String getStopId() {
        return this.stopId;
    }
    
    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    
    @Column(name="is_paid", nullable=false)
    public int getIsPaid() {
        return this.isPaid;
    }
    
    public void setIsPaid(int isPaid) {
        this.isPaid = isPaid;
    }




}


