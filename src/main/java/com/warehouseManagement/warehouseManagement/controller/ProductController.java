package com.warehouseManagement.warehouseManagement.controller;

import com.warehouseManagement.warehouseManagement.model.Product;
import com.warehouseManagement.warehouseManagement.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("addProduct/{warehouseId}")
    public ResponseEntity<Product> addProduct(@PathVariable Long warehouseId,@RequestBody Product product){
        return productService.addProduct(warehouseId,product);
    }
}
