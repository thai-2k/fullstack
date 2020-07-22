package com.example.springboot.restful.fullstackcrudmysqlvujs.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository = null;
    public List<Product> findAll(){return productRepository.findAll();}
    public Optional<Product> findById(Long id){ return productRepository.findById(id); }
    public Product save(Product sock){ return productRepository.save(sock); }
    public void deleteById(Long id){ productRepository.deleteById(id); }
}
