package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Authitem generated by hbm2java
 */
@Entity
@Table(name="authitem"
    ,catalog="villaeducativa"
)
public class Authitem  implements java.io.Serializable {


     private String name;
     private int type;
     private String description;
     private String bizrule;
     private String data;
     private Set<Authassignment> authassignments = new HashSet<Authassignment>(0);
     private Rights rights;
     private Set<Authitem> authitemsForParent = new HashSet<Authitem>(0);
     private Set<Authitem> authitemsForChild = new HashSet<Authitem>(0);

    public Authitem() {
    }

	
    public Authitem(String name, int type) {
        this.name = name;
        this.type = type;
    }
    public Authitem(String name, int type, String description, String bizrule, String data, Set<Authassignment> authassignments, Rights rights, Set<Authitem> authitemsForParent, Set<Authitem> authitemsForChild) {
       this.name = name;
       this.type = type;
       this.description = description;
       this.bizrule = bizrule;
       this.data = data;
       this.authassignments = authassignments;
       this.rights = rights;
       this.authitemsForParent = authitemsForParent;
       this.authitemsForChild = authitemsForChild;
    }
   
     @Id 

    
    @Column(name="name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="type", nullable=false)
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="bizrule", length=65535)
    public String getBizrule() {
        return this.bizrule;
    }
    
    public void setBizrule(String bizrule) {
        this.bizrule = bizrule;
    }

    
    @Column(name="data", length=65535)
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="authitem")
    public Set<Authassignment> getAuthassignments() {
        return this.authassignments;
    }
    
    public void setAuthassignments(Set<Authassignment> authassignments) {
        this.authassignments = authassignments;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="authitem")
    public Rights getRights() {
        return this.rights;
    }
    
    public void setRights(Rights rights) {
        this.rights = rights;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="authitemchild", catalog="villaeducativa", joinColumns = { 
        @JoinColumn(name="child", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="parent", nullable=false, updatable=false) })
    public Set<Authitem> getAuthitemsForParent() {
        return this.authitemsForParent;
    }
    
    public void setAuthitemsForParent(Set<Authitem> authitemsForParent) {
        this.authitemsForParent = authitemsForParent;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="authitemchild", catalog="villaeducativa", joinColumns = { 
        @JoinColumn(name="parent", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="child", nullable=false, updatable=false) })
    public Set<Authitem> getAuthitemsForChild() {
        return this.authitemsForChild;
    }
    
    public void setAuthitemsForChild(Set<Authitem> authitemsForChild) {
        this.authitemsForChild = authitemsForChild;
    }




}


