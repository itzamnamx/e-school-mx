package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StoreProduct generated by hbm2java
 */
@Entity
@Table(name="store_product"
    ,catalog="villaeducativa"
)
public class StoreProduct  implements java.io.Serializable {


     private Integer id;
     private String productName;
     private String productBrand;
     private int productQuantity;
     private int CId;
     private int price;
     private int status;

    public StoreProduct() {
    }

    public StoreProduct(String productName, String productBrand, int productQuantity, int CId, int price, int status) {
       this.productName = productName;
       this.productBrand = productBrand;
       this.productQuantity = productQuantity;
       this.CId = CId;
       this.price = price;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="product_name", nullable=false, length=200)
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    @Column(name="product_brand", nullable=false, length=200)
    public String getProductBrand() {
        return this.productBrand;
    }
    
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    
    @Column(name="product_quantity", nullable=false)
    public int getProductQuantity() {
        return this.productQuantity;
    }
    
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    
    @Column(name="c_id", nullable=false)
    public int getCId() {
        return this.CId;
    }
    
    public void setCId(int CId) {
        this.CId = CId;
    }

    
    @Column(name="price", nullable=false)
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    
    @Column(name="status", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }




}

