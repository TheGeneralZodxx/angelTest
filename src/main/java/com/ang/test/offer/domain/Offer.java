package com.ang.test.offer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Offer {

    @Id
    @GeneratedValue
    // 20 characters
    private Long id;
    // Not null
    // 1 integer character, 2 decimal characters
    private BigDecimal discountPct;
    // Not null
    private Date activeFrom;
    // Nullable (Null means that this offer will be valid for undefined time)
    private Date activeUntil;
    @ManyToOne
    // Not null
    // Don't load it unless necessary
    private Product product;
	public Offer(Object object, BigDecimal bigDecimal, Date parse, Date parse2, Product product2) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getDiscountPct() {
		return discountPct;
	}
	public void setDiscountPct(BigDecimal discountPct) {
		this.discountPct = discountPct;
	}
	public Date getActiveFrom() {
		return activeFrom;
	}
	public void setActiveFrom(Date activeFrom) {
		this.activeFrom = activeFrom;
	}
	public Date getActiveUntil() {
		return activeUntil;
	}
	public void setActiveUntil(Date activeUntil) {
		this.activeUntil = activeUntil;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
    
    

}
