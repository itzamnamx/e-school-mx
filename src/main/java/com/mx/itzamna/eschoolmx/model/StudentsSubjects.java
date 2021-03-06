package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StudentsSubjects generated by hbm2java
 */
@Entity
@Table(name="students_subjects"
    ,catalog="villaeducativa"
)
public class StudentsSubjects  implements java.io.Serializable {


     private Integer id;
     private Integer studentId;
     private Integer subjectId;
     private Integer batchId;

    public StudentsSubjects() {
    }

    public StudentsSubjects(Integer studentId, Integer subjectId, Integer batchId) {
       this.studentId = studentId;
       this.subjectId = subjectId;
       this.batchId = batchId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="student_id")
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    
    @Column(name="subject_id")
    public Integer getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }




}


