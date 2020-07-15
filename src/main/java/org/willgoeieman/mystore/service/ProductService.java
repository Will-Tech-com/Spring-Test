package org.willgoeieman.mystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willgoeieman.mystore.entity.Product;
import org.willgoeieman.mystore.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(Long id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String productName){
        return repository.findByProductName(productName);
    }
    public String deleteProduct(Long id){
        repository.deleteById(id);
        return "Product Has Been Removed" + id;
    }
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductPrice(product.getProductPrice());
        existingProduct.setNumberOfStock(product.getNumberOfStock());
        existingProduct.setCategory(product.getCategory());
        return repository.save(existingProduct);
    }
}
