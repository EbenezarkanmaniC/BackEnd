package com.PriceTrackApplication.cartProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.web.bind.annotation.*;

import com.PriceTrackApplication.ProductHistory.ProductDetails;



@RestController
public class TrackingProductController{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/TrackingProductDetails")

    public ResponseEntity<?> retrieveProductDetails(@RequestParam String url, @RequestParam Integer id ,@RequestParam String name,@RequestParam Integer  date,@RequestParam Integer past_price,@RequestParam Integer user_price){
        System.out.println(url+id+name+date+past_price+user_price);


        String sql = "SELECT url,id,name,date,past_price,user_price FROM Product WHERE url=?,id=?,name=?,date=?,past_price=?,user_price=?";
        ProductDetails product = new ProductDetails(url,id,name,date,past_price,user_price);
        System.out.println(product.getUrl() + product.getId()+ product.getName() + product.getDate() + product.getPast_price() + product.getUser_price());
        try {
            ProductDetails list = jdbcTemplate.queryForObject(sql, new Object[]{product.getUrl() + product.getId()+ product.getName() + product.getDate() + product.getPast_price() + product.getUser_price()}, (rs, rowNum) ->
                    new ProductDetails(
                            rs.getString(1),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getInt(6)
                    ));
            
        }
        catch(Exception e){
            System.out.println("Service interrupted" + e.toString());

            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
	
		return null;

    }


}
