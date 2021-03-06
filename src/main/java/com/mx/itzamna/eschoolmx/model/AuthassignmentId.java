package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthassignmentId generated by hbm2java
 */
@Embeddable
public class AuthassignmentId  implements java.io.Serializable {


     private String itemname;
     private String userid;

    public AuthassignmentId() {
    }

    public AuthassignmentId(String itemname, String userid) {
       this.itemname = itemname;
       this.userid = userid;
    }
   


    @Column(name="itemname", nullable=false, length=64)
    public String getItemname() {
        return this.itemname;
    }
    
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }


    @Column(name="userid", nullable=false, length=64)
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AuthassignmentId) ) return false;
		 AuthassignmentId castOther = ( AuthassignmentId ) other; 
         
		 return ( (this.getItemname()==castOther.getItemname()) || ( this.getItemname()!=null && castOther.getItemname()!=null && this.getItemname().equals(castOther.getItemname()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getItemname() == null ? 0 : this.getItemname().hashCode() );
         result = 37 * result + ( getUserid() == null ? 0 : this.getUserid().hashCode() );
         return result;
   }   


}


