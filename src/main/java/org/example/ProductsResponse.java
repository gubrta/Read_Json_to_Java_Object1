package org.example;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class ProductsResponse implements Serializable {
  private Integer total;

  private Integer limit;

  private Integer skip;

  private List<Products> products;

  public Integer getTotal() {
    return this.total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Integer getLimit() {
    return this.limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getSkip() {
    return this.skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public List<Products> getProducts() {
    return this.products;
  }

  public void setProducts(List<Products> products) {
    this.products = products;
  }

  public static class Products implements Serializable {
    private Double discountPercentage;

    private String thumbnail;

    private List<String> images;

    private Integer price;

    private Double rating;

    private String description;

    private Integer id;

    private String title;

    private Integer stock;

    private String category;

    private String brand;

    public Double getDiscountPercentage() {
      return this.discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
      this.discountPercentage = discountPercentage;
    }

    public String getThumbnail() {
      return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
      this.thumbnail = thumbnail;
    }

    public List<String> getImages() {
      return this.images;
    }

    public void setImages(List<String> images) {
      this.images = images;
    }

    public Integer getPrice() {
      return this.price;
    }

    public void setPrice(Integer price) {
      this.price = price;
    }

    public Double getRating() {
      return this.rating;
    }

    public void setRating(Double rating) {
      this.rating = rating;
    }

    public String getDescription() {
      return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getTitle() {
      return this.title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public Integer getStock() {
      return this.stock;
    }

    public void setStock(Integer stock) {
      this.stock = stock;
    }

    public String getCategory() {
      return this.category;
    }

    public void setCategory(String category) {
      this.category = category;
    }

    public String getBrand() {
      return this.brand;
    }

    public void setBrand(String brand) {
      this.brand = brand;
    }
  }
}
