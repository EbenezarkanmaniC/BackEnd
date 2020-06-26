package com.PriceTrackApplication.ProductHistory;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class ProductDetails {
	private String url;
	private int id;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date date ;
    private String name;
    private int past_price;
    private int user_price;
    private String brand;
    private String color;
    private String catogary;
    public ProductDetails(String url,int id, String name,Date date, int past_price, int user_price, String brand,String color,String catogary) {
        this.url=url;
    	this.id = id;
        this.name = name;
        this.past_price = past_price;
        this.user_price = user_price;
        this.brand=brand;
        this.color=color;
        this.catogary=catogary;
    }
	
	public ProductDetails(String url2, Integer id2, String name2, Integer date2, Integer past_price2,
			Integer user_price2) {
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

   
	public  int getId() {
        return id;
    }

    public void setId(int productCount) {
        this.id = productCount;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPast_price() {
        return past_price;
    }

    public void setPast_price(int past_price) {
        this.past_price = past_price;
    }

    public int getUser_price() {
        return user_price;
    }

    public void setUser_price(int user_price) {
        this.user_price = user_price;
    }

    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCatogory() {
		return catogary;
	}

	public void setCatogory( String catogary) {
		this.catogary = catogary;
	}
    @Override
    public String toString() {
        return "name :"+name + "past_price :"+past_price + "user_price :"+user_price + "brand :"+brand +"color :"+ color+"catogary :"+catogary ;
    }



	

   
    }
