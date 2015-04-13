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
 * Reminders generated by hbm2java
 */
@Entity
@Table(name="reminders"
    ,catalog="villaeducativa"
)
public class Reminders  implements java.io.Serializable {


     private Integer id;
     private Integer sender;
     private Integer recipient;
     private String subject;
     private String body;
     private Boolean isRead;
     private Boolean isDeletedBySender;
     private Boolean isDeletedByRecipient;
     private Date createdAt;
     private Date updatedAt;

    public Reminders() {
    }

    public Reminders(Integer sender, Integer recipient, String subject, String body, Boolean isRead, Boolean isDeletedBySender, Boolean isDeletedByRecipient, Date createdAt, Date updatedAt) {
       this.sender = sender;
       this.recipient = recipient;
       this.subject = subject;
       this.body = body;
       this.isRead = isRead;
       this.isDeletedBySender = isDeletedBySender;
       this.isDeletedByRecipient = isDeletedByRecipient;
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

    
    @Column(name="sender")
    public Integer getSender() {
        return this.sender;
    }
    
    public void setSender(Integer sender) {
        this.sender = sender;
    }

    
    @Column(name="recipient")
    public Integer getRecipient() {
        return this.recipient;
    }
    
    public void setRecipient(Integer recipient) {
        this.recipient = recipient;
    }

    
    @Column(name="subject")
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    @Column(name="body", length=65535)
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }

    
    @Column(name="is_read")
    public Boolean getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    
    @Column(name="is_deleted_by_sender")
    public Boolean getIsDeletedBySender() {
        return this.isDeletedBySender;
    }
    
    public void setIsDeletedBySender(Boolean isDeletedBySender) {
        this.isDeletedBySender = isDeletedBySender;
    }

    
    @Column(name="is_deleted_by_recipient")
    public Boolean getIsDeletedByRecipient() {
        return this.isDeletedByRecipient;
    }
    
    public void setIsDeletedByRecipient(Boolean isDeletedByRecipient) {
        this.isDeletedByRecipient = isDeletedByRecipient;
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

