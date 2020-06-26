package com.PriceTrackApplication;


public class ProductDetails {
	private int id;
    private String name;
    private int past_price;
    private int user_price;
    private String brand;
    private String color;
    private String catogary;
    public ProductDetails(int id, String name, int past_price, int user_price, String brand,String color,String catogary) {
        this.id = id;
        this.name = name;
        this.past_price = past_price;
        this.user_price = user_price;
        this.brand=brand;
        this.color=color;
        this.catogary=catogary;
    }

    public ProductDetails(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	
	public  int getId() {
        return id;
    }

    public void setId(int productCount) {
        this.id = productCount;
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
