package com.netsdevs.springjpahibernate.repository;

import com.netsdevs.springjpahibernate.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod(){
        // create product
        Product product = new Product();
        product.setName("product 11");
        product.setDescription("product 11 description");
        product.setSku("1100ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product11.png");

        // save product
        Product savedObject = productRepository.save(product);

        // display product info
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());

    }

    @Test
    void updateUsingSaveMethod(){

        // find or retrieve an entity by id
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        // update entity information
        product.setName("updated product 1");
        product.setDescription("updated product 1 desc");

        // save updated entity
        productRepository.save(product);
    }

    @Test
    void findByIdMethod(){
        Long id = 3L;

        Product product = productRepository.findById(id).get();
    }

    @Test
    void saveAllMethod(){

        // create product
        Product product = new Product();
        product.setName("product 6");
        product.setDescription("product 6 description");
        product.setSku("600ABCD");
        product.setPrice(new BigDecimal(200));
        product.setActive(true);
        product.setImageUrl("product6.png");

        // create product
        Product product3 = new Product();
        product3.setName("product 7");
        product3.setDescription("product 7 description");
        product3.setSku("700ABCDE");
        product3.setPrice(new BigDecimal(300));
        product3.setActive(true);
        product3.setImageUrl("product7.png");

        productRepository.saveAll(List.of(product, product3));

    }

    @Test
    void findAllMethod(){

        List<Product> products = productRepository.findAll();

        products.forEach((p) -> {
            System.out.println(p.getName());
        });

    }

    @Test
    void deleteByIdMethod() {
        Long id = 3L;
        productRepository.deleteById(id);
    }

    @Test
    void deleteMethod(){

        // find an entity by id
        Long id = 13L;
        Product product = productRepository.findById(id).get();

        // delete(entity)
        productRepository.delete(product);

    }

    @Test
    void deleteAllMethod(){

        // productRepository.deleteAll();

        Product product = productRepository.findById(4L).get();

        Product product1 = productRepository.findById(9L).get();

        productRepository.deleteAll(List.of(product, product1));

    }

    @Test
    void existsByIdMethod(){
        Long id = 3L;

        boolean result = productRepository.existsById(id);

        System.out.println(result);
    }

    @Test
    void countMethod(){
        long count = productRepository.count();
        System.out.println(count);
    }
}