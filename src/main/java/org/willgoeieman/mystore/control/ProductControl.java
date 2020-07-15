package org.willgoeieman.mystore.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.willgoeieman.mystore.entity.Product;
import org.willgoeieman.mystore.service.ProductService;

import java.util.List;

@RestController
public class ProductControl {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable Long id){
        return service.getProductById(id);
    }
    @GetMapping("/productByName/{productName}")
    public Product findProductName(@PathVariable String productName){
        return service.getProductByName(productName);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        return service.deleteProduct(id);
    }
}
