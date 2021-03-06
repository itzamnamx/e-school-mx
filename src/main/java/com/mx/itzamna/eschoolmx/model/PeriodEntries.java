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
 * PeriodEntries generated by hbm2java
 */
@Entity
@Table(name="period_entries"
    ,catalog="villaeducativa"
)
public class PeriodEntries  implements java.io.Serializable {


     private Integer id;
     private Date monthDate;
     private Integer batchId;
     private Integer subjectId;
     private Integer classTimingId;
     private Integer employeeId;

    public PeriodEntries() {
    }

    public PeriodEntries(Date monthDate, Integer batchId, Integer subjectId, Integer classTimingId, Integer employeeId) {
       this.monthDate = monthDate;
       this.batchId = batchId;
       this.subjectId = subjectId;
       this.classTimingId = classTimingId;
       this.employeeId = employeeId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="month_date", length=10)
    public Date getMonthDate() {
        return this.monthDate;
    }
    
    public void setMonthDate(Date monthDate) {
        this.monthDate = monthDate;
    }

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="subject_id")
    public Integer getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    
    @Column(name="class_timing_id")
    public Integer getClassTimingId() {
        return this.classTimingId;
    }
    
    public void setClassTimingId(Integer classTimingId) {
        this.classTimingId = classTimingId;
    }

    
    @Column(name="employee_id")
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }




}


