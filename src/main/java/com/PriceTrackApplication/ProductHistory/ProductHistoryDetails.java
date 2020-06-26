package com.PriceTrackApplication.ProductHistory;




public class ProductHistoryDetails {
    private String url;
    private  int  past_price;
    private ProductDetails productHistoryDetails;

    public ProductHistoryDetails(String url,int past_price, ProductDetails productHistoryDetails) {
        this.past_price = past_price;
        this.url=url;
        this.productHistoryDetails = productHistoryDetails;
    }
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

    public int getPast_price() {
        return past_price;
    }

    public void setUserName(int past_price) {
        this.past_price= past_price;
    }

    public ProductDetails getProductHistoryDetails() {
        return productHistoryDetails;
    }

    public void setProductHistoryDetails( ProductDetails productHistoryDetails) {
        this.productHistoryDetails = productHistoryDetails;
    }

    @Override
    public String toString() {
        return "past_price :"+past_price ;
    }

	

	
}
