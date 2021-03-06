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
 * ExamGroups generated by hbm2java
 */
@Entity
@Table(name="exam_groups"
    ,catalog="villaeducativa"
)
public class ExamGroups  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Integer batchId;
     private String examType;
     private Boolean isPublished;
     private Boolean resultPublished;
     private Date examDate;

    public ExamGroups() {
    }

    public ExamGroups(String name, Integer batchId, String examType, Boolean isPublished, Boolean resultPublished, Date examDate) {
       this.name = name;
       this.batchId = batchId;
       this.examType = examType;
       this.isPublished = isPublished;
       this.resultPublished = resultPublished;
       this.examDate = examDate;
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

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="exam_type")
    public String getExamType() {
        return this.examType;
    }
    
    public void setExamType(String examType) {
        this.examType = examType;
    }

    
    @Column(name="is_published")
    public Boolean getIsPublished() {
        return this.isPublished;
    }
    
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    
    @Column(name="result_published")
    public Boolean getResultPublished() {
        return this.resultPublished;
    }
    
    public void setResultPublished(Boolean resultPublished) {
        this.resultPublished = resultPublished;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="exam_date", length=10)
    public Date getExamDate() {
        return this.examDate;
    }
    
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }




}


