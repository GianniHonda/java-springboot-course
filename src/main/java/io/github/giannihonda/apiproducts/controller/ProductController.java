package io.github.giannihonda.apiproducts.controller;

import io.github.giannihonda.apiproducts.model.Product;
import io.github.giannihonda.apiproducts.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Product received: " + product);

        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable("id") String id){
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") String id, @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
    }
}
