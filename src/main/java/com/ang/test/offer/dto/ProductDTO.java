package com.ang.test.offer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    // Not null
    // 150 chars
    // Prevent XSS
    private String name;
    // 10 integer positions, 2 decimal positions
    // No negative
    private BigDecimal price;
	public ProductDTO(Long id2, String name2, BigDecimal price2) {
		this.id = id2;
		this.name = name2;
		this.price = price2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

    
}
