package com.catalog.shopping.shoppingcatalog.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.web.bind.annotation.ResponseBody;

import com.catalog.shopping.shoppingcatalog.dto.interfaces.IProductResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("product")
@ResponseBody
public class ProductResponseDTO implements IProductResponseDTO{
	
	/**
	 * Auto generated SerialVersionUID
	 */
	private static final long serialVersionUID = -6014594574628295389L;
	
	@Id
	@JsonProperty("id")
    private Long id;
	
	@JsonProperty("sku")
    private String sku;
	
	@JsonProperty("name")
    private String name;
	
	@JsonProperty("description")
    private String description;
	
	@JsonProperty("item_size")
    private String item_size;
    
	@JsonProperty("color")
    private String color;
	
	@JsonProperty("price")
    private Long price;
	
	@JsonProperty("brand_id")
    private Long brand_id;
	
	@JsonProperty("seller_id")
    private Long seller_id;
	
	@JsonProperty("total_count")
    private Long total_count;
	
	@JsonProperty("status")
    private String status;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItem_size() {
		return item_size;
	}
	public void setItem_size(String item_size) {
		this.item_size = item_size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	public Long getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(Long seller_id) {
		this.seller_id = seller_id;
	}
	public Long getTotal_count() {
		return total_count;
	}
	public void setTotal_count(Long total_count) {
		this.total_count = total_count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProductResponseDTO [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description
				+ ", item_size=" + item_size + ", color=" + color + ", price=" + price + ", brand_id=" + brand_id
				+ ", seller_id=" + seller_id + ", total_count=" + total_count + ", status=" + status + "]";
	}
    
	
    
	
}
