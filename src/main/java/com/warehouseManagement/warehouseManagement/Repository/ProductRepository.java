package com.warehouseManagement.warehouseManagement.Repository;

import com.warehouseManagement.warehouseManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
