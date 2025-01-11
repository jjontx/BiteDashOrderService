package com.bitedash.order.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bitedash.order.entity.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer>{
 }

