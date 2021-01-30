package com.csi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
