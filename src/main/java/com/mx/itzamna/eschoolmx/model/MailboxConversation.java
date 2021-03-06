package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MailboxConversation generated by hbm2java
 */
@Entity
@Table(name="mailbox_conversation"
    ,catalog="villaeducativa"
)
public class MailboxConversation  implements java.io.Serializable {


     private Integer conversationId;
     private int initiatorId;
     private int interlocutorId;
     private String subject;
     private byte bmRead;
     private byte bmDeleted;
     private int modified;
     private String isSystem;
     private Boolean initiatorDel;
     private Boolean interlocutorDel;

    public MailboxConversation() {
    }

	
    public MailboxConversation(int initiatorId, int interlocutorId, String subject, byte bmRead, byte bmDeleted, int modified, String isSystem) {
        this.initiatorId = initiatorId;
        this.interlocutorId = interlocutorId;
        this.subject = subject;
        this.bmRead = bmRead;
        this.bmDeleted = bmDeleted;
        this.modified = modified;
        this.isSystem = isSystem;
    }
    public MailboxConversation(int initiatorId, int interlocutorId, String subject, byte bmRead, byte bmDeleted, int modified, String isSystem, Boolean initiatorDel, Boolean interlocutorDel) {
       this.initiatorId = initiatorId;
       this.interlocutorId = interlocutorId;
       this.subject = subject;
       this.bmRead = bmRead;
       this.bmDeleted = bmDeleted;
       this.modified = modified;
       this.isSystem = isSystem;
       this.initiatorDel = initiatorDel;
       this.interlocutorDel = interlocutorDel;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="conversation_id", unique=true, nullable=false)
    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    
    @Column(name="initiator_id", nullable=false)
    public int getInitiatorId() {
        return this.initiatorId;
    }
    
    public void setInitiatorId(int initiatorId) {
        this.initiatorId = initiatorId;
    }

    
    @Column(name="interlocutor_id", nullable=false)
    public int getInterlocutorId() {
        return this.interlocutorId;
    }
    
    public void setInterlocutorId(int interlocutorId) {
        this.interlocutorId = interlocutorId;
    }

    
    @Column(name="subject", nullable=false, length=100)
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    @Column(name="bm_read", nullable=false)
    public byte getBmRead() {
        return this.bmRead;
    }
    
    public void setBmRead(byte bmRead) {
        this.bmRead = bmRead;
    }

    
    @Column(name="bm_deleted", nullable=false)
    public byte getBmDeleted() {
        return this.bmDeleted;
    }
    
    public void setBmDeleted(byte bmDeleted) {
        this.bmDeleted = bmDeleted;
    }

    
    @Column(name="modified", nullable=false)
    public int getModified() {
        return this.modified;
    }
    
    public void setModified(int modified) {
        this.modified = modified;
    }

    
    @Column(name="is_system", nullable=false, length=4)
    public String getIsSystem() {
        return this.isSystem;
    }
    
    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    
    @Column(name="initiator_del")
    public Boolean getInitiatorDel() {
        return this.initiatorDel;
    }
    
    public void setInitiatorDel(Boolean initiatorDel) {
        this.initiatorDel = initiatorDel;
    }

    
    @Column(name="interlocutor_del")
    public Boolean getInterlocutorDel() {
        return this.interlocutorDel;
    }
    
    public void setInterlocutorDel(Boolean interlocutorDel) {
        this.interlocutorDel = interlocutorDel;
    }




}


