package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Languages generated by hbm2java
 */
@Entity
@Table(name="languages"
    ,catalog="villaeducativa"
)
public class Languages  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String code;

    public Languages() {
    }

    public Languages(String name, String code) {
       this.name = name;
       this.code = code;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="code")
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }




}


