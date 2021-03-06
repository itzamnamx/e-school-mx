package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Reply generated by hbm2java
 */
@Entity
@Table(name="reply"
    ,catalog="villaeducativa"
)
public class Reply  implements java.io.Serializable {


     private Integer id;
     private int uid;
     private int sid;
     private int mid;
     private int rid;

    public Reply() {
    }

    public Reply(int uid, int sid, int mid, int rid) {
       this.uid = uid;
       this.sid = sid;
       this.mid = mid;
       this.rid = rid;
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

    
    @Column(name="sid", nullable=false)
    public int getSid() {
        return this.sid;
    }
    
    public void setSid(int sid) {
        this.sid = sid;
    }

    
    @Column(name="mid", nullable=false)
    public int getMid() {
        return this.mid;
    }
    
    public void setMid(int mid) {
        this.mid = mid;
    }

    
    @Column(name="rid", nullable=false)
    public int getRid() {
        return this.rid;
    }
    
    public void setRid(int rid) {
        this.rid = rid;
    }




}


