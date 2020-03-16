package com.catalog.shopping.shoppingcatalog.models.interfaces;

import java.io.Serializable;

public interface IProductResponse extends Serializable {
	
	public Long getId();
	public void setId(Long id);
	public String getSku();
	public void setSku(String sku);
	public String getName();
	public void setName(String name);
	public String getDescription();
	public void setDescription(String description);
	public String getItem_size();
	public void setItem_size(String item_size);
	public String getColor();
	public void setColor(String color);
	public Long getPrice();
	public void setPrice(Long price);
	public Long getBrand_id();
	public void setBrand_id(Long brand_id);
	public Long getSeller_id();
	public void setSeller_id(Long seller_id);
	public Long getTotal_count();
	public void setTotal_count(Long total_count);
	public String getStatus();
	public void setStatus(String status);

}
