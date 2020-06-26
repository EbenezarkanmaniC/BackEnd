package com.PriceTrackApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@Component
public class ProductServices {
    public static int productCount = 3;
    private static final List<ProductDetails> products = new ArrayList<>();

    static {
        products.add(new ProductDetails(1,"Chennai","Mumbai","12345","700"));
        products.add(new ProductDetails(2,"Delhi","Mumbai","34523","1700"));
        products.add(new ProductDetails(3,"Chennai","Pune","23456","900"));
    }
    public List<ProductDetails> findAll(){
        return products;
    }
    public ProductDetails addNewProduct(ProductDetails product){
        product.setId(++productCount);
        products.add(product);
        return product;
    }

    @Autowired
    private ProductServices productInfo;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/ProductDetails")
    public List<ProductDetails>  retrieveAllProductDetails(){
        System.out.println("product details ");
        return productInfo.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/product",consumes ={MediaType.APPLICATION_JSON_VALUE})

    public ResponseEntity<Object> generateproducts(@RequestBody ProductDetails product){
        System.out.println("product details ");
        ProductDetails newProduct = productInfo.addNewProduct(product);
        System.out.println("product details send to local host:300");
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newProduct.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
