package com.PriceTrackApplication.ProductHistory;


	import com.PriceTrackApplication.ProductHistory.ProductDetails;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	import java.util.List;

	@RestController
	@CrossOrigin(origins = "http://localhost:3000")
	public class ProductDetailsRouteController {
		
	    @Autowired
	    ProductRepository productRepository;

	    @GetMapping("/viewHistory")
	    public List<ProductHistoryDetails> getProductHistory(@RequestParam String url){
	        System.out.println("View Product History  " + url);
	        List<ProductHistoryDetails> history = productRepository.getHistory(url);
	        return history;

	    }
	


}
