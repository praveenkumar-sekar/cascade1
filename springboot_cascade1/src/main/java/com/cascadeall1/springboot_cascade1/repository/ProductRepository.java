package com.Sample.Cascade.repo;

import com.Sample.Cascade.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
