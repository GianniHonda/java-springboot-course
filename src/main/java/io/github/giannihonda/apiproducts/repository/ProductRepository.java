package io.github.giannihonda.apiproducts.repository;

import io.github.giannihonda.apiproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByName(String name);
}
