package com.PriceTrackApplication.ProductHistory;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductDetails,String> {

	public List<ProductHistoryDetails> getHistory(String url);

}
