package com.catalog.shopping.shoppingcatalog.models;

import org.springframework.web.bind.annotation.ResponseBody;

import com.catalog.shopping.shoppingcatalog.models.interfaces.IProductResponse;

@ResponseBody
public class ProductResponse implements IProductResponse{
	
	/**
	 * Auto generated serialVersionUID
	 */
	private static final long serialVersionUID = -8785225821085199999L;
	
	
	private Long id;
    private String sku;
    private String name;
    private String description;
    private String item_size;
    private String color;
    private Long price;
    private Long brand_id;
    private Long seller_id;
    private Long total_count;
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
		return "ProductResponse [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description
				+ ", item_size=" + item_size + ", color=" + color + ", price=" + price + ", brand_id=" + brand_id
				+ ", seller_id=" + seller_id + ", total_count=" + total_count + ", status=" + status + "]";
	}
    
    

}
