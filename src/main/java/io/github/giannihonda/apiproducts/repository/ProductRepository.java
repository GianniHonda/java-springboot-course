package io.github.giannihonda.apiproducts.repository;

import io.github.giannihonda.apiproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
