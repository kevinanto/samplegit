package com.leaning.demokevin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaning.demokevin.Domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
