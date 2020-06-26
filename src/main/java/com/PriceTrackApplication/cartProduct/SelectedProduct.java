package com.PriceTrackApplication.cartProduct;


public class SelectedProduct {
	private String url;
    private String id;
    private String name;
    private int past_price;
    private int user_price;
    
    public SelectedProduct(String url,String id, String name, int past_price,int user_price) {
    	this.url=url;
        this.id = id;
        this.name =name;
        this.past_price =past_price;
        this.user_price =user_price;
    }
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
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


    @Override
    public String toString() {
        return "SelectedFlightDetails{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", past_price='" + past_price + '\'' +"user_price='" + user_price + '\'' +
                '}';
    }

	
}
