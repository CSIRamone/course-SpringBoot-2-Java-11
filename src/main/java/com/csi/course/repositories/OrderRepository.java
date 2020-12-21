package com.csi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
