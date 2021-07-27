package one.dio.productcatalog.controllers;

import one.dio.productcatalog.model.Product;
import one.dio.productcatalog.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Long id) {
        return productRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }

}
