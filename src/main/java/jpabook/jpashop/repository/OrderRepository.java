package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderSearch;
import jpabook.jpashop.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {




}
