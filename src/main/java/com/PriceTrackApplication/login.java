package com.PriceTrackApplication;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class login {
    @Autowired
    JdbcTemplate jdbcTemplate;
	

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/auth")
          
    //write code to get and insert into db
    

    @GetMapping("/searchproducts")
    public void getProductLists(){

      
        List<ProductLists> productLists = new ArrayList<>();
   
      
       

        System.out.println(productLists.toString());
      //  return ProductLists;
    }
}
