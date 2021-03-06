package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * Exams generated by hbm2java
 */
@Entity
@Table(name="exams"
    ,catalog="villaeducativa"
)
public class Exams  implements java.io.Serializable {


     private Integer id;
     private Integer examGroupId;
     private Integer subjectId;
     private Date startTime;
     private Date endTime;
     private BigDecimal maximumMarks;
     private BigDecimal minimumMarks;
     private Integer gradingLevelId;
     private Integer weightage;
     private Integer eventId;
     private Date createdAt;
     private Date updatedAt;

    public Exams() {
    }

    public Exams(Integer examGroupId, Integer subjectId, Date startTime, Date endTime, BigDecimal maximumMarks, BigDecimal minimumMarks, Integer gradingLevelId, Integer weightage, Integer eventId, Date createdAt, Date updatedAt) {
       this.examGroupId = examGroupId;
       this.subjectId = subjectId;
       this.startTime = startTime;
       this.endTime = endTime;
       this.maximumMarks = maximumMarks;
       this.minimumMarks = minimumMarks;
       this.gradingLevelId = gradingLevelId;
       this.weightage = weightage;
       this.eventId = eventId;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="exam_group_id")
    public Integer getExamGroupId() {
        return this.examGroupId;
    }
    
    public void setExamGroupId(Integer examGroupId) {
        this.examGroupId = examGroupId;
    }

    
    @Column(name="subject_id")
    public Integer getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time", length=19)
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time", length=19)
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    
    @Column(name="maximum_marks", precision=10)
    public BigDecimal getMaximumMarks() {
        return this.maximumMarks;
    }
    
    public void setMaximumMarks(BigDecimal maximumMarks) {
        this.maximumMarks = maximumMarks;
    }

    
    @Column(name="minimum_marks", precision=10)
    public BigDecimal getMinimumMarks() {
        return this.minimumMarks;
    }
    
    public void setMinimumMarks(BigDecimal minimumMarks) {
        this.minimumMarks = minimumMarks;
    }

    
    @Column(name="grading_level_id")
    public Integer getGradingLevelId() {
        return this.gradingLevelId;
    }
    
    public void setGradingLevelId(Integer gradingLevelId) {
        this.gradingLevelId = gradingLevelId;
    }

    
    @Column(name="weightage")
    public Integer getWeightage() {
        return this.weightage;
    }
    
    public void setWeightage(Integer weightage) {
        this.weightage = weightage;
    }

    
    @Column(name="event_id")
    public Integer getEventId() {
        return this.eventId;
    }
    
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at", length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }




}


