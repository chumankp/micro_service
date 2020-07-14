package com.chuman.order.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chuman.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
