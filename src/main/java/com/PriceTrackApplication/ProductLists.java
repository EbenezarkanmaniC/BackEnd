package com.PriceTrackApplication;

class product_info{
    String brand;
    String color;
    String catogary;
    public product_info(String brand, String color,String catogary) {
        this.brand = brand;
        this.color = color;
        this.catogary=catogary;
    }
}

public class ProductLists {
	private final int id;
    private final String name;
    private final int past_price;
    private final int user_price;
    

    public ProductLists(int id, String name,int past_price,int user_price) {

        this.id = id;
        this.name = name;
        this.past_price = past_price;
        this.user_price = user_price;
    }

    

	@Override
    public String toString() {
        return "id : "+ id + " name :" + name +"past_price :" +  past_price +"user_price :" +  user_price;
    }

	public static void add1(ProductLists productLists) {
		// TODO Auto-generated method stub
		
	}

	public static void add(ProductLists productLists) {
		// TODO Auto-generated method stub
		
	}
}
