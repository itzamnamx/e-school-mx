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
 * FinanceFeeCollections generated by hbm2java
 */
@Entity
@Table(name="finance_fee_collections"
    ,catalog="villaeducativa"
)
public class FinanceFeeCollections  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Date startDate;
     private Date endDate;
     private Date dueDate;
     private Integer feeCategoryId;
     private Integer batchId;
     private boolean isDeleted;

    public FinanceFeeCollections() {
    }

	
    public FinanceFeeCollections(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public FinanceFeeCollections(String name, Date startDate, Date endDate, Date dueDate, Integer feeCategoryId, Integer batchId, boolean isDeleted) {
       this.name = name;
       this.startDate = startDate;
       this.endDate = endDate;
       this.dueDate = dueDate;
       this.feeCategoryId = feeCategoryId;
       this.batchId = batchId;
       this.isDeleted = isDeleted;
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

    @Temporal(TemporalType.DATE)
    @Column(name="start_date", length=10)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="end_date", length=10)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="due_date", length=10)
    public Date getDueDate() {
        return this.dueDate;
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    
    @Column(name="fee_category_id")
    public Integer getFeeCategoryId() {
        return this.feeCategoryId;
    }
    
    public void setFeeCategoryId(Integer feeCategoryId) {
        this.feeCategoryId = feeCategoryId;
    }

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="is_deleted", nullable=false)
    public boolean isIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }




}


