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
 * Room generated by hbm2java
 */
@Entity
@Table(name="room"
    ,catalog="villaeducativa"
)
public class Room  implements java.io.Serializable {


     private Integer id;
     private String roomNo;
     private String floor;
     private String isFull;
     private String noOfBed;
     private Date created;

    public Room() {
    }

    public Room(String roomNo, String floor, String isFull, String noOfBed, Date created) {
       this.roomNo = roomNo;
       this.floor = floor;
       this.isFull = isFull;
       this.noOfBed = noOfBed;
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

    
    @Column(name="room_no", length=120)
    public String getRoomNo() {
        return this.roomNo;
    }
    
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    
    @Column(name="floor", length=120)
    public String getFloor() {
        return this.floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }

    
    @Column(name="is_full", length=120)
    public String getIsFull() {
        return this.isFull;
    }
    
    public void setIsFull(String isFull) {
        this.isFull = isFull;
    }

    
    @Column(name="no_of_bed", length=120)
    public String getNoOfBed() {
        return this.noOfBed;
    }
    
    public void setNoOfBed(String noOfBed) {
        this.noOfBed = noOfBed;
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


